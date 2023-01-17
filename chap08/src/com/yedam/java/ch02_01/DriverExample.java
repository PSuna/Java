package com.yedam.java.ch02_01;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive(new Taxi()); // Taxi는 Vehicle의 구현클래스이므로
		driver.drive(new Bus());
		
	}

}
