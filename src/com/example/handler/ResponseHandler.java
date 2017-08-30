package com.example.handler;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;

import com.example.handler.dto.CallDTO;
import com.example.handler.dto.RequestTypeDTO;
import com.example.handler.dto.ResponseDTO;
import com.example.handler.dto.SubscriberDTO;
import com.example.handler.dto.TextDTO;
import com.example.handler.payload.AddressElement;
import com.example.handler.payload.CallElement;
import com.example.handler.payload.NameElement;
import com.example.handler.payload.Payload;
import com.example.handler.payload.RequestElement;
import com.example.handler.payload.ResponsePayload;
import com.example.handler.payload.SubscriberElement;
import com.example.handler.payload.TelephoneNumberElement;
import com.example.handler.payload.TextElement;
import com.example.handler.payload.TimeRangeElement;

public class ResponseHandler implements Visitor {
	
	private ResponsePayload payload;

	public void populateProductResponse(ResponsePayload payload,
			ResponseDTO responseDto) {
		this.payload = payload;
		
		List<RequestTypeDTO> results = responseDto.getResults();
		for (RequestTypeDTO object : results) {
			if (object != null) {
				object.populate(this);
			}
		}
	}

	@Override
	public void populateResponse(CallDTO call) {
		Payload p = new Payload();
		RequestElement callElement = new CallElement();
		callElement.setOriginating(new TelephoneNumberElement());
		callElement.getOriginating().setNumber(call.getOriginatingNumber());
		callElement.setTerminating(new TelephoneNumberElement());
		callElement.getTerminating().setNumber(call.getTerminatingNumber());
		TimeRangeElement range = new TimeRangeElement();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(call.getTimestamp());
		calendar.add(GregorianCalendar.SECOND, call.getDuration());
		range.setStart(sdf.format(call.getTimestamp()));
		range.setEnd(sdf.format(calendar.getTime()));
		callElement.setTime(range);
		p.setCallElement(callElement);
		payload.addPayload(p);
		payload.setCount(payload.getCount()+ 1);
	}

	@Override
	public void populateResponse(SubscriberDTO subscriber) {
		Payload p = new Payload();
		SubscriberElement subscriberElement = new SubscriberElement();
		NameElement name = new NameElement();
		name.setFirstName(subscriber.getFirstName());
		name.setLastName(subscriber.getLastName());
		subscriberElement.setName(name);
		AddressElement address = new AddressElement();
		address.setPostCode(subscriber.getPostCode());
		subscriberElement.setAddress(address);
		p.setSubscriberElement(subscriberElement);
		payload.addPayload(p);
		payload.setCount(payload.getCount()+ 1);
	}

	@Override
	public void populateResponse(TextDTO text) {
		Payload p = new Payload();
		TextElement textElement = new TextElement();
		textElement.setOriginating(new TelephoneNumberElement());
		textElement.getOriginating().setNumber(text.getOriginatingNumber());
		textElement.setTerminating(new TelephoneNumberElement());
		textElement.getTerminating().setNumber(text.getTerminatingNumber());
		textElement.setText(text.getData());
		TimeRangeElement range = new TimeRangeElement();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		range.setStart(sdf.format(text.getTimestamp()));
		textElement.setTime(range);
		p.setTextElement(textElement);
		payload.addPayload(p);
		payload.setCount(payload.getCount()+ 1);
	}

}
