package exam;

import java.util.List;

import dao.UserDao;
import dao.UserDaoImpl;
import dto.User;

public class UserEx {
	public static void main(String[] args) {
		
		UserDao userDao = new UserDaoImpl(); 
		
		// ��ü ���
		List<User> list = userDao.selectAll();
		for( User u : list ) 
			System.out.println(u);
		
		// ���� ����
		User insertUser = new User();
		insertUser.setUserid("A123");
		insertUser.setName("Alice");
		userDao.insertUser(insertUser);
		
		// ���� ��ȸ
		User selectUser = userDao.selectByIdx(20);
		System.out.println(selectUser);
		
		// ���� ����
		userDao.deleteByIdx(20);
//		System.out.println(deleteUser);
		
		// ���� ��ȸ
		User resultUser = userDao.selectByIdx(20);
		System.out.println(resultUser);
		
	}
}














