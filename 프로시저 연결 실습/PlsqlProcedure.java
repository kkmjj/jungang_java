package plsql_procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class PlsqlProcedure {

	public static void main(String[] args) throws SQLException {
		
		// 프로시저 가져오기 
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); // throws sqlexception 
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = DriverManager.getConnection(url,"SCOTT","oracle"); // oracle 연결
		
		int p1InValue = Integer.parseInt(args[0]);   // 문자열을 숫자로 변환
		int p2InOutValue = Integer.parseInt(args[1]);   // 문자열을 숫자로 변환
		// 프로시저의 a b 값을 받아서 사용 
		int p3OutValue; // 받아온 값 
		
		// statement 대신 사용 프로시저 넘길때  compute_power를 불러오겠다 
		CallableStatement cs = con.prepareCall("{call compute_power(?,?,?)}");
		
		cs.setInt(1,p1InValue);
		cs.setInt(2,p2InOutValue); // IN OUT 둘다 설정
		cs.registerOutParameter(2, Types.INTEGER); //IN OUT 둘다 설정
		cs.registerOutParameter(3, Types.INTEGER); // OUT
		
		cs.execute();
		
		p2InOutValue = cs.getInt(2);  // 날라온 값을 저장 
		p3OutValue = cs.getInt(3);
		
		
		System.out.println(p1InValue+"^"+p2InOutValue+"="+p3OutValue);
		
		
		
		
		
		
		
		
		

	}

}
