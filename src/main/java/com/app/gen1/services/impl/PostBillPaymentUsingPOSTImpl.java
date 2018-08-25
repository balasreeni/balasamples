package com.app.gen1.services.impl;

import java.util.*;

import com.app.gen1.model.*;

import com.app.gen1.dao.*;
import com.app.gen1.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class PostBillPaymentUsingPOSTImpl implements PostBillPaymentUsingPOSTI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public PostBillPaymentUsingPOSTResponseWrapper execute(PostBillPaymentUsingPOSTP pojo){
		//TODO
		return new PostBillPaymentUsingPOSTResponseWrapper();
	}

	public PostBillPaymentUsingPOSTResponseWrapper reliable(PostBillPaymentUsingPOSTP pojo){
		//TODO
		return new PostBillPaymentUsingPOSTResponseWrapper();
	}
}