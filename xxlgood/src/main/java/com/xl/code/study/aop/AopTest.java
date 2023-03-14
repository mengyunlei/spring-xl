package com.xl.code.study.aop;

import com.xl.code.study.advice.ZhouyuBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class AopTest {
	public static void main(String[] args) {
		UserService target = new UserService();

		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(target);
		proxyFactory.addAdvice(new ZhouyuBeforeAdvice());

		UserInterface userService = (UserInterface) proxyFactory.getProxy();
		userService.test();
	}
}
