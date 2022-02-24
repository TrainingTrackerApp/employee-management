package in.capgemini.tracker.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
	private static final String className = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/empdb";
	private String username= "root";
	private String password = "root";
	private PreparedStatement pstmt=null;
	private Connection conn=null;

	static {
		try {
			@SuppressWarnings("rawtypes")
			Class a = Class.forName(className); 
			System.out.println(a);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private Connection connect() {
		try {
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public PreparedStatement preparedstatement(String sql) {
		try {
			pstmt = connect().prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	public void closePreparedStatement() {
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void update(Integer id, String employeeIdentifier) {
		// TODO Auto-generated method stub
		
	}

}
