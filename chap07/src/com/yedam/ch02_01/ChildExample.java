package com.yedam.ch02_01;

public class ChildExample {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1(); // 부모꺼가 출력
		child.method2(); // 자식꺼가 출력 => 메소드 오버라이딩
		child.method3(); // 자식꺼가 출력
		System.out.println();
		
		// 자동 타입 변환 : 부모의 필드, 메소드만 호출 가능 / 단, 자식클래스에서 재정의되어있을시 자식클래스꺼가 출력
		Parent parent = child; 
		parent.method1();
		parent.method2(); 
		//parent.method3();
		
		
		
		
	}

}
