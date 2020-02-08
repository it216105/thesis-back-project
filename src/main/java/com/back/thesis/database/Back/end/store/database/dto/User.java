package com.back.thesis.database.Back.end.store.database.dto;

import javax.persistence.Column;

public class User {

	private long id;
	private String username;
	private String password;
	private String role;
	private boolean activate;
	private String firstName;
	private String lastName;
	private String yearOfStudies;
	private String owesLessons;
	private String address;
	private String phone;

	public User() {
	}

	public User(long id, String username, String password, String role, boolean activate, String firstName, String lastName, String yearOfStudies, String owesLessons, String address, String phone) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.activate = activate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfStudies = yearOfStudies;
		this.owesLessons = owesLessons;
		this.address = address;
		this.phone = phone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isActivate() {
		return activate;
	}

	public void setActivate(boolean activate) {
		this.activate = activate;
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
}