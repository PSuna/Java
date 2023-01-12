package com.yedam.object;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		// 클래스 생성해서 객체 만든다음 객체 바로 사용
		// 객체를 한곳에 모아서 관리하는 형태
		// 배열
		// int[] ary = new int[4];
		// Student[] stdAry = new Student[10];
		
		// 학생 정보 보관하는 배열
		Student[] stdAry = null;
		//Student std = new Student();
		
		int stdNum = 0;
		Scanner sc = new Scanner(System.in);
		
		// while문을 활용해서 학생 관리 프로그램 작성
		while(true) {
			System.out.println("======================================================");
			System.out.println("1. 학생수 | 2. 정보입력 | 3. 정보확인  | 4. 분석 | 5. 종료");
			System.out.println("======================================================");
			System.out.println("메뉴번호를 입력하세요> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				
				// Student 클래스로 만들어지는 객체를 몇개나 배열에 넣을지
				// 에 대한 값을 받아옴.
				System.out.print("학생 수> ");
				stdNum = Integer.parseInt(sc.nextLine());
				
			}else if(selectNo == 2) {
				
				stdAry = new Student[stdNum]; // Student 배열 생성
				for(int i = 0; i<stdAry.length; i++) {
					// 객체 배열에 각 인덱스에 존재하는 student객체에게
					// 데이터를 제공하기 위해서 임시 객체를 만듬.
//					Student std = new Student();
//					std.name = "김또치";
//					std.age = 10;
//					stdAry[i] = std;
					
					// 이 방법이 더 좋음, Student s1 = new Student();
					stdAry[i] = new Student();
					System.out.println("이름> ");
					stdAry[i].name = sc.nextLine();
					System.out.println("나이> ");
					stdAry[i].age = Integer.parseInt(sc.nextLine());
					System.out.println("다니고있는 학교> ");
					stdAry[i].schoolName = sc.nextLine();
					
					//성적입력
					System.out.println("국어> "); 
					stdAry[i].kor = Integer.parseInt(sc.nextLine());
					System.out.println("영어> ");
					stdAry[i].eng = Integer.parseInt(sc.nextLine());
					System.out.println("수학> ");
					stdAry[i].math = Integer.parseInt(sc.nextLine());
					
				}
			}else if(selectNo == 3) {
				for(Student std : stdAry) { // 향상된 for문
					std.getInfo();
				}
			}else if(selectNo == 4) {
				//총합 , 평균
				int total = 0;
				double avg = 0;
				System.out.println("전체학생 총합/평균 조회");
				for(int i = 0 ; i<stdAry.length; i++) {
					total = stdAry[i].kor + stdAry[i].eng + stdAry[i].math;
					avg = total / 3.0;
					System.out.println(stdAry[i].name + " 학생>");
					System.out.println("총합 : " + total + " 평균 : " + avg);	
				}
				
				// 시험 젤 잘친 과목, 못친 과목 확인
				int max = 0;
				int min = 0;
				for(int i = 0; i< stdAry.length; i++) {
							max = stdAry[i].kor; // 국어
							min = stdAry[i].kor; // 국어
						
						if(stdAry[i].eng < stdAry[i].math) { // 수학이 영어보다 클때
							if(max < stdAry[i].math) { // 국어와 수학을 비교 : 수학이 더클때
								max = stdAry[i].math; // 수학이 max가됨
							}
						}else { // 영어가 수학보다 클때
							if(max < stdAry[i].eng) { // 국어와 영어를 비교 : 영어가 더 클때
								max = stdAry[i].eng; // 영어가 max가됨
							}
						}
						System.out.println(stdAry[i].name + " 최고 성적 : " + max);		
				}
				
				
			}else if(selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
			
		}
		
//		
//		Student s1 = new Student();
//		Student s2 = new Student();
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		// dot 연산자
//		s1.age = 20;
//		s1.name = "예담";
//		s1.schoolName = "예담대학교";
//		s1.getInfo();
//		
//		s2.age = 30;
//		s2.name = "대예담";
//		s2.schoolName = "예담대학원";
//		s2.getInfo();
//		
//		s1.getInfo();
//		s1.age = 20;
//		s1.name = "대학생";
//		
//		System.out.println("학생의 나이: " + s1.age);
//		System.out.println("학생의 이름: " + s1.name);
//		System.out.println("재학중인 학교: " + s1.schoolName);
//		
//		
//		Korean k1 = new Korean("김또치", "001111-0147852");
//		
//		System.out.println("k1 가지고 있는 필드 값>");
//		System.out.println(k1.nation);
//		System.out.println(k1.name);
//		System.out.println(k1.ssn);
		
		
	}
}
