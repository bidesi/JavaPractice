package com.bidesi.code.decorator;

public class SonyTelevision {

	public static void main(String[] args) {
		
		Television sonyTv = new LED("Sony");
		sonyTv = new Wifi(sonyTv);
		sonyTv = new FullHD(sonyTv);
		
		System.out.println(sonyTv.getDescription() + " <--> " +sonyTv.getCost());
		
		
	}

}
