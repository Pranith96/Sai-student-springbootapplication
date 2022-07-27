package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	String addStudent(Student student);

	List<Student> getStudents();

	Student getStudent(Integer studentId);

	List<Student> getStudentByName(String name);

	Student getStudentLogin(String loginId, String password);

	String updateStudents(String name, Integer studentId);

	String deleteStudent(Integer studentId);

}
