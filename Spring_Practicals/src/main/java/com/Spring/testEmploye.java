package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testEmploye {

	public static void main(String[] args) {

		ApplicationContext contexct = new ClassPathXmlApplicationContext("EmpCollectionConfig.xml");

		Employe emp = (Employe) contexct.getBean("employe");

		System.out.println(emp.getName());

		System.out.println(emp.getPhones());

		System.out.println(emp.getAddresses());

		System.out.println(emp.getCourses());
	}
}
