package com.bean;

public class Order {
	private int order_id;
	private int Customer_id;
	private int total_Quantity;
	private int order_date;
	private int arriving_date;
	private int feedback;
	private int product_id;
	private String status;
	
	public Order(int order_id, int customer_id, int total_Quantity, int order_date, int arriving_date, int feedback,
			int product_id, String status) {
		
		this.order_id = order_id;
		this.Customer_id = customer_id;
		this.total_Quantity = total_Quantity;
		this.order_date = order_date;
		this.arriving_date = arriving_date;
		this.feedback = feedback;
		this.product_id = product_id;
		this.status = status;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCustomer_id() {
		return Customer_id;
	}

	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}

	public int getTotal_Quantity() {
		return total_Quantity;
	}

	public void setTotal_Quantity(int total_Quantity) {
		this.total_Quantity = total_Quantity;
	}

	public int getOrder_date() {
		return order_date;
	}

	public void setOrder_date(int order_date) {
		this.order_date = order_date;
	}

	public int getArriving_date() {
		return arriving_date;
	}

	public void setArriving_date(int arriving_date) {
		this.arriving_date = arriving_date;
	}

	public int getFeedback() {
		return feedback;
	}

	public void setFeedback(int feedback) {
		this.feedback = feedback;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
