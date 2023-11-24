package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStudent {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

		context.getBean("student");

		Student s1 = (Student) context.getBean("student");

		System.out.println(s1.getStudentId());
		
		System.out.println(s1.getStudentName());
		
		System.out.println(s1.getStudentAddress());
	}
}
