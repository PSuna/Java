package com.yedam.object;
/*
 *  필요시마다 매번 객체를 생성하지 않고
 *  한번만 객체를 생성 해놓고 필요시 참조 => 노드에서 pool과 비슷한 개념임
*/
public class CalculatorSingle {

	// 싱글톤
	static CalculatorSingle instance = new CalculatorSingle();
	
	static CalculatorSingle getInstance() { // 메서드임
		return instance;
	}
	
	// 필드
	

	// 생성자
	private CalculatorSingle() { // private : 외부에서 접근 불가
		
	}
	
	
	// 메소드
	// 메소드 리턴 타입이 존재할때
	int sum(int a, int b) {
		return a+b;
	}
	
	double sub(int a, int b) {
		return a-b;
	}
	
	String result(String value) {
		String temp = "value 테스트 : " + value;
		return temp;
	}
	
	// 리턴문이 없는 메소드 생성
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 매개변수의 정확한 갯수를 모를때
	int sum2(int ...values) { // 배열 형태
		int total = 0;
		for(int a : values) {
			total += a;
		}
		return total;
	}
	
}
