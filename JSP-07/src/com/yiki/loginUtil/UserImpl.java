package com.yiki.loginUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.yiki.dbutil.DButil;

public class UserImpl {

	public void add(User u) {

		String sql = "insert into user(username,password)value(?,?)";
		Connection con = DButil.open();
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, u.getUsername());
			pstm.setInt(2, u.getPassword());
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.close(con);
		}

	}

	public boolean quer(String name, int password) {
		String sql = "select * from user where username=? and password=?";
		boolean mark = false;
		Connection con = DButil.open();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setLong(2, password);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				mark = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.close(con);
		}
		return mark;

	}

}
