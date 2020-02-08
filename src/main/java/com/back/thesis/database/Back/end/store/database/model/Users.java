package com.back.thesis.database.Back.end.store.database.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class Users implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String username;
	@Column
//	@JsonIgnore
	private String password;
	@Column
	private String role;
	@Column
	private boolean activate;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String yearOfStudies;
	@Column
	private String owesLessons;
	@Column
	private String address;
	@Column
	private String phone;

//	@OneToOne(fetch = FetchType.LAZY,
//			cascade =  CascadeType.ALL,
//			mappedBy = "user")
//	private Thesis thesis;

	public Users() {
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



//	public Thesis getThesis() {
//		return thesis;
//	}
//
//	public void setThesis(Thesis thesis) {
//		this.thesis = thesis;
//	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isActivate() {
		return activate;
	}

	public void setActivate(boolean activate) {
		this.activate = activate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getYearOfStudies() {
		return yearOfStudies;
	}

	public void setYearOfStudies(String yearOfStudies) {
		this.yearOfStudies = yearOfStudies;
	}

	public String getOwesLessons() {
		return owesLessons;
	}

	public void setOwesLessons(String owesLessons) {
		this.owesLessons = owesLessons;
	}

	@Override
	public String toString() {
		return "Users{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", role='" + role + '\'' +
				", activate=" + activate +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", yearOfStudies='" + yearOfStudies + '\'' +
				", owesLessons='" + owesLessons + '\'' +
				", address='" + address + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}
}