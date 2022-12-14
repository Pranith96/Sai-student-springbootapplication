package com.student.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	// List<Student> findByName(String name);

	// Optional<Student> findByLoginIdAndPassword(String loginId, String password);

	// @Query("select s from Student s where s.name=:name1")
	// List<Student> getByName(String name1);

	// @Query("select s from Student s where s.loginId=:loginId and
	// s.password=:password")
	// Optional<Student> getByLoginIdAndPassword(String loginId, String password);

	@Query(value = "select * from student_table where login_id=:loginId and password=:password", nativeQuery = true)
	Optional<Student> getByLoginIdAndPassword(String loginId, String password);

	@Query(value = "select * from student_table where student_name=:name", nativeQuery = true)
	List<Student> getByName(String name);

	@Modifying
	@Query("update Student s set s.name=:name where s.studentId=:studentId")
	void updateStudentName(String name, Integer studentId);

}
