package com.yedam.java.ch05.math;

public class Example {

	public static void main(String[] args) {
		
		// abs() : 절대값
		System.out.println("-2.14의 절대값 : " + Math.abs(-2.14));
		System.out.println("2.14의 절대값 : " + Math.abs(2.14));
		
		// max() : 최대값 / min() : 최소값
		System.out.println("3.8, 6.7 중 최대값 : " + Math.max(3.8, 6.7));
		System.out.println("3.8, 6.7 중 최소값 : " + Math.min(3.8, 6.7));
		
		
		// 소수점 계산 : 음수 계산시 주의!!!
		// ceil() : 올림 
		System.out.println("5.3의 올림값 : " + Math.ceil(5.3)); // 6.0
		System.out.println("-5.3의 올림값 : " + Math.ceil(-5.3)); // -5.0
		
		// floor() : 버림값
		System.out.println("5.3의 버림값 : " + Math.floor(5.3)); // 5.0
		System.out.println("-5.3의 버림값 : " + Math.floor(-5.3)); // -6.0
		
		// round() : 반올림값 - 4이하는 내림, 5이상은 올림 => 음수일 때는 반대로 생각
		System.out.println("5.3의 반올림값 : " + Math.round(5.3)); // 5
		System.out.println("-5.3의 반올림값 : " + Math.round(-5.3)); // -5
		
		// rint() : 가까운 정수의 실수값 => 정수가 짝수일때는 6이상, 홀수일때는 5이상
		System.out.println("5.5의 가까운 정수의 실수값 : " + Math.round(5.5)); 
		System.out.println("5.6의 가까운 정수의 실수값 : " + Math.round(5.6)); 
		System.out.println("4.5의 가까운 정수의 실수값 : " + Math.round(4.5));
		System.out.println("4.6의 가까운 정수의 실수값 : " + Math.round(4.6));
		
		
	}

}
