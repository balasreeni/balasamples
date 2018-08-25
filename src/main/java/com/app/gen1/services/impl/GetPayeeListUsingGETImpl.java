package com.app.gen1.services.impl;

import java.util.*;

import com.app.gen1.model.*;

import com.app.gen1.dao.*;
import com.app.gen1.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class GetPayeeListUsingGETImpl implements GetPayeeListUsingGETI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public GetPayeeListUsingGETResponseWrapper execute(GetPayeeListUsingGETP pojo){
		//TODO
		return new GetPayeeListUsingGETResponseWrapper();
	}

	public GetPayeeListUsingGETResponseWrapper reliable(GetPayeeListUsingGETP pojo){
		//TODO
		return new GetPayeeListUsingGETResponseWrapper();
	}
}