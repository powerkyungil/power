package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql_test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		//1.JDBC Driver 로딩하기.
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.DB 서버 접속하기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String password = "hr";
		
		Connection conn = DriverManager.getConnection(url, id, password);
		
		//3. Statement or PreparedStatement 객체 생성하기
		Statement stmt = conn.createStatement();
		
		//4. SQL 실행
		String select1 = "select employee_id, first_name, email, salary from employees where salary between 5000 and 10000";
		String select2 = "select max(salary) MAX from employees where job_id = 'ST_CLERK'";
		String select3 = "select avg(salary) AVG FROM employees where TO_CHAR(hire_date,'mm') in (5)";
		String select4 ="select employee_id, first_name, email, salary from employees where job_id = 'SA_REP' and salary >= 10000";
		
		ResultSet rs1 = stmt.executeQuery(select1);
		
		
		//5. 결과값 받아서 출력하기
		System.out.println("== 급여가 5000에서 10000사이인 사원 목록 ==");
		
		while(rs1.next()) {
		
		String quiz1 = "사원번호 : " + rs1.getInt("employee_id") + "이름 : " + rs1.getString("first_name") + "이메일 : " + rs1.getString("email") + "급여 : " + rs1.getInt("salary");
		System.out.println(quiz1);
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//6. 자원 해제 하기
		if(rs1 != null) rs1.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
			
			
			
	
}
