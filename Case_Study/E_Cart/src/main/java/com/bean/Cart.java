package com.bean;

public class Cart {
	private int product_id;
	private int customer_ID;
	private int quantity;
	public Cart(int product_id, int customer_ID, int quantity) {
		
		this.product_id = product_id;
		this.customer_ID = customer_ID;
		this.quantity = quantity;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	

}
