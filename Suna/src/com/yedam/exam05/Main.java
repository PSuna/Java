package com.yedam.exam05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 메뉴1 : 주사위 크기(5 ~ 10) 입력받으세요, 범위를 벗어날 경우 범위안내 메세지 출력
		// 메뉴2 : 5가 나올때까지 주사위를 몇번 굴리는지 구하고 출력
		// 메뉴3 : 메뉴2에서 각 주사위 수별로 몇번나왔는지 출력
		// 메뉴4 : 메뉴2에서 가장 많이 나온수가 몇번인지 구하고 출력 , 가장 많이 나온수가 여러개일경우 가장 작은수가 출력
		// 메뉴5 : 프로그램을 종료
		
		Scanner sc = new Scanner(System.in);
		int[] dice = null; // 주사위가 나온수를 저장하는 배열
		int diceSize = 0; // 주사위 크기
		int count = 0; // 주사위 굴린 횟수
		int diceMaxCount = 0; // 가장 많이 나온수
		int diceMaxIndex = 0; // 가장 많이 나온수의 인덱스
		
		while(true) {
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료 ===");
			System.out.println("메뉴 >");
			int menuNo = Integer.parseInt(sc.nextLine());
			
			if(menuNo == 1) {
				System.out.println("주사위 크기 > ");
				diceSize = Integer.parseInt(sc.nextLine()); // 주사위 크기
				if(diceSize < 5 || diceSize > 10) { // 5보다 작은수 이거나 10보다 큰수라면
					diceSize = 0; // 입력받은값 초기화
					System.out.println("주사위 크기는 5 ~ 10 사이의 값만 입력하세요");
					continue; // 다시 처음으로
				}
			}else if(menuNo == 2) {
				dice = new int[diceSize]; // 주사위크기만큼 배열 생성
				count = 0 ; // 재실행때 카운터 수를 초기화해줘야함
				
				// 주사위가 5 가 나올때까지 굴리기
				while(true) {
					int random = (int)(Math.random()*diceSize)+1; // 주사위 크기를 지정한만큼 1 ~ diceSize
					if(random == 5) { // 5가 나온다면
						count++; // 굴린 수 증가
						dice[random-1]++; // 나온수만큼 저장 
						System.out.println("5가 나올때까지 주사위를 " + count + "번 굴렸습니다.");
						break;
					}else{
						dice[random-1]++; // 나온수만큼 저장
						count++; // 굴린 수 증가
						//System.out.println(random); // 주석처리 : 나온수 출력해봄 (어떤수가 나왔는지 궁금해서)
					}
				}
			}else if(menuNo == 3) {
				for(int i =0; i < dice.length; i++) {
					System.out.println((i+1)+"은 " + dice[i] + "번 나왔습니다.");
				}
			}else if(menuNo == 4) {
				diceMaxCount = dice[0];
				for(int i =0;i<dice.length; i++) {
					if(diceMaxCount < dice[i]) { // 나온수 비교
						diceMaxCount = dice[i];
						diceMaxIndex = i; // 가장 많이 나온수에 해당하는 인덱스
					}
				}
				System.out.println("가장 많이 나온 수는 " + (diceMaxIndex+1) + "입니다."); // 인덱스는 0부터 시작이므로 +1해야함
				
			}else if(menuNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
