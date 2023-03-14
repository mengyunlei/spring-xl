package com.xl.code.study.myl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BService {
	@Autowired
	AService aService;

	public BService() {

	}


}
