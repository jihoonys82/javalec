package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBConn;
import dto.User;

public class UserDaoImpl implements UserDao {
	
	private Connection conn = DBConn.getConnection();
	
	@Override
	public List<User> selectAll() {
		Statement st = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM userTB";
		
		List<User> list = new ArrayList<>();
		User user;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				user = new User();
				user.setIdx(rs.getInt("idx"));
				user.setUserid(rs.getString("userid"));
				user.setName(rs.getString("name"));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public User selectByIdx(int idx) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM userTB WHERE idx=?";		
		User user = new User();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				user.setIdx(rs.getInt("idx"));
				user.setUserid(rs.getString("userid"));
				user.setName(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return user;
	}

	@Override
	public void insertUser(User insertUser) {
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO userTB VALUES (userTb_sq.nextval,?,?)";		
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, insertUser.getUserid());
			pstmt.setString(2, insertUser.getName());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void deleteByIdx(int idx) {
		PreparedStatement pstmt =null;
		String sql = "DELETE userTB WHERE idx = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			try {
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
