package com.yedam.condition;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90이상 이고, 등급 A");
		}
		
		// 실행문이 한 줄 일때만 사용 : 이건 사용하지 말기 , 안좋은 코드임
		if(score >= 90) 
			System.out.println("점수가 90이상이고, 등급A");
			System.out.println("스코어가 90"); // 위에 실행문과 상관이 없음
			
		// if-else
		if(score >= 90) {
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A입니다.");
		}else { // score < 90 이라는 말
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다");
		}
		
		// else - if
		// if문(조건식을 여러개 사용할때) => 여러 조건중 하나를 만족하면 해당 실행문들을 실행하고 탈주함
		score = 70;
		if(score >= 90) {
			System.out.println("등급 A");
		}else if(score >= 80) {
			System.out.println("등급 B");
		}else if(score >= 70) {
			System.out.println("등급 C");
		}else {
			System.out.println("등급 D");
		}
		
		// random 값 추출 =======================================================
		// Random() / Math.random()
		// 0 <= Math.random() < 1 => 0 ~ 0.9xxxxx 사이의 값이 나옴
		System.out.println(Math.random());
		
		// 0 * 10 <= Math.random() * 10 < 1 * 10 => 0 ~ 9.xxxx 사이의 값이 나옴
		
		// 0 <= Math.random() * 10 < 10
		// int number = (int)5.12; // 5가 결과로 들어감
		
		// 0 ~ 9.xxxx => (int) 0 ~ (int) 9
		// (int) 0 <= (int) Math.random()*10 < (int) 10
		
		// 0 ~ 9 => 1 ~ 10
		// (int) 0 + 1 <= (int) Math.random() * 10 + 1 < (int) 10+1
		
		
		//==================================================================
		// 주사위 번호 뽑기
		
		int number = (int)(Math.random()*6 + 1); // 1 ~ 6 사이의 값이 랜덤으로 나옴
		
		if(number == 1) {
			System.out.println("1번 나옴");
		}else if(number == 2) {
			System.out.println("2번 나옴");
		}else if(number == 3) {
			System.out.println("3번 나옴");
		}else if(number == 4) {
			System.out.println("4번 나옴");
		}else if(number == 5) {
			System.out.println("5번 나옴");
		}else {
			System.out.println("6번 나옴");
		}
		
		// 중첩 if문
		// data -> 조건 여러 번 검색
		int no = 10;
		
		// no가 2의 배수
		if(no % 2 == 0) {
			// no가 5의 배수
			if(no % 5 == 0) {
				// no가 10의 배수
				if(no%10 == 0) {
					System.out.println("no는 10의 배수입니다");
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력> ");
		
		score = Integer.parseInt(sc.nextLine());
		String grade = "";
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}
		System.out.println("획득한 학점: " + grade);
	}

}
