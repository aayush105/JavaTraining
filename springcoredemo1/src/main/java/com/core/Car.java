package com.core;

public class Car {

	private String model;
	private int price;
	private String color;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + ", color=" + color + "]";
	}
	
	
} 
