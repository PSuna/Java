package com.yedam.variable;

public class Casting {

	public static void main(String[] args) {
		// 자동 타입 변환 , 큰타입 = 작은타입
		byte byteValue = 10;
		int intValue = byteValue; // 큰타입 = 작은타입
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue; // 큰타입 = 작은타입
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue; // 큰타입 = 작은타입
		System.out.println("longValue: " + longValue);
		
		double doubleValue = longValue; // 큰타입 = 작은타입
		System.out.println("doubleValue: " + doubleValue);
		
		// 강제 타입 변환
		// 작은 허용 범위 타입 = (작은 허용 범위타입) 큰 범위 타입
		
		int intVar = 127;
		byte byteVar = (byte)intVar; // 큰 타입이 작은타입이 수용할수있는걸 넘어서는 큰숫자가 오면 overflow가 발생함
		System.out.println("byteVar : " + byteVar);
		
		int intVar2 = 44032;
		char charVar = (char)intVar2;
		System.out.println("charVar : " + charVar);
		
		// 실수 <-> 정수간 강제 타입 변환
		// 자동타입변환 : int -> double => 3.0 이됨
		// 강제타입변환 : double -> int = 소수점 땐 정수만 타입변환
		double doubleVar = 3.14;
		intVar2 = (int)doubleVar; // 소수점은 사라지고 정수만 들어감
		System.out.println("intVar2: " + intVar2);
		
		
		
		
		
		
		
		
	}

}
