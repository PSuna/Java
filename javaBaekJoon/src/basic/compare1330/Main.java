package basic.compare1330;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// nextInt : 스페이스와 탭, 엔터로 값이 구분
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else if(A == B) {
			System.out.println("==");
		}
		
	}

}
