package exam;

import java.util.List;

import dao.EmpDao;
import dto.Emp;

public class Example {

	public static void main(String[] args) {
		
		EmpDao dao = new EmpDao();
		
		
//		boolean exist = false; 
		
//		for(Emp e : list) {
//			System.out.println(e);
//			if("SMITH".equals(e.getEname())) {
//				exist = true; 
//			}
//		}
		
//		Emp emp = new Emp();
//		emp.setEname("SMITH");
//		boolean result = dao.existEmp(emp);
		// "SELECT COUNT(*) FROM emp WHERE ename="+emp.getEname();
		
		List<Emp> list = dao.getList();
		for(Emp e : list) {
			System.out.println(e);
		}
		
	}

}
