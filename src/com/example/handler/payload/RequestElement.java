package com.example.handler.payload;

public class RequestElement {

	TelephoneNumberElement originating;
	
	TelephoneNumberElement terminating;
	
	TimeRangeElement time;

	public TelephoneNumberElement getOriginating() {
		return originating;
	}

	public void setOriginating(TelephoneNumberElement originating) {
		this.originating = originating;
	}

	public TelephoneNumberElement getTerminating() {
		return terminating;
	}

	public void setTerminating(TelephoneNumberElement terminating) {
		this.terminating = terminating;
	}

	public TimeRangeElement getTime() {
		return time;
	}

	public void setTime(TimeRangeElement timeRangeElement) {
		this.time = timeRangeElement;
	}
}