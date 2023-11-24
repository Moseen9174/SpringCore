package com.rays.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMultiple {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("multiple.xml");

		User user1 = (User) context.getBean("User");  //contexct.getBean(User.class);
		
		Person person1 = (Person) context.getBean("person");  //contexct.getBean(Person.class);
	
		
		System.out.println(user1.getLogin());
		System.out.println(user1.getPassword());
		
		System.out.println(person1.getId());
		System.out.println(person1.getName());
		System.out.println(person1.getSalary());
	
	}

}
