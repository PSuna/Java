package com.yedam.exam01;

public class Main {

	public static void main(String[] args) {
		int num = 10;
		int num2 = (int)2.0; // int로 강제타입 변환 
		// double y = 2.0;
		
		int result = num + num2;
		System.out.println(num + " + " + num2 + " = " + result);
		
		result = num - num2;
		System.out.println(num + " - " + num2 + " = " + result);
		
		result = num * num2;
		System.out.println(num + " * " + num2 + " = " + result);
		
		result = num / num2;
		System.out.println(num + " / " + num2 + " = " + result);
	
		
	}

}
