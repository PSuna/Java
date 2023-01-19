package com.yedam.java.ch03;

public class MainExample {

	public static void main(String[] args) {
		// Course1
//		Person person = new Person();
//		Applicant<Person> applicant = new Applicant<>(person);
//		Course.registerCourse1(applicant);
		
		// 위의 내용을 한줄로 요약한것
		// ? : 모든 클래스들이 다 대입될수있음
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		// Person , Worker
		// Course2 : Worker가 최하위 클래스로 자기자신과 그위의 부모클래스들만 올수있음
		Course.registerCourse2(new Applicant<Person>(new Person()));
		Course.registerCourse2(new Applicant<Worker>(new Worker()));
		//Course.registerCourse2(new Applicant<Student>(new Student()));
		//Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		//Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		// Student, HighStudent, MiddleStudent
		// Course3 : Student가 최상위 클래스로 자기자신과 그 아래의 자식클래스들만 올수있음
		//Course.registerCourse3(new Applicant<Person>(new Person()));
		//Course.registerCourse3(new Applicant<Worker>(new Worker()));
		Course.registerCourse3(new Applicant<Student>(new Student()));
		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		
		
		
	}

}
