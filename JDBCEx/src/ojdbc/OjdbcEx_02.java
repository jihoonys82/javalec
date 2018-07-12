package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcEx_02 {
	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	public static void main(String[] args) {
		
		// Driver load
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = null; // DB connection object
		
		Statement st = null;
		ResultSet rs = null;
		
		String createTbSql = "CREATE TABLE userTest ("
				+ " NO NUMBER CONSTRAINT PK_USER_TEST PRIMARY KEY,"
				+ " NAME VARCHAR2(20) NOT NULL,"
				+ " PHONE VARCHAR2(40) NOT NULL )";
		
		String createSqSql = "CREATE SEQUENCE seq_usertest"
				+ " INCREMENT BY 1"
				+ " START WITH 1";
		
		String sql = "";
		
		try {
			// DB connection
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			// Statement object 
			st = conn.createStatement();
			
			// Execute Query 
			st.execute(createTbSql); // create table
			st.execute(createSqSql); // create sequence
			
			rs = st.executeQuery("SELECT COUNT(*) cnt FROM tabs"
					+ " WHERE table_name='USERTEST'");
			
			rs.next();
			if(rs.getInt("cnt")>0) {
				System.out.println("Table created.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
