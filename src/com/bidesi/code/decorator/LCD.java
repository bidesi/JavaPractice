package com.bidesi.code.decorator;

public class LCD extends Television {

	public LCD(String brand) {
		super(brand);
		description = "LCD TV";
	}
	
	@Override
	public int getCost() {
		return 10000;
	}

}
