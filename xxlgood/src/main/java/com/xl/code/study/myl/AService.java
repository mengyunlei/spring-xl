package com.xl.code.study.myl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AService {
	@Autowired
	BService bService;

	public AService() {

	}

	public void test(){
		System.out.println("test");
	}


}
