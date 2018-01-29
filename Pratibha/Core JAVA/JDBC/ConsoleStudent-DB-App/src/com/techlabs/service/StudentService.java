package com.techlabs.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.dao.StudentDao;
import com.techlabs.model.Student;

public class StudentService {
	private StudentDao dao;
	private Connection con;
	List<Student> list;
public StudentService(){
	dao = StudentDao.getInstance();
	con = (Connection) dao.getConnection();
	list = new ArrayList<Student>();
}
	public List<Student> getList() {
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			ps = (PreparedStatement) con.prepareStatement("select * from Studentst ");
			rs = ps.executeQuery();

			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setEmail(rs.getString(3));
				student.setGender(rs.getString(4));
				student.setAddress(rs.getString(5));
				student.setContact(rs.getString(6));
				list.add(student);


			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public void addStudent(Student student) {
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			ps = (PreparedStatement) con
					.prepareStatement("insert into Studentst(Name,Email,Gender,Address,Contact) "
							+ "values(?,?,?,?,?)");
			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getGender());
			ps.setString(4, student.getAddress());
			ps.setString(5, student.getContact());

			ps.execute();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Student getStudent(int id) {
		PreparedStatement ps;
		ResultSet rs = null;
		Student student = new Student();
		try {
			ps = (PreparedStatement) con
					.prepareStatement("select * from Studentst where ID=" + id);
			rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
						+ rs.getString(3) + " " + rs.getString(4) + " "
						+ rs.getString(5));
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setEmail(rs.getString(3));
				student.setGender(rs.getString(4));
				student.setAddress(rs.getString(5));
				student.setContact(rs.getString(6));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	public void editStudent(Student student) {
		PreparedStatement ps;

		try {
			ps = (PreparedStatement) con
					.prepareStatement("UPDATE Studentst SET Name=?,Email=?,"
							+ "Gender=?,Address=?,Contact=? where ID=?");
			ps.setInt(6, student.getId());
			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getGender());
			ps.setString(4, student.getAddress());
			ps.setString(5, student.getContact());

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteStudent(int id) {
		PreparedStatement ps;
		
		try {
			ps = (PreparedStatement) con
					.prepareStatement("delete from Studentst where ID = ?");
			ps.setInt(1, id);

			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
