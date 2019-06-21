package com.bidesi.code.decorator;

public class FullHD extends FeaturesDecorator {
	Television tv;
	
	public FullHD(Television tv) {
		super("");
		this.tv = tv;
	}

	@Override
	public String getDescription() {
		return tv.getDescription() + " + FulHD";
	}

	@Override
	public int getCost() {
		return tv.getCost() + 1200;
	}

}
