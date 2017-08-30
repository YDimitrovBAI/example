package com.example.handler.dto;

import com.example.handler.Visitor;

public class CallDTO extends RequestDTO {

	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public void populate(Visitor v) {
		v.populateResponse(this);
	}
}
