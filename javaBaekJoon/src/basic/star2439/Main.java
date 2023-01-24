package basic.star2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ex) N = 5일때
		// 첫째줄 : 공백4 , 별1
		// 둘째줄 : 공백3 , 별2
		// 셋째줄 : 공백2 , 별3
		// 넷째줄 : 공백1 , 별4
		// 다섯째줄 : 공백0, 별5

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= N; j++) {
				if (j < N-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
	}

}
