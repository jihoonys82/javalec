package dao;

import java.util.List;

import dto.User;

public interface UserDao {
	// UserTB ��ü ��ȸ
	//	idx ����
	public List<User> selectAll();
	
	// idx�� �̿��� UserTB ��ȸ - 1��
	public User selectByIdx(int idx);

	// User ����
	public void insertUser(User insertUser);
	
	// idx�� �̿��� UserTb ����
	public void deleteByIdx(int idx);
	
}
