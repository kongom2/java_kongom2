package co.yedam.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ThrowExe {
	public static void main(String[] args) {
		try {
			dbSerach();
		} catch (ClassNotFoundException | SQLException e) { // or  하위 모두 지우고 Exception
			e.printStackTrace();
		} 

	}
	
	public static void dbSerach() throws ClassNotFoundException,  SQLException { // or  하위 모두 지우고 Exception
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employees");
		while (rs.next()) {
			System.out.println("사원번호: " + rs.getInt("employee_id") + " 이름: " + rs.getString("first_name"));
		}
	}
}
