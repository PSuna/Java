package com.yedam.java.ch02;

public class MainExample {

	public static void main(String[] args) {
		Box<String> nameBox = new Box<>(); // String으로 이루어진 값만 저장할수있음
		nameBox.set("홍길동");
		String bane = nameBox.get();
		
		Box<Integer> priceBox = new Box<>();
		priceBox.set(1000);
		int price = priceBox.get();
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		
		Agency agency = new Agency();
		agency.rent().turnOnLight();
		agency.getCount().printRentDate();
		
	}

}

class Apple{}