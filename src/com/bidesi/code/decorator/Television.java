package com.bidesi.code.decorator;

public abstract class Television {
	String description = "Unnown";
	
	public Television(String brand) {
		this.description = brand;
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract int getCost();
	
}
