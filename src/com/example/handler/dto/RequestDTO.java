package com.example.handler.dto;

import java.util.Date;

public abstract class RequestDTO implements RequestTypeDTO {

	private String originatingNumber;

	private String terminatingNumber;

	private Date timestamp;

	public String getOriginatingNumber() {
		return originatingNumber;
	}

	public void setOriginatingNumber(String originatingNumber) {
		this.originatingNumber = originatingNumber;
	}

	public String getTerminatingNumber() {
		return terminatingNumber;
	}

	public void setTerminatingNumber(String terminatingNumber) {
		this.terminatingNumber = terminatingNumber;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}