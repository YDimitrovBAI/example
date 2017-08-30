package com.example.handler.dto;

import com.example.handler.Visitor;

public class TextDTO extends RequestDTO {

	private String data;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public void populate(Visitor v) {
		v.populateResponse(this);
	}
}
