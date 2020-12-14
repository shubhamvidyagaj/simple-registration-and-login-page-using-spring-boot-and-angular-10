package com.app.pojos;

import java.time.LocalDate;
//import java.sql.Date;
//import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.app.deserializer.LocalDateDeserializer;
//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;



@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "username",unique=true)
	private String username;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password",nullable=false)
	private String password;
	
	@Column(name = "birthdate")
	//@JsonDeserialize(using=LocalDateDeserializer.class)
	private  LocalDate birthdate;
	
	@Column(name = "gender")
	private String gender;
	
	@OneToMany(mappedBy = "student",fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Course> courses;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", password="
				+ password + ", birthdate=" + birthdate + ", gender=" + gender + ", courses=" + courses + "]";
	}

	
	
}
