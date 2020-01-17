package study05.plsql_procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class ProcedureTest {
	
	//변수 선언 
 Connection conn;	
 Statement stmt;
 
	public void connect() {

		
		try {
			String url ="jdbc:oracle:thin:@localhost:1521:orcl"; 
			String user="SCOTT";
			String password ="oracle";
			conn  = DriverManager.getConnection(url,user,password);
			
			System.out.println("Connection Success!");
			} catch (SQLException e) {
				
			}
		
	}
	
	
	//저장프로시저 호출전 데이터 입력 
	public void insert() {
		
		try {
			stmt = conn.createStatement();
			String sql ="INSERT INTO member2 VALUES('Alpa','1234','AI',20,'LA','go@ai.com')";
			 int  count = stmt.executeUpdate(sql);
			 
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
			
			String sql ="select * from member2";
			 stmt = conn.createStatement();
			
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
				System.out.print("이름:" + name);
				System.out.print("나이 :" + age);
				System.out.print("주소:" + addr);
				System.out.println("이메일 :" + email);

				
				
			}
			
			}	catch(SQLException e) {
				
				System.out.println("select fail");
				
			}
		
		
	}
	
	//저장프로시저 호출후 데이터 입력 
	public void insertMember() throws SQLException{
		
	
		
		
		
		String id="procedure";
		String pass="1234";
		String name="홍길동";
		int age =19;
		String addr="강원도";
		String email="hong@abc.com";
		
		// statement 대신 사용 프로시저 넘길때  compute_power를 불러오겠다 
		CallableStatement cs = conn.prepareCall("{call newmemeber(?,?,?,?,?,?)}");
		
		cs.setString(1, id);
		cs.setString(2, pass);
		cs.setString(3, name);
		cs.setInt(4,age); // IN OUT 둘다 설정
		cs.setString(5,addr);
		cs.setString(6, email);
		
		cs.execute();
		
		System.out.println("insert success");
		
		
		
		
	}
	
	
	public static void main(String[] args) throws SQLException {
		
		
		ProcedureTest a = new ProcedureTest();
		
		System.out.println("***저장프로시저 호출 전 데이터 ***");
		a.connect();
		a.insert();
		a.connect();
		a.select();
		System.out.println("***저장프로시저 호출 후 데이터 ***");
		a.connect();
		a.insertMember();
		a.connect();
		a.select();
		
		

	}

}
