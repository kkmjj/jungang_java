import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample2 {

	public static void main(String[] args) {
	
		Connection conn = null; // close 할려면 전역 변수로 해야한다 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("db 연결 성공");
			String url ="jdbc:oracle:thin:@localhost:1521:orcl"; 
			String user="javadb";
			String password ="oracle";
			//ctrl + space 자동완성
			conn  = DriverManager.getConnection(url,user,password);
		
			}
			catch (ClassNotFoundException e) {
				
				System.out.print("드라이버가 없습니다");
			}catch (SQLException e) {
				
				System.out.print("연결이 안됐습니다");
			}
			finally {
				System.out.print("DONE");
				
				// close도 예외 처리해야한다 . 
				try {
					conn.close();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			}
			
			
	}
		

}
