package com.yedam.object;


// 클래스 선언
/*
 * static 필드 		: public
 * instance 필드 		: private
 * 생성자				: public
 * getter, setter 	: public
 * 일반 메서드 		: public (일부 private도 있음)
 */
public class Circle {

	static final double pi = 3.14; // final : 변경불가
	private double r; // 캡슐화

	// r 필드 초기화 생성자
	public Circle(double r){
		this.r = r;
	}
	
	// 기본 생성자
	public Circle(){
		
	}
	
	// r read/write // setter, getter
	public void setR(double r) {
		this.r = r;
	}
	
	
	public double getR() {
		return r;
	}

	public double area() {
		double result = pi * r * r;
		return result;
	}
	
}
