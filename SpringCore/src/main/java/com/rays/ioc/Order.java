package com.rays.ioc;

public class Order {

	private Payment payment;
	private Inventory inventory;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public void bookTicket(int item) {
		int price = 10;
		
		double totalAmmount = item * price;
		
		double updatedBalance = payment.makePayment(totalAmmount);
		
		int updatedStock = inventory.sold(item);
		
		System.out.println("Tickets are Booked");
		System.out.println("Total Amount Paid: " + totalAmmount);
		System.out.println("Remaining Balance: " + updatedBalance);
		System.out.println("Updated Stock: " + updatedStock);
		
	}

}
