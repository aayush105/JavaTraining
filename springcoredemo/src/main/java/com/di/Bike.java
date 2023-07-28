package com.di;

public class Bike {

	
	private String color;
	private String model;
	private int price;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
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
	
	
	@Override
	public String toString() {
		return "Bike [color=" + color + ", model=" + model + ", price=" + price + "]";
	}
	
	
}
