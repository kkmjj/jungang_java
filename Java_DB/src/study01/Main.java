package study01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	Connection conn;	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//ctrl + space �ڵ��ϼ�
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����̹� ���� �ȵ�");
		}
		
	}
	
	public void connect() {

		
		try {
			String url ="jdbc:oracle:thin:@localhost:1521:orcl"; 
			String user="madang";
			String password ="madang";
			conn  = DriverManager.getConnection(url,user,password);
			
			System.out.print("Connection Success!");
			} catch (SQLException e) {
			
				System.out.println("���� �ȵ� ");
			}
		
	}
	
	
	public static void main(String[] args) {
		Main connect =new Main();
		
		connect.connect();

	}

}
