package com.yedam.object;

public class CircleSingle {

	// 싱글톤
	static CircleSingle circleSingle = new CircleSingle();
	
	static CircleSingle getInstance() { // 메서드임
		return circleSingle;
	}
	
	private CircleSingle() {
		
	}
	
	static final double pi = 3.14; // final : 변경불가
	double r;
	
	// r 필드 초기화 생성자
	CircleSingle(double r){
		this.r = r;
	}
	
	double area() {
		double result = pi * r * r;
		return result;
	}
	
}
