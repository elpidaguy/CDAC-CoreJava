package utils;

import java.sql.*;

public class DBUtils {
	// add a static method to ret DB conn
	public static Connection fetchConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3333/test_dac";
		// optional in Java SE
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url, "root", "actscdac");
	}
}
