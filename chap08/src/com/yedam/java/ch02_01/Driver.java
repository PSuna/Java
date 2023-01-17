package com.yedam.java.ch02_01;

public class Driver  {

	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { // vehicle이 Bus타입일때
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
	
}
