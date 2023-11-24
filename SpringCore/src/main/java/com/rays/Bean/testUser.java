package com.rays.Bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class testUser {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("UserConfig.xml"));

		User bean = (User) factory.getBean("User");

		System.out.println(bean.getLogin());
		System.out.println(bean.getPassword());

	}
}
