package com.yedam.loop;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		
		// for문
//		for(int i = 0; i <= 100; i++) {
//			System.out.println(i);
//		}
		
		// 1부터 100까지의 합 구하기
//		int result = 0;
//		for(int i=1; i<=100; i++) {
//			result += i; // result = result + i;
//		}
//		System.out.println("1~100까지의합 : " + result);
//		
//		// 1~100 사이의 짝수 구하기
//		// 짝수 성질 => 2로 나누었을때 0으로 떨어지면 짝수
//		for(int i = 1; i<=100; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i+"는 짝수");
//			}else if(i % 2 != 0) {
//				System.out.println(i+"는 홀수");
//			}
//		}
		
		// 입력한 숫자에 대한 구구단 출력
		// 스캐너를 활용해서 값을 하나 입력
		// 입력 받은 값에 대한 구구단 출력
		// 2를 입력 -> 2*1 = 2 ...... 2*9 = 18
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("구구단 입력> ");
//		int gugu = Integer.parseInt(sc.nextLine());
//		
//		for(int i = 1; i<=9; i++) {
//			System.out.println(gugu + "*" + i + "=" + (gugu*i));
//		}
		
		// 입력한 값에 대한 총합, 평균, 최대값, 최소값, 데이터 받을 갯수
		// 스캐너 -> 데이터 입력
		// 데이터 받을 갯수 -> 5 -> 반복문 횟수 설정
		// 데이터 입력 횟수가 5번 : 1, 20, 40, 30, 10
		// 총합 : 값을 입력 받을때마다 변수에 저장
		// 평균 : 총합 / 개수(데이터 받을 갯수)
		// 최대값, 최소값 초기값을 무엇으로해 비교하는지
		// 최대값 : 입력할때마다 비교 최대값인지 아닌지
		// 최소값 : 입력할때마다 비교, 최소값인지 아닌지
		
//		//데이터 입력받기
		Scanner sc = new Scanner(System.in);
//		System.out.print("입력받을 데이터 개수를 입력하세요> ");
//		int data_count = Integer.parseInt(sc.nextLine());
//		int total_sum = 0;
//		int max = 0;
//		int min = 0;
//		int data = 0;
//		
//		for(int i = 0; i<data_count; i++) {
//			System.out.print("데이터를 입력하세요> ");
//			data = Integer.parseInt(sc.nextLine());
//			
//			if(i==0) { // 내가 처음 입력한 값으로 초기화
//				max = data;
//				min = data;
//			}
//			
//			if(data > max) { // 최대값
//				max = data;
//			}
//			
//			if(data < min){ // 최소값
//				min = data;
//			}
//			total_sum += data; // 총합
//		}
//		System.out.println("총합: " + total_sum );
//		// 소수점이 나와야하므로 하나를 double로 강제타입변환 해줘야함
//		System.out.println("평균: " + (double)total_sum / data_count); 
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);

		
		// 2번문제 ) up and down
		// 임의의 랜덤값(1~100) 추출하여 5번의 기회안에 해당 랜덤값을 맞추는 프로그램을 구현하라.
		
		// 1 ~100 랜덤 추출
		int randomNo = (int)(Math.random()*100)+1;
		
		for(int i =0; i<5; i++) {
			System.out.print("값을 입력하세요:> ");
			int user = Integer.parseInt(sc.nextLine());
			
			if(user == randomNo) {
				System.out.println("정답");
				break;
				
			}else if(user < randomNo) {
				System.out.println("Up");
			}else {
				System.out.println("Down");
			}
			if(i==4) {
				System.out.println("5번 기회를 다소진하였음");
			}
		}
	}

}
