
public class JdbcExample {

	public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("해당 클래스를 찾을수 없습니다");
		
			
		}
		finally {
			System.out.print("Done");
		}
		
	}

}
