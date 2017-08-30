package com.example.handler.payload;

public class Payload {

    private RequestElement callElement;
	
	private TextElement textElement;
	
	private SubscriberElement subscriberElement;

	public RequestElement getCallElement() {
		return callElement;
	}

	public void setCallElement(RequestElement callElement) {
		this.callElement = callElement;
	}

	public TextElement getTextElement() {
		return textElement;
	}

	public void setTextElement(TextElement textElement) {
		this.textElement = textElement;
	}

	public SubscriberElement getSubscriberElement() {
		return subscriberElement;
	}

	public void setSubscriberElement(SubscriberElement subscriberElement) {
		this.subscriberElement = subscriberElement;
	}
}
