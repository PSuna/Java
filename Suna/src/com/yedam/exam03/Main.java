package com.yedam.exam03;

public class Main {
	public static void main(String[] args) {
		// 큰 금액부터 동전을 우선적으로 거슬러줘야한다.
		// 출력예시) 500원 : 5개 , 100원 : 1개, 50원 : 1개, 10원 : 3개
		
		int[] coinUnit = new int[4];
		
		int money = 2680;
		
		System.out.println("money=" + money);
		
//		for(int i =0; i<coinUnit.length; i++) {
//			// 해당부분코딩
//			// cointUnit[0] 일때 500원의 개수 저장
//			// cointUnit[1] 일때 100원의 개수 저장
//			if(i == 0) {
//				coinUnit[i] = 2680 / 500;
//			}else if(i == 1) {
//				coinUnit[i] = (2680 % 500) / 100;
//			}else if(i == 2) {
//				coinUnit[i] = ((2680 % 500) % 100) / 50;
//			}else if(i == 3) {
//				coinUnit[i] = (((2680 % 500) % 100) % 50) / 10;
//			}
//		}
		
		for(int i = 0; i<coinUnit.length; i++) {
			if(money >= 500) {
				coinUnit[i] = money / 500;
				money = money % 500;
				System.out.println("500원 : " + coinUnit[i] + "개");
			}else if(money >= 100) {
				coinUnit[i] = money / 100;
				money = money % 100;
				System.out.println("100원 : " + coinUnit[i] + "개");
			}else if(money >= 50) {
				coinUnit[i] = money / 50;
				money = money % 50;
				System.out.println("50원 : " + coinUnit[i] + "개");
			}else if(money >= 10) {
				coinUnit[i] = money / 10;
				money = money % 10;
				System.out.println("10원 : " + coinUnit[i] + "개");
			}
		}
		
		
		
//		System.out.print("500원 : " + coinUnit[0] + "개, " + "100원: " + coinUnit[1] + "개, " + "50원: "
//						+ coinUnit[2] + "개, " + "10원: " + coinUnit[3] + "개");
//		
	}
}
