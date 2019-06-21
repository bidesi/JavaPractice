package com.bidesi.code.decorator;

public class CRT extends Television {

	public CRT(String brand) {
		super(brand);
		description += "CRT TV";
	}

	@Override
	public int getCost() {
		return 5000;
	}

}
