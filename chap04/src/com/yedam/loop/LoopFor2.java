package com.yedam.loop;

public class LoopFor2 {

	public static void main(String[] args) {
		//중첩 for문
		//for(){
		//	for() {
		//	}	
		//}
		
		// 2단 ~ 9단 출력
		for(int i = 2; i<=9; i++) {
			for(int j =1; j<=9; j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
		
		// 별찍기
		// ******
		// ******
		// ******
		// ******
		// ******
		
		//한줄, 한줄 내려갈때 쓰는 반복문
		for(int i = 1; i <= 5 ; i++) {
			//별을 찍어주는 반복문
			for(int j = 1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 별찍기 2 
		// * 		1줄 1개
		// **		2줄 2개
		// ***		3줄 3개
		// ****		4줄 4개
		// *****	5줄 5개
		
		for(int i = 1; i<=5; i++) {
			for(int j= 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 별찍기3 반복문은 i값 또는 j값이 1 또는 0부터 시작하라는 법은 없습니다.
		// ***** 	1줄 5개
		// **** 	2줄 4개
		// ***		3줄 3개
		// **		4줄 2개
		// *		5줄 1개
		
		for(int i = 0 ; i<5; i++) {
			for(int j = 5 ; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
