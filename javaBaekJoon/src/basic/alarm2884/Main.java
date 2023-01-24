package basic.alarm2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// H시 M분, 시간을나타낼때 불필요한 0은 사용하지않음
		// 입력시간: 24시간 표현을 사용 => 시작 0:0(자정) , 끝 23:59(다음날 자정 1분전)
		
		// case1 : M >= 45 일때, H 변동없음 / M - 45
		// case2 : M < 45 일때 , H-1 / 60 + M - 45 = M + 15
		// case3 : H = 0 이고 M < 45일때, H = 23 / 60 + M - 45 = M + 15
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); // 시
		int M = sc.nextInt(); // 분
		
		// case1 : M >= 45 일때, H 변동없음 / M - 45
		if(M >= 45) {
			System.out.println(H + " " + (M-45));
		}else if(M < 45) {
			// case3 : H = 0 이고 M < 45일때, H = 23 / 60 + M - 45 = M + 15
			if(H == 0) {
				H = 23;
				System.out.println(H + " " + (M+15));
			// case2 : M < 45 일때 , H-1 / 60 + M - 45 = M + 15
			}else {
				System.out.println((H-1) + " " + (M+15));
			}
		}
		
	}
}
