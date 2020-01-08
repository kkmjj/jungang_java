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
			
				System.out.println("���� �ȵ� ");
			}
		
	}
	
	
	
public void insert() {
		
		
		try {
			Statement st = conn.createStatement();
			String sql ="INSERT INTO member VALUES('aaa', '1111' , 'ȫ�浿' , '22' ,  '�����' ,'a@a.com')";
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
	
			
			System.out.print("���̵� :" + id);
			System.out.print("��й�ȣ :" + password);
			System.out.print("�̸� :" + name);
			System.out.print("���� :" + age);
			System.out.print("�ּ� :" + addr);
			System.out.print("�̸��� :" + email);

			
			
		}
		
		}	catch(SQLException e) {
			
			System.out.println("select fail");
			
		}
			
	}
	
	
	public void update() {
		Statement stmt =null;
		try {
			 stmt = conn.createStatement();
			String sql ="update member set addr='�λ��' where id='aaa' " ;
		
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
		System.out.println("insert ������ ");
		crud.connect();
		crud.select();
		
		
		crud.connect();
		crud.update();
		System.out.println("update �Ϸ� ");
		crud.connect();
		crud.select();
		
		crud.connect();
		crud.delete();
		System.out.println("delete �Ϸ� ");
		crud.connect();
		crud.select();
		
		
	
		

	}
	

}
