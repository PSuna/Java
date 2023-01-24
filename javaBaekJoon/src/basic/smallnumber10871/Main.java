package basic.smallnumber10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 정수 N개
		int X = sc.nextInt(); 
		
		int[] A = new int[N]; // 정수 N개로 이루어진 수열 A
		
		// 배열의 값을 입력받음
		for(int i = 0; i < A.length ; i++) { 
			A[i] = sc.nextInt();
		}
		
		// 배열A에서 X보다 작은수 출력
		for(int i = 0; i < A.length; i++) { 
			if(A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
		
	}

}
