package com.bidesi.code.decorator;

public class Bluetooth extends FeaturesDecorator {

	Television tv;
	
	public Bluetooth(Television tv) {
		super("");
		this.tv = tv;
	}

	@Override
	public String getDescription() {
		return tv.getDescription() + " + Bluetooth";
	}

	@Override
	public int getCost() {
		return tv.getCost() + 1500;
	}

}
