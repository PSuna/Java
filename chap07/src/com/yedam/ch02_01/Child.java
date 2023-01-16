package com.yedam.ch02_01;

public class Child extends Parent {

	@Override
	public void method2() { // 메소드 오버라이딩
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
	
}
