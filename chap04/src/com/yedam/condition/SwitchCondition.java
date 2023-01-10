package com.yedam.condition;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		int number = (int)(Math.random()*6) + 1; // 1 ~ 6 랜덤값
		
		switch(number) { // == 은거 찾는거임
		case 1 :
			System.out.println("1번 나옴");
			break;
		case 2 :
			System.out.println("2번 나옴");
			break;
		case 3 :
			System.out.println("3번 나옴");
			break;
		case 4 :
			System.out.println("4번 나옴");
			break;
		case 5 :
			System.out.println("5번 나옴");
			break;
//		default : // else와 같은것
//			System.out.println("6번 나옴");
//			break;
		case 6 : 
			System.out.println("6번 나옴");
			break;
		}
		
		// char 문자 비교
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("우수 회원");
			break;
		case 'B':
		case 'b': // B와 b모두(대소문자 구분없이) 아래의 실행문을 실행함 
			System.out.println("일반 회원");
			break; // 만약 break가 없다면 아래의 실행문 default도 같이 실행됨
		default:
			System.out.println("손님");
			break;
		}
	
		// String 문자열 비교
		String grade2 = "B";
		
		switch(grade2) {
		case "A":
			System.out.println("우수 회원");
			break;
		case "B":
		case "b": // B와 b모두(대소문자 구분없이) 아래의 실행문을 실행함 
			System.out.println("일반 회원");
			break; // 만약 break가 없다면 아래의 실행문 default도 같이 실행됨
		default:
			System.out.println("손님");
			break;
		}
		
		// 입력한 성적을 등급으로 환산
		Scanner sc = new Scanner(System.in);
		
		// 0 ~ 100
		// 99 ~ 90 : A
		// 89 ~ 80 : B
		// 79 ~ 70 : C
		// 70 아래는 : D
		System.out.print("입력> ");
		
		// 90, 80, 70, 60
		int scores = Integer.parseInt(sc.nextLine());
		
		
		switch (scores/10) {
		case 10: // 100점일때
		case 9: // 99 ~ 90
			System.out.println("A등급");
			break;
		case 8: // 89 ~ 80
			System.out.println("B등급");
			break;
		case 7: // 79 ~ 70
			System.out.println("C등급");
			break;
		default: // 그 외
			System.out.println("D등급");
			break;
		}
		
	}
}
