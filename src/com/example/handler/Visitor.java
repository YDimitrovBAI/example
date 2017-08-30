package com.example.handler;

import com.example.handler.dto.CallDTO;
import com.example.handler.dto.SubscriberDTO;
import com.example.handler.dto.TextDTO;

public interface Visitor {

	void populateResponse(CallDTO call);
	void populateResponse(SubscriberDTO subscriber);
	void populateResponse(TextDTO text);
}
