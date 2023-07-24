package com.eserciziopt1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringintroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringintroApplication.class, args);
		
		configWith_Beans1();
	}

	public static void configWith_Beans1() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationTest.class);
	
		TestElement t1 = (TestElement) appContext.getBean("test");
		System.out.println(t1);
		System.out.println(t1.info());
	}
}
