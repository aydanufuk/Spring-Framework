package com.aydan.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aydan/spring/springcore/set/setconfig.xml");
		CarDealer carBean = (CarDealer) ctx.getBean("cardealer");
		System.out.println(carBean.getName());
		System.out.println(carBean.getModels());

	}

}
