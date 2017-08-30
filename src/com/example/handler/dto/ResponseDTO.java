package com.example.handler.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseDTO {

	private List<RequestTypeDTO> results = new ArrayList<RequestTypeDTO>();
	
	public List<RequestTypeDTO> getResults() {
		return this.results;
	}
	
	public void addResult(RequestTypeDTO object) {
		this.results.add(object);
	}
}
