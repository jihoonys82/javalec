package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC 
// 1. JDBC driver load
// 2. DB Connection
// 3. SQL query execute 
// 4. Process Result  
// 5. Finalize connection 

public class OjdbcEx {
	public static void main(String[] args) {
		
		// OJDBC driver load 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


		Connection conn = null; // DB connection object
		Statement st = null;
		ResultSet rs = null;
		
		try {
			// DB connection
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", 
					"scott", 
					"tiger");
			
			// SQL execute class 
			// Statement or PreparedStatement 
			st = conn.createStatement();
			
			// SQL execute method
			// execute
			// executeUpdate
			// executeQuery  - SELECT 
			
			// SQL query result receiving Class (SELECT only)
			// ResultSet
			rs = st.executeQuery("SELECT * FROM emp ORDER BY empno");
			
			while(rs.next()) {
				System.out.print(rs.getString("empno"));
				System.out.print(", " +rs.getString("ename"));
				System.out.print(", " +rs.getString("job"));
				System.out.print(", " +rs.getString("mgr"));
				System.out.print(", " +rs.getString("hiredate"));
				System.out.print(", " +rs.getString(6));
				System.out.print(", " +rs.getString(7));
				System.out.println(", " +rs.getString(8));
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
