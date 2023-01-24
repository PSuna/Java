package basic.minmax10818;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // N : 정수의 개수
		int[] A = new int[N]; // N개의 정수를 가지는 배열A
		int min = 0; // 최솟값
		int max = 0; // 최댓값
		
		for(int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		// 최솟값, 최댓값 구하기
		min = A[0]; // A배열의 첫번째값을 대입
		max = A[0]; // A배열의 첫번째값을 대입
		
		for(int i = 0; i < A.length; i++) {
			if(min > A[i]) { // 최솟값
				min = A[i];
			}
			
			if(max < A[i]) { // 최댓값
				max = A[i];
			}
		}
		
		System.out.println(min + " " + max);
		
	}

}
