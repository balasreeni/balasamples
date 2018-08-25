package com.app.gen1.services.impl;

import java.util.*;

import com.app.gen1.model.*;

import com.app.gen1.dao.*;
import com.app.gen1.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class GetLoginUsingPOSTImpl implements GetLoginUsingPOSTI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public GetLoginUsingPOSTResponseWrapper execute(GetLoginUsingPOSTP pojo){
		//TODO
		return new GetLoginUsingPOSTResponseWrapper();
	}

	public GetLoginUsingPOSTResponseWrapper reliable(GetLoginUsingPOSTP pojo){
		//TODO
		return new GetLoginUsingPOSTResponseWrapper();
	}
}