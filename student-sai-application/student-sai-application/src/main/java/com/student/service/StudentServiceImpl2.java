package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.dto.StudentDto;
import com.student.entity.Student;
import com.student.exceptions.StudentNotFoundException;
import com.student.repository.StudentRepository;

@Profile(value = { "dev", "local", "qa", "prod" })
@Transactional
@Service(value="service2")
public class StudentServiceImpl2 implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String addStudent(Student student) {
		Student studentReponse = studentRepository.save(student);
		if (studentReponse == null) {
			return "Data is not saved";
		}
		return "Data is saved successfully";
	}

	@Override
	public List<Student> getStudents() {
		List<Student> response = studentRepository.findAll();
		if (response == null || response.isEmpty()) {
			throw new StudentNotFoundException("Student records empty");
		}
		return response;
	}

	@Override
	public StudentDto getStudent(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new StudentNotFoundException("Data is not found");
		}
		
		StudentDto dto = new StudentDto();
		dto.setEmail(response.get().getEmail());
		dto.setMobileNumber(response.get().getMobileNumber());
		dto.setName(response.get().getName());
		return dto;
	}

	@Override
	public List<Student> getStudentByName(String name) {
		// List<Student> response = studentRepository.findByName(name);
		List<Student> response = studentRepository.getByName(name);
		if (response == null || response.isEmpty()) {
			throw new StudentNotFoundException("Student records empty");
		}
		return response;
	}

	@Override
	public Student getStudentLogin(String loginId, String password) {
		// Optional<Student> response =
		// studentRepository.findByLoginIdAndPassword(loginId, password);
		Optional<Student> response = studentRepository.getByLoginIdAndPassword(loginId, password);
		if (!response.isPresent()) {
			throw new StudentNotFoundException("Data is not found");
		}
		return response.get();
	}

	@Transactional
	@Override
	public String updateStudents(String name, Integer studentId) {
		studentRepository.updateStudentName(name, studentId);
		return "updated successfully";
	}

	@Override
	public String deleteStudent(Integer studentId) {
		//Student response = getStudent(studentId);
		// studentRepository.delete(response);
		studentRepository.deleteById(studentId);
		return "deleted successfully";
	}

}
