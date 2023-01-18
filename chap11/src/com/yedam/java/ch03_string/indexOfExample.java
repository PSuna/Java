package com.yedam.java.ch03_string;

public class indexOfExample {
	public static void main(String[] args) {
		String subject = "혼자 공부하는 자바, 신윤권";
		
		int location = subject.indexOf("공부");
		System.out.println("'공부'의 위치 : " + location);
		
		if(subject.indexOf("자바") == -1) { // 자바가 포함되어있지 않으면
			System.out.println("자바와 관련이 없는 책입니다.");
		}else {
			System.out.println("자바와 관련이 있는 책입니다.");
		}
		
		if(subject.indexOf("자바") > -1) { // 자바가 포함되어있으면
			System.out.println("자바와 관련이 있는 책입니다.");
		}else {
			System.out.println("자바와 관련이 없는 책입니다.");
		}
	}
}
