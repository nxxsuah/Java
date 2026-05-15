package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 : 2026/05/15	
 * 이름 : 남수아
 * 내용 : Java CRUD 실습 - SQL을 자바에서 활용하기
 */

public class InsertTest {
public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "suah.nam";
		String pass = "1234";		
		
		try {		
			// 1) DB접속
			Connection conn = DriverManager.getConnection(host, user,pass);
			
			// 2) SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			//3) SQL 실행
			String sql = "DELETE FROM User1 WHERE userid ('J101','김유신', '010-1211-1001', 21)";
			stmt.executeUpdate(sql);
			
			//4) SQL 결과처리 (SELECT 작업일 경우)
			
			//5) DB 연결 해제
			stmt.close();
			conn.close();
			
		} catch (Exception e) {			
			e.printStackTrace();
		} 
		System.out.println("Delete 완료...");
	}

}
