package ojdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcEx_03 {

	public static void main(String[] args) {
		
		Connection conn = DBConn.getConnection();
		
		Statement st = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM dept";
				
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print(rs.getInt("deptno"));
				System.out.print(", " + rs.getString("dname"));
				System.out.println(", " + rs.getString("loc"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
