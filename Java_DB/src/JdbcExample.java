
public class JdbcExample {

	public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("�ش� Ŭ������ ã���� �����ϴ�");
		
			
		}
		finally {
			System.out.print("Done");
		}
		
	}

}
