package com.yedam.java.ch03_string;

public class CaseException {

	public final static String DATA = "HELLO WORLD!";
	
	public static void main(String[] args) {
		String inputData = "Hello World!";
		String newInputDataL = inputData.toLowerCase(); // 소문자
		String newInputDataU = inputData.toUpperCase(); // 대문자
		
		// 자바는 대소문자를 구분함
		if(newInputDataU.equals(DATA.toUpperCase())) { 
			System.out.println("있는 데이터입니다.");
		}else {
			System.out.println("없는 데이터입니다.");
		}
		
		// 대소문자 구분없이 의미만 비교하는 메소드
		if(inputData.equalsIgnoreCase(newInputDataU)) { 
			System.out.println("있는 데이터입니다.");
		}else {
			System.out.println("없는 데이터입니다.");
		}
		
	}

}
