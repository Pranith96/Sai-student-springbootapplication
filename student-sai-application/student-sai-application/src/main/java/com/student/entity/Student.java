package com.student.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "student_table")
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Integer studentId;
	@Column(name = "student_name")
	private String name;
	@Column(name = "mobile_number")
	private String mobileNumber;
	@Column(name = "email")
	private String email;
	@Column(name = "login_id", unique = true)
	private String loginId;
	@Column(name = "password")
	private String password;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = College.class)
	@JoinColumn(name = "college_Id")
	private College college;

	@ManyToMany(cascade = CascadeType.ALL, targetEntity = Courses.class)
	@JoinTable(name = "student_course_details", joinColumns = {
			@JoinColumn(name = "student_id") }, inverseJoinColumns = { @JoinColumn(name = "course_id") })
	private List<Courses> courses;
}
