package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<String> createStudent(@RequestBody Student student) {
		String response = studentService.addStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/get-all")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> response = studentService.getStudents();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/{studentId}")
	public ResponseEntity<Student> getStudents(@PathVariable("studentId") Integer studentId) {
		Student response = studentService.getStudent(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/id")
	public ResponseEntity<Student> getStudentById(@RequestParam("studentId") Integer studentId) {
		Student response = studentService.getStudent(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/name/{name}")
	public ResponseEntity<List<Student>> getStudentByName(@PathVariable("name") String name) {
		List<Student> response = studentService.getStudentByName(name);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/login/{loginId}/{password}")
	public ResponseEntity<Student> getStudentLogin(@PathVariable("loginId") String loginId,
			@PathVariable("password") String password) {
		Student response = studentService.getStudentLogin(loginId, password);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PutMapping("/update/{name}/{studentId}")
	public ResponseEntity<String> updateStudents(@PathVariable("name") String name,
			@PathVariable("studentId") Integer studentId) {
		String response = studentService.updateStudents(name,studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<String> deleteStudent(@PathVariable("studentId") Integer studentId) {
		String response = studentService.deleteStudent(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}