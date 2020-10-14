package com.sopra.challenge.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String sopraEmail;
	private String contactNumber;
	private String interests;
	private String joiningDate;
	
	public User(String id, String firstName, String lastName, String sopraEmail, String contactNumber, String interests,
			String joiningDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sopraEmail = sopraEmail;
		this.contactNumber = contactNumber;
		this.interests = interests;
		this.joiningDate = joiningDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getSopraEmail() {
		return sopraEmail;
	}

	public void setSopraEmail(String sopraEmail) {
		this.sopraEmail = sopraEmail;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	
}
