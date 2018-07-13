package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBConn;
import dto.Emp;

public class EmpDao {
	// DB ���� ��ü
	private Connection conn = DBConn.getConnection();
	
	public List<Emp> getList() { 
		List<Emp> list = new ArrayList<>();
		
		String sql = "SELECT * FROM emp";

		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			//��� ó��
			while( rs.next() ) {
				Emp emp = new Emp();
				
				emp.setEmpno(rs.getInt("empno"));
				emp.setHiredate(rs.getDate("hiredate"));
				
				list.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public void insertEmp(Emp emp) {
		
	}
	
	public void updateEmp(Emp emp) {
		
	}
}












