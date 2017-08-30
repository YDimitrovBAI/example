package com.example.handler.payload;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ResponsePayload {

	private int status;
	
	private int count;
	
	private List<Payload> payloads = new ArrayList<Payload>();

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void addPayload(final Payload payload) {
		this.payloads.add(payload);
	}
	
	public Iterator<Payload> payloads() {
		return this.payloads.iterator();
	}
}
