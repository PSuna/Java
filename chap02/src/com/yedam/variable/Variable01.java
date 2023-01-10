package com.yedam.variable;

public class Variable01 {

	public static void main(String[] args) {
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60)+ minute;
		System.out.println("총 "+totalMinute+"분");
		
		int value = 0;
		
		int result = value + 10; // value 초기화 안하면 오류가뜸
		System.out.println(result);
		
		int x = 3;
		int y = 5;
		
		// x -> y값으로 변경
		// y -> x값으로 변경
		
		// 대신 담아줄수 있는 변수가 필요
		int z = 0;
		
		//x의 데이터를 미리z에 담아두고,
		// 1) x -> z, (z = 3)
		z = x;
		// 2) y -> x, (x = 5)
		x = y;
		// 3) z -> y, (y = 3)
		y = z;
		
		
		
	}

}
