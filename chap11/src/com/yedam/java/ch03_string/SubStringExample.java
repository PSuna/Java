package com.yedam.java.ch03_string;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		// substring(start, end) -> Index start부터 end전까지
		String firstNum = ssn.substring(0,6); // 0번부터 6앞까지 잘라냄
		System.out.println("생년월일: " + firstNum);
		
		// substring(start) -> Index start부터 끝까지
		String secondNum = ssn.substring(7);
		System.out.println("개인정보 : " + secondNum);
	
		String[] numList = ssn.split("-"); // -를 기준(구분자를 기준)으로 문자열을 자름
		for(String num : numList) {
			System.out.println(num);
		}
	}

}
