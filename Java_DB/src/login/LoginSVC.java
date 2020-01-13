package mvc;

import java.sql.*;
import java.util.ArrayList;

// DAO -> DATA Acess Object 

public class SAMPLEDAO {
	

public ArrayList<SAMPLEDTO> findALL() {
	
		ArrayList<SAMPLEDTO> list = new ArrayList<SAMPLEDTO>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// 드라이버 없음 
			System.out.println("드라이버 없음");
			e.printStackTrace();
		}
		
		String url ="jdbc:oracle:thin:@localhost:1521:orcl"; 
		String user="javadb";
		String password ="oracle";
		try {
			Connection  conn  = DriverManager.getConnection(url,user,password);
			Statement stmt = conn.createStatement();
			String sql ="select * from book";
			ResultSet  rs =stmt.executeQuery(sql);
			
			while(rs.next())
			{
				SAMPLEDTO DTO = new SAMPLEDTO();
				DTO.setId(rs.getString(1));
				DTO.setName(rs.getString(2));
				DTO.setPrice(rs.getInt(3));
		
				
				list.add(DTO);
				
				
				
				
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	
	}



}
