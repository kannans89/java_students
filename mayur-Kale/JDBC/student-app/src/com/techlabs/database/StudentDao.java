package com.techlabs.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;
import com.techlabs.student.Student;

public class StudentDao {
	private Connection conn;
	private Statement statement;

	public StudentDao() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		conn = (Connection) DriverManager.getConnection(
				"jdbc:mysql://localhost/techlabs", "root", "root");
		statement = (Statement) conn.createStatement();

	}

	public void close() throws SQLException {

		conn.close();

	}

	public void addStudent(Student student) throws SQLException {

		statement.executeUpdate("INSERT INTO STUDENT VALUES("
				+ student.getRollNo() + ",'" + student.getName() + "',"
				+ student.getAge() + ")");

	}

	public List<Student> getStudents() throws SQLException {
		List<Student> studentList = new ArrayList<Student>();

		ResultSet resultSet = statement.executeQuery("select * from student");
		while (resultSet.next()) {
			studentList.add(new Student(resultSet.getInt("rollNo"), resultSet
					.getString("name"), resultSet.getInt("age")));
		}

		return studentList;
	}
}
