package com.app.gen1.services.impl;

import java.util.*;

import com.app.gen1.model.*;

import com.app.gen1.dao.*;
import com.app.gen1.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class RegisterBillPaymentUsingPOSTImpl implements RegisterBillPaymentUsingPOSTI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public RegisterBillPaymentUsingPOSTResponseWrapper execute(RegisterBillPaymentUsingPOSTP pojo){
		//TODO
		return new RegisterBillPaymentUsingPOSTResponseWrapper();
	}

	public RegisterBillPaymentUsingPOSTResponseWrapper reliable(RegisterBillPaymentUsingPOSTP pojo){
		//TODO
		return new RegisterBillPaymentUsingPOSTResponseWrapper();
	}
}