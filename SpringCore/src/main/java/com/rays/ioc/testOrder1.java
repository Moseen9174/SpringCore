package com.rays.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testOrder1 {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Order.xml");

		Order order = (Order) context.getBean("order");

		order.bookTicket(4);

	}

}
