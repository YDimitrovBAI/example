package com.example.handler.dto;

import com.example.handler.Visitor;

public class SubscriberDTO implements RequestTypeDTO {

	private String firstName;
	
	private String lastName;
	
	private String postCode;

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

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public void populate(Visitor v) {
		v.populateResponse(this);
	}
}
