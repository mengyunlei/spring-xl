package com.xl.code.study.aop;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	public void test(){
		System.out.println("test");
	}

	public void a(){
		System.out.println("a");
	}
}
