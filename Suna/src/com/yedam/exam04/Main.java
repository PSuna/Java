package com.yedam.exam04;

public class Main {

	public static void main(String[] args) {
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램
		// 2단 => 1 , 2
		// 3단 => 1, 2, 3
		// 4단 => 1, 2, 3, 4
		
		for(int i=2; i <= 9 ; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i >= j) {
					System.out.println(i + " X " + j + " = " + (i*j));
				}
			}
			System.out.println();
		}
	}

}
