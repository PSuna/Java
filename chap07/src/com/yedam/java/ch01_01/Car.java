package com.yedam.java.ch01_01;

public class Car {
	// 필드
	public int speed;
	public final int maxSpeed = 300; // 한번 초기화되면 변경불가
	
	// 생성자
	
	//메서드
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
