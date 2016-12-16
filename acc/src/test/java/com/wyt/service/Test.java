package com.wyt.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		//ctx.getBeanDefinitionNames().getClass().getClassLoader().getResourceAsStream(arg0)
		System.out.println(ctx.getBeanDefinitionNames().length);
	}

}
