package middle.numberscount2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// A × B × C를 계산한 결과에 
		// 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] count = new int[10]; // 계산결과에 0 ~ 9까지의 숫자가 몇번쓰였는지 저장하는 배열
		
		String result = String.valueOf(A * B * C); // int -> String 변환
		
		
		for(int i = 0; i < result.length(); i++) {
			char charNum = result.charAt(i); // i번째 인덱스가 가지는 숫자(문자)를 가져옴
			int num = charNum - '0'; // 아스키코드값을 이용해서('0' : 48 시작) 순수한 숫자값을 구해줌
			count[num]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
	}

}
