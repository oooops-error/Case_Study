package com.bean;

public class Products {
	
	private int product_id;
	private String product_name;
	private double product_price;
	private String product_category;
	private String product_descreption;
	private int average_feedback;
	private int product_stock;
	
public Products(int product_id, String product_name, double product_price, String product_category,
			String product_descreption, int average_feedback, int product_stock) {
		
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_category = product_category;
		this.product_descreption = product_descreption;
		this.average_feedback = average_feedback;
		this.product_stock = product_stock;
	}

public int getProduct_id() {
	return product_id;
}

public void setProduct_id(int product_id) {
	this.product_id = product_id;
}

public String getProduct_name() {
	return product_name;
}

public void setProduct_name(String product_name) {
	this.product_name = product_name;
}

public double getProduct_price() {
	return product_price;
}

public void setProduct_price(double product_price) {
	this.product_price = product_price;
}

public String getProduct_category() {
	return product_category;
}

public void setProduct_category(String product_category) {
	this.product_category = product_category;
}

public String getProduct_descreption() {
	return product_descreption;
}

public void setProduct_descreption(String product_descreption) {
	this.product_descreption = product_descreption;
}

public int getAverage_feedback() {
	return average_feedback;
}

public void setAverage_feedback(int average_feedback) {
	this.average_feedback = average_feedback;
}

public int getProduct_stock() {
	return product_stock;
}

public void setProduct_stock(int product_stock) {
	this.product_stock = product_stock;
}


}
