package com.yedam.java.ch01_01;

public class Computer extends Calculator {

	@Override // 어노테이션 : 컴파일시 시그니처가 동일한지 점검해주는 역할
	double areaCircle(double r) { // 메소드 오버라이딩
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
}
