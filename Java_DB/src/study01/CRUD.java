package study01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
	
	Connection conn;	
	
	public void connect() {

		
		try {
			String url ="jdbc:oracle:thin:@localhost:1521:orcl"; 
			String user="madang";
			String password ="madang";
			conn  = DriverManager.getConnection(url,user,password);
			
			System.out.println("Connection Success!");
			} catch (SQLException e) {
			
				System.out.println("연결 안됨 ");
			}
		
	}
	
	
	
public void insert() {
		
		
		try {
			Statement st = conn.createStatement();
			String sql ="INSERT INTO member VALUES('aaa', '1111' , '홍길동' , '22' ,  '서울시' ,'a@a.com')";
			 int  count = st.executeUpdate(sql);
			 
			 if(count >0)
			 {
				 System.out.println("insert success!");
			 }
			 else
			 {
				 System.out.println("insert fail!");
			 }
			
			
		}
		catch(SQLException e) {
			System.out.println("insert fail");

		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void select() {
		try {
	
		String sql ="select * from member" ;
		Statement stmt = conn.createStatement();
		
		ResultSet rs =stmt.executeQuery(sql);
		
		while(rs.next())
		{
			String id =rs.getString(1);
			String password =rs.getString(2);
			String name =rs.getString(3);
		    String age =rs.getString(4);
			String addr =rs.getString(5);
			String email =rs.getString(6);
	
			
			System.out.print("아이디 :" + id);
			System.out.print("비밀번호 :" + password);
			System.out.print("이름 :" + name);
			System.out.print("나이 :" + age);
			System.out.print("주소 :" + addr);
			System.out.print("이메일 :" + email);

			
			
		}
		
		}	catch(SQLException e) {
			
			System.out.println("select fail");
			
		}
			
	}
	
	
	public void update() {
		Statement stmt =null;
		try {
			 stmt = conn.createStatement();
			String sql ="update member set addr='부산시' where id='aaa' " ;
		
			int  count =stmt.executeUpdate(sql);	
			if(count >0)
			{
				System.out.print("update success");
			}
			else {
				System.out.print("update FAIL");
				
			}
			
}	catch(SQLException e) {
			
			System.out.println("select fail");
			e.printStackTrace();
			
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void delete() {
		Statement stmt =null;
		
		try {
			stmt =conn.createStatement();
			String sql ="DELETE member WHERE id = 'aaa'";
			int count = stmt.executeUpdate(sql); 
			if(count >0)
			{
				System.out.println("delete success!");
			}
			else
			{
				System.out.println("delete fail!");
			}
		}
		catch(SQLException e)
		{
			System.out.println("delete fail!");
			
		}
		finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		CRUD  crud = new CRUD();
		
		crud.connect();
		crud.insert();
		System.out.println("insert 실행후 ");
		crud.connect();
		crud.select();
		
		
		crud.connect();
		crud.update();
		System.out.println("update 완료 ");
		crud.connect();
		crud.select();
		
		crud.connect();
		crud.delete();
		System.out.println("delete 완료 ");
		crud.connect();
		crud.select();
		
		
	
		

	}
	

}
