package com.xl.code.study.myl;

import com.xl.code.study.AppConfig;
import com.xl.code.study.no_1.User;
import com.xl.code.study.no_1.UserService;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MylMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//ApplicationContext context1 = new ClassPathXmlApplicationContext("classpath:spring-test.xml");
//		//AnnotatedBeanDefinitionReader 使用
//		AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(context);
//		// 将User.class解析为BeanDefinition
//		annotatedBeanDefinitionReader.register(User.class);
//		System.out.println(context.getBean("user"));
//
		//DefaultListableBeanFactory 使用
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//		beanDefinition.setBeanClass(User.class);
//		beanFactory.registerBeanDefinition("user", beanDefinition);
//		System.out.println(beanFactory.getBean("user"));

//		MylService mylService = (MylService) context.getBean("mylService");
//		mylService.test();
//		context.refresh();

	}

	@Bean
	public ApplicationListener applicationListener() {
		return new ApplicationListener() {
			public void onApplicationEvent(ApplicationEvent event) {
				System.out.println("接收到了一个事件");
			}
		};
	}
}
