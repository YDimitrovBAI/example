package com.example.handler;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.example.handler.ResponseHandler;
import com.example.handler.dto.CallDTO;
import com.example.handler.dto.ResponseDTO;
import com.example.handler.dto.SubscriberDTO;
import com.example.handler.payload.ResponsePayload;

public class ResponseHandlerTestCase {

	@Test
	public void test() {
		ResponseHandler testInstance = new ResponseHandler();
		ResponsePayload payload;
		ResponseDTO responseDto;
		payload = new ResponsePayload();
		responseDto = new ResponseDTO();
		CallDTO callDTO = new CallDTO();
		callDTO.setDuration(10);
		callDTO.setOriginatingNumber("0750075099");
		callDTO.setTerminatingNumber("0752275099");
		callDTO.setTimestamp(new Date());
		responseDto.addResult(callDTO);
		testInstance.populateProductResponse(payload, responseDto);
		Assert.assertEquals(1, payload.getCount());
		SubscriberDTO subscriberDTO = new SubscriberDTO();
		subscriberDTO.setFirstName("Jonh");
		subscriberDTO.setLastName("Dow");
		subscriberDTO.setPostCode("LS1");
		responseDto.addResult(subscriberDTO);
		testInstance.populateProductResponse(payload, responseDto);
		Assert.assertEquals(2, payload.getCount());
	}
}
