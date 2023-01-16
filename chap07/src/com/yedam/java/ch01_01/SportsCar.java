package com.yedam.java.ch01_01;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	public void stop() { // 메소드 오버라이딩 불가 왜냐하면 final때문에
//		System.out.println("스포츠 카를 멈춤");
//		speed = 0;
//	}
	
	public void carStop() {
		super.stop(); // 부모클래의 메소드를 사용은 가능함 단지 메소드 오버라이딩이 불가
		//this.maxSpeed = 400; // final 필드 : 값변경 불가
	}
	
	
	

}
