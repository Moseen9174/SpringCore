package com.rays.ioc;

import org.springframework.beans.factory.annotation.Value;

public class Inventory {

	@Value(value = "100")
	int stock;

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int sold(double qty) {
		stock -= qty;
		return stock;
	}

}
