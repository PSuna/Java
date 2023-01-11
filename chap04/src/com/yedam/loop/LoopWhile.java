package com.yedam.loop;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
//		// 1~100사이의 2의배수
//		int i = 1;
//		while(i<=100) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
//		
//		// 계산기 프로그램
//		// 무한 루프 조건으로 프로그램 실행
//		// event(trigger) 프로그램 종료 -> break;
//		boolean run = true;
//		
//		Scanner sc = new Scanner(System.in);
//		while(run) {
//			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
//			System.out.print("입력> ");
//			int num = Integer.parseInt(sc.nextLine());
//			
//			switch(num) {
//			case 1:
//				System.out.println("더하고자하는 두 수를 입력>");
//				System.out.print("1> ");
//				int num1 = Integer.parseInt(sc.nextLine());
//				System.out.print("2> ");
//				int num2 = Integer.parseInt(sc.nextLine());
//				int result = num1 + num2;
//				System.out.println(num1 + "," + num2 + "의 결과 " + result);
//				break;
//			case 2:
//				System.out.println("뺄셈하고자 하는 두 수를 입력>");
//				System.out.print("1> ");
//				num1 = Integer.parseInt(sc.nextLine());
//				System.out.print("2> ");
//				num2 = Integer.parseInt(sc.nextLine());
//				System.out.println(num1 + "," + num2 + "의 결과 " + (num1-num2));
//				break;
//			case 3:
//				System.out.println("곱하고자하는 두 수를 입력>");
//				System.out.print("1> ");
//				num1 = Integer.parseInt(sc.nextLine());
//				System.out.print("2> ");
//				num2 = Integer.parseInt(sc.nextLine());
//				System.out.println(num1 + "," + num2 + "의 결과 " + (num1*num2));
//				break;
//			case 4:
//				run = false; // 무한 루프 종료
//				System.out.println("end of prog");
//				break;
//			default:
//				System.out.println("1 ~ 4사이 수를 입력해주세요.");
//				break;
//			}
//		}
		
		// 게임 만들기
		// 컴퓨터와 가위 , 바위, 보
		// 컴퓨터와 앞, 뒤 맞추기
		
		// 한판에 500원 (내가 넣은 금액만큼 게임을 할수있도록 만들기)
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.println("======== insert coin ========");
		System.out.print("게임 할 금액을 넣어주세여> ");
		money = Integer.parseInt(sc.nextLine()); // 게임 할 금액 넣기
		
		// 10000 -> 20번
		// 1500 -> 3번

		boolean flag = true;
		
		while(money >= 500 && flag) { // 500원 보다 많을때 게임 진행 가능, 500원일때도 실행이 되어야하므로
			System.out.println((money/500) + "번의 기회가 남았습니다.");
			System.out.println("1. 가위바위보 | 2. 앞뒤 맞추기 | 3. 종료");
			
			System.out.print("입력> ");
			int gameNo = Integer.parseInt(sc.nextLine());
			
			switch(gameNo) {
			case 1:
				// 컴퓨터와 가위, 바위, 보
				// 가위 -> 1
				// 바위 -> 2
				// 보 -> 3
				// 컴퓨터가 내는 가위, 바위, 보 => 랜덤값 추출
				// 내가 입력한 값이랑 비교해서 이겼다, 졌다, 비겼다. 출력
				// 가위, 바위, 보 || String.equals(내용)
				
				System.out.print("가위, 바위, 보 중에서 하나를 입력하세요> ");
				String RSP = sc.nextLine();
				// 가위 -> 1, 바위 -> 2 , 보 -> 3
				int randomNo = (int)(Math.random()*3)+1; // 1 ~ 3사이의수
				
				if(RSP.equals("가위")) {
					if(randomNo == 1) { // 사용자 : 가위, 컴퓨터 : 1 (가위)
						System.out.println("비겼습니다");
					}else if(randomNo == 2 ) { // 사용자 : 가위, 컴퓨터 : 2 (바위)
						System.out.println("졌습니다");
					}else if(randomNo == 3){ // 사용자 : 가위, 컴퓨터 : 3 (보)
						System.out.println("이겼습니다");
					}
				}else if(RSP.equals("바위")) {
					if(randomNo == 1) { // 사용자 : 바위, 컴퓨터 : 1 (가위)
						System.out.println("이겼습니다");
					}else if(randomNo == 2 ) { // 사용자 : 바위, 컴퓨터 : 2 (바위)
						System.out.println("비겼습니다");
					}else if(randomNo == 3){ // 사용자 : 바위, 컴퓨터 : 3 (보)
						System.out.println("졌습니다");
					}
				}else if(RSP.equals("보")) {
					if(randomNo == 1) { // 사용자 : 보, 컴퓨터 : 1 (가위)
						System.out.println("졌습니다");
					}else if(randomNo == 2 ) { // 사용자 : 보, 컴퓨터 : 2 (바위)
						System.out.println("이겼습니다");
					}else if(randomNo == 3){ // 사용자 : 보, 컴퓨터 : 3 (보)
						System.out.println("비겼습니다");
					}
				}
				money -= 500; // 게임 한판시 500원 차감
				break;
			case 2:
				// 컴퓨터와 앞, 뒤 맞추기
				System.out.print("앞, 뒤 중에서 하나를 입력 해주세요> ");
				RSP = sc.nextLine();
				randomNo = (int)(Math.random()*2)+1; // 1 ~ 2사이의 값
				if(RSP.equals("앞")) {
					if(randomNo == 1) { // 1 : 앞
						System.out.println("맞췄습니다.");
					}else {
						System.out.println("틀렸습니다");
					}
				}else { // 사용자가 뒤를 입력하였을경우
					if(randomNo == 2) { // 2 : 뒤
						System.out.println("맞췄습니다");
					}else {
						System.out.println("틀렸습니다");
					}
				}
				money -= 500;
				break;
			case 3:
				//종료 => 1) 투입 금액이 소진이 다됬을때
				// 		 2) 강제종료
				flag = false;
				break;
			default:
				System.out.println("없는 메뉴입니다. 다시 입력하세요");
				break;
			}
			// 1800 -> money == 499 이하라면 게임을 할 수 없으므로
			if(money < 500) {
				System.out.println("금액이 부족해 더이상 게임 진행 불가");
			}
		}
		
		System.out.println("게임 종료");
		
	}
}
