package com.lti.training.dto;

public class customerDto {

	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String contact;

	public customerDto() {
		super();
	}

	public customerDto(String firstname, String lastname, String email, String password, String contact) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.contact = contact;
		
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getLastname() {
		return lastname;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmail() {
		return email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getPassword() {
		return password;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContact() {
		return contact;
	}

	
	

}