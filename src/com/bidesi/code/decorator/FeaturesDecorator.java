package com.bidesi.code.decorator;

public abstract class FeaturesDecorator extends Television{
	
	public FeaturesDecorator(String brand) {
		super(brand);
	}

	public abstract String getDescription();
}
