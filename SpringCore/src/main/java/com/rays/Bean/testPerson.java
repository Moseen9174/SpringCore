package com.rays.Bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class testPerson {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("personConfig.xml"));

		Person bean = (Person) factory.getBean("person");

		System.out.println(bean.getId());
		
		System.out.println(bean.getName());
		
		System.out.println(bean.getSalary());

	}

}
