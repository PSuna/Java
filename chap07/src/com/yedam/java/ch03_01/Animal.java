package com.yedam.java.ch03_01;

public abstract class Animal {

	// 필드
	public String kind; // 종
	
	// 생성자
	
	
	// 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // 추상메소드 : 추상클래스안에서만 선언가능
	
	
	
}
