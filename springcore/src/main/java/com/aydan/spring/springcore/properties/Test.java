package com.aydan.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/aydan/spring/springcore/properties/config.xml");
		CountriesAndLanguages cl = (CountriesAndLanguages) ctx.getBean("countriesAndLangs");
		System.out.println(cl);
		System.out.println();

	}

}
