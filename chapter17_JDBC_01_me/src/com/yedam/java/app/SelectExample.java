package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. JDBC Driver 로딩하기.
		Class.forName("oracle.jdbc.driver.OracleDriver");	 
				
		// 2. DB 서버 접속하기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String password = "hr";
		
		Connection conn = DriverManager.getConnection(url, id, password);
		
		// 3. Statement or PreparedStatement 객체 생성하기
		Statement stmt = conn.createStatement();
		
		// 4. SQL 실행
		ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
		
		// 5. 결과값 받아서 출력하기
		while(rs.next()) {
			String name = "이름 : " + rs.getString("First_name");
			System.out.println(name);
		}
		
		// 6. 자원 해제 하기
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();    //실행한 역순으로 해제함
	}
	// private Lis<Board> list = null;
	// public List<Board> getBoardList(){
	//		list = new ArrayList<>();
	//		list.add(new Board("제목1", "내용1"));
	
	
	// public int hashCode() {
	//	 	return StudentNum);
	
	// public boolean equals(Object obj){
	//  if(obj intanceof Student) {
	//		Student student = (Student) obj
	//		if(student.studentNum == studentNum) {
	//			//return true; } return false; }
	// return super.equals(obj);
	
	Set<String> keySet = map.keySet();
	for(String key : keySet) {
		Integer value = map.get(key);
		if(value > maxScore) {
			maxScore = value;
			name = key;
		}
		totalScore +=value;
	}
	int avgScore = totalScore / map.size();
	System.out.println("평균 점수: " + avgScore);
	System.out.println("최고 점수: " + maxScore);
	System.out.println("최고점수를 받은 아이디: " + name;

}
