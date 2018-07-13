package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	// DB ���� ����
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";

	private static Connection conn = null; //���ᰴü 

	private DBConn() { } //DBConn ��ü ���� ����

	// Connection ��ü ��ȯ - Singleton Pattern 
	public static Connection getConnection() {
		if( conn == null ) { // DB������ �� �Ǿ����� ���� ����
			try {
				Class.forName(DRIVER); //����̹��ε�
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); //DB����

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return conn; //DB���ᰴü ��ȯ
	}
}
