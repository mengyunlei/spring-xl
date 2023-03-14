package com.xl.code.study.myl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MylBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		if ("AService".equals(beanName)) {
//			//System.out.println("初始化前");
//		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		if ("AService".equals(beanName)) {
//			//System.out.println("初始化后");
//		}

		return bean;
	}
}
