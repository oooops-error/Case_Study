package com.bean;

public class Payment {
	private int payment_id;
	private int order_ID;
	private double amount;
	private int customer_ID;
	private String date;
	
	
	public Payment(int payment_id, int order_ID, double amount, int customer_ID, String date) {
		
		this.payment_id = payment_id;
		this.order_ID = order_ID;
		this.amount = amount;
		this.customer_ID = customer_ID;
		this.date = date;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public int getOrder_ID() {
		return order_ID;
	}
	public void setOrder_ID(int order_ID) {
		this.order_ID = order_ID;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
