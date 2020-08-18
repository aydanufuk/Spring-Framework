package com.aydan.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aydan/spring/springcore/list/Listconfig.xml");
		Hospital hospitalBean = (Hospital) ctx.getBean("hospital");
		System.out.println(hospitalBean.getName());
		System.out.println(hospitalBean.getDepartments());
				

	}

}
