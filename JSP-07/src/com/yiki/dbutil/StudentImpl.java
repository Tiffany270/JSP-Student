package com.yiki.dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentImpl  {
	public void add(Student s) {
		
		String sql = "insert into student(name,age)value(?,?)";
		Connection con = DButil.open();
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, s.getName());
			pstm.setInt(2, s.getAge());
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.close(con);
		}

	}

	public void delete(int id) {
		String sql = "delete from student where id = ?";
		Connection con = DButil.open();
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.close(con);
		}
	}

	public Student getSbyID(int id) {
		String sql = "select * from student where id=?";
		Connection con = DButil.open();
		Student s = new Student();
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				String name = rs.getString(2);
				int age = rs.getInt(3);
				s.setId(id);
				s.setName(name);
				s.setAge(age);

			}
			return s;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.close(con);
		}

		return null;
	}

	public List<Student> query() {
		String sql = "select * from student";
		Connection con = DButil.open();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			List<Student> list = new ArrayList<Student>();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				Student s = new Student();
				s.setId(id);
				s.setName(name);
				s.setAge(age);
				list.add(s);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.close(con);
		}

		return null;
	}

	public void Update(Student s) {
		String sql = "Update student set name=?,age=? where id=?";
		Connection con = DButil.open();
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, s.getName());
			pstm.setInt(2, s.getAge());
			pstm.setInt(3, s.getId());
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.close(con);
		}

	}

	public int findCount() {
		int count = 0;
		Connection conn = DButil.open();
		String sql = "select count(*) from student";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				count = rs.getInt(1);
			}
			rs.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count; // 返回总记录数
	}

	public List<Student> find(int page) {//分页用的查看
		List<Student> list = new ArrayList<Student>();
		Connection con = DButil.open();
		String sql = "select* from student order by id desc limit ?,?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, (page - 1) * Student.PAGE_SIZE);
			ps.setInt(2, Student.PAGE_SIZE);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student p = new Student();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setAge(rs.getInt("age"));
				list.add(p);
			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.close(con);
		}
		return list;
	}
}
