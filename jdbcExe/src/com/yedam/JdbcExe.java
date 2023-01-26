package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExe {
	public static void main(String[] args) {
		// jdbc 오라클 데이터 CRUD작업
		// 1. ojdbc.jar
		
		// 2. Connection 객체. db연결 쿼리실행 or 실행결과 통로
		Connection conn; // db연결
		Statement stmt = null; // 쿼리를 해석해서 실행하고 처리결과를 받아오는 객체
		ResultSet rs = null; // 쿼리 실행결과를 받아오는 객체 (★★ Set 컬렉션임)
		
		// sysdate : 현재 날짜를 반환
		String sql = "insert into employees (employee_id, job_id, last_name, email, hire_date) values (300, 'IT_PROG', '홍', 'HONG', sysdate)";
		
		// 삭제 : delete
		// sql = "delete from employees where employee_id=300";
		
		// 300번의 first_name 길동으로 지정"
		sql = "update employees set first_name='길동' where employee_id=300";
		
		// jdbc driver 가져오기 => 정상
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 에러");
			e.printStackTrace();
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // @ip:포트:id(오라클db)
		String user = "hr";
		String pass = "hr";
		
		try {
			conn = DriverManager.getConnection(url, user, pass); // DB연결 (요청 url , id , password) 
			System.out.println("연결성공!!");
			
			// 쿼리를 해석해서 실행하고 처리결과를 받아오는 객체
			stmt = conn.createStatement();
			
			// executeUpdate() : insert, update, delete할 때 사용
			int r = stmt.executeUpdate(sql);
			
			
			// 쿼리 실행결과 : ResultSet 객체를 반환 / ResultSet은 ★★ Set컬렉션임 , executeQuery() : select
			rs = stmt.executeQuery("select * from employees order by employee_id"); 
			
			while(rs.next()) {
				
				// getInt("칼럼명") 가져온 데이터를 int타입으로 가지고 오겠다는말
				// getString("칼럼명") 가져온 데이터를 String타입으로 가지고 오겠다는말
				// 한 행에 대한 정보를 가지고옴
				System.out.println("사원번호: " + rs.getInt("employee_id") + ", 이름: " + rs.getString("first_name") +
								   ", 이메일: " + rs.getString("email") + ", 급여: " + rs.getInt("salary")); 
				
			}
			
			System.out.println("end of records");
			
		} catch (SQLException e) {
			System.out.println("처리실패!!");
			e.printStackTrace();
		}
		
		
		
	}
}
