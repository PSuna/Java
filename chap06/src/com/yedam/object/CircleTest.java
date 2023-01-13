package com.yedam.object;

public class CircleTest {

	public static void main(String[] args) {
		
		// static = 정적 = 공유
		// 클래스파일 로딩시에 메모리에 할당
		// 객체생성 없이 클래스이름으로 스태틱 필드 접근 가능
		System.out.println(Circle.pi);
		
		// 반지름이 5인 원의 면적 계산
		// circle 객체 생성과 동시에 r 초기화
		Circle circle = new Circle(5);
		
		// area
		double circleArea = circle.area();
		
		// 결과 출력
		System.out.println("원의면적: " + circleArea);
		
		Circle circle2 = new Circle();
		//circle2.r = 10;
		
		// CircleSingle 싱글톤 출력
		CircleSingle circleSingle = CircleSingle.getInstance(); // 정적메소드이므로
		circleSingle.r = 10;
		
		System.out.println(circleSingle.r); // 10
		
		CircleSingle circleSingle2 = CircleSingle.getInstance(); // 정적메소드이므로
		circleSingle2.r = 20;
		
		System.out.println(circleSingle2.r); // 20
		
		System.out.println(circleSingle.r); // 20 : static이라 모든 객체가 공유하므로 같이 변경됨
		
	}

}
