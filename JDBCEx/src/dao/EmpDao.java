package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.Emp;
import ojdbc.DBConn;

public class EmpDao {
	// DB connection 
	private Connection conn = DBConn.getConnection();
	
	
	public List<Emp> getList(){
		List<Emp> list = new ArrayList<>();
		String sql = "SELECT * FROM emp";
		
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			Emp emp;
			
			while(rs.next()) {
				emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				
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
