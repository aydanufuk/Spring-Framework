package com.aydan.spring.springcore.lc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/aydan/spring/springcore/lc/xmlconfig/config.xml");
		Patient pat = (Patient) ctx.getBean("patient");
		System.out.println(pat);
		System.out.println();
		ctx.registerShutdownHook();

	}

}
