package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	
	private static Connection conn = null; 
	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	
	
	public static Connection getConnection() {
		if(conn == null) {
			try {
				Class.forName(DRIVER); // driver loading 
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); //db connection
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		return conn; // return DB connection instance
	}
	
	private DBConn() {
	}
}
