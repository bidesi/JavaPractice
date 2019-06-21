package com.bidesi.code.decorator;

public class Wifi extends FeaturesDecorator {
	Television tv;
	
	public Wifi(Television tv) {
		super("");
		this.tv = tv;
	}

	@Override
	public String getDescription() {
		return tv.getDescription() + " + WiFi";
	}

	@Override
	public int getCost() {
		return tv.getCost() + 3000;
	}

}
