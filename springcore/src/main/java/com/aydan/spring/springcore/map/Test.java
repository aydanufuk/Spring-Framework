package com.aydan.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aydan/spring/springcore/map/config.xml");
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println(customer);
		System.out.println();

	}

}
