package com.yedam.java.ch03_01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phoen = new Phone("홍길동"); // 추상클래스라서 오류가남
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		
		//Phone phone = new SmartPhone("홍길동"); // 자동타입변환은 가능
		//SmarPhone smartPhone2 = (SmartPhone) new Phone("홍길동"); // 강제타입변환은 안됨 추상클래스라 new연산자를 사용할수없으므로
		
		
		
	}

}
