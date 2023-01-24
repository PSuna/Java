package basic.week1924;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 2007년 1월 1일 월요일
		// x : 월 , y : 일
		// 31일 : 1, 3, 5, 7, 8, 10, 12
		// 30일 : 4, 6, 9, 11
		// 28일 : 2

		// 1월 1일 ~ x월 y일까지의 날짜를 다 더해서 % 7(요일)
		// 나머지 0 : Sun , 1 : Mon, 2 : TUE, 3: WED, 4 : THU, 5: FRI, 6: SAT

		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); // 월
		int y = sc.nextInt(); // 일
		int sumDays = 0; // x월 y일까지의 날짜(days)합계

		for (int i = 0; i < x - 1; i++) { // x-1월까지의 days를 구함
			sumDays += months[i];
		}
		sumDays += y; // y일까지의 days를 더해줌 => 결과 : 1월 1일 ~ x월 y일까지의 days가 나옴
		
		int week = sumDays % 7; // 나머지 계산

		switch (week) {
			case 0:
				System.out.println("SUN");
				break;
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;
		}

	}

}
