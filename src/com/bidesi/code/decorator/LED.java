package com.bidesi.code.decorator;

public class LED extends Television{
	
	public LED(String brand) {
		super(brand);
		description += " LED TV";
	}
	
	@Override
	public int getCost() {
		return 20000;
	}
}
