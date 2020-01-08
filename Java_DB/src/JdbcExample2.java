import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample2 {

	public static void main(String[] args) {
	
		Connection conn = null; // close �ҷ��� ���� ������ �ؾ��Ѵ� 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("db ���� ����");
			String url ="jdbc:oracle:thin:@localhost:1521:orcl"; 
			String user="javadb";
			String password ="oracle";
			//ctrl + space �ڵ��ϼ�
			conn  = DriverManager.getConnection(url,user,password);
		
			}
			catch (ClassNotFoundException e) {
				
				System.out.print("����̹��� �����ϴ�");
			}catch (SQLException e) {
				
				System.out.print("������ �ȵƽ��ϴ�");
			}
			finally {
				System.out.print("DONE");
				
				// close�� ���� ó���ؾ��Ѵ� . 
				try {
					conn.close();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			}
			
			
	}
		

}
