package com.techlabs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techlabs.dto.StudentService;
import com.techlabs.entity.Student;

@Controller
public class StudentController {
	@Autowired
	StudentService service;

	@RequestMapping(value = "/students/all", method = RequestMethod.GET)
	public @ResponseBody List<Student> getAllStudentList(
			HttpServletRequest req, HttpServletResponse resp) {

		return service.getStudentList();

	}

	@RequestMapping(value = "/students/{rollNo}", method = RequestMethod.GET)
	public @ResponseBody Student getStudentById(
			@PathVariable("rollNo") int rollNo) {
		return service.getStudentByRollNo(rollNo);

	}

	@RequestMapping(value = "/students/{rollNo}", method = RequestMethod.DELETE)
	public @ResponseBody void deleteStudentById(
			@PathVariable("rollNo") int rollNo) {
		service.deleteStudentByRollNo(rollNo);

	}

	@RequestMapping(value = "/students/addStudent", method = RequestMethod.POST)
	public @ResponseBody boolean addStudent(@RequestBody Student student) {

		service.addStudentToList(student);
		return true;
	}

	@RequestMapping(value = "/students/{rollNo}", method = RequestMethod.PUT)
	public @ResponseBody boolean updateStudent(@RequestBody Student student,
			@PathVariable("rollNo") int rollNo) {
		service.updateStudent(rollNo,student);
		return true;
	}

}
