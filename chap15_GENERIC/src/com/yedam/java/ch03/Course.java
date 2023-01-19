package com.yedam.java.ch03;

public class Course {
	
	// ? : 모든 클래스들이 다 대입될수있음
	public static void registerCourse1(Applicant<?> applicant) {
		String message = applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함";
		System.out.println(message);
	}
	
	// Person , Worker
	// Worker가 최하위 클래스로 자기자신과 그위의 부모클래스들만 올수있음
	public static void registerCourse2(Applicant<? super Worker> applicant) { 
		String message = applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함";
		System.out.println(message);
	}

	// Student, HighStudent, MiddleStudent
	// Student가 최상위 클래스로 자기자신과 그 아래의 자식클래스들만 올수있음
	public static void registerCourse3(Applicant<? extends Student> applicant) {
		String message = applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함";
		System.out.println(message);
	}
}
