package com.xl.code.study.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MylAspect {
	@Before("execution(public void com.xl.code.study.aop.UserService.test())")
	public void zhouyuBefore(JoinPoint joinPoint) {
		System.out.println("mylBefore");
	}

	@Before("execution(public void com.xl.code.study.myl.AService.test())")
	public void aBefore(JoinPoint joinPoint) {
		System.out.println("aBefore");
	}
}
