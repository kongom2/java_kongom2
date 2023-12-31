package co.yedam.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassNotFoundExe {
	public static void main(String[] args) {
		// DB 연결 처리시 예외
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employees");
			while (rs.next()) {
				System.out.println("사원번호: " + rs.getInt("employee_id") + " 이름: " + rs.getString("first_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("end of prog");
	}
}
