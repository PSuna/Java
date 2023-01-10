package homeWork;

import java.util.Scanner;

public class HomeWork02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		// 문제출처, 백준(https://www.acmicpc.net/) 14681번 문제
		System.out.println("======== 1번 문제 ========");
		
		System.out.print("x의 값을 입력하세요> ");
		int x = Integer.parseInt(scanner.nextLine());
		System.out.print("y의 값을 입력하세요> ");
		int y = Integer.parseInt(scanner.nextLine());
		
		if(x > 0 && y > 0) {
			System.out.println("제1사분면");
		}else if(x < 0 && y > 0) {
			System.out.println("제2사분면");
		}else if(x < 0 && y < 0) {
			System.out.println("제3사분면");
		}else if(x > 0 && y < 0) {
			System.out.println("제4사분면");
		}
		
		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		// HiNT : 이중 IF문 사용
		// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
		System.out.println("======== 2번 문제 ========");
		System.out.print("연도를 입력하세요> ");
		int year = Integer.parseInt(scanner.nextLine()); // 연도
		if(year % 4 == 0) {
			if(year % 100 !=0 || year % 400 ==0) {
				System.out.println("윤년입니다.");
			}else {
				System.out.println("윤년이 아닙니다.");
			}
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		
		
		// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
		// 구현하세요.
		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.
		System.out.println("======== 3번 문제 ========");
		System.out.print("가위, 바위, 보중 하나를 입력하세요> ");
		String game = scanner.next();
		
		switch(game){
			case "가위":
				System.out.println("이기기 위해선 바위를 내야합니다.");
				break;
			case "바위":
				System.out.println("이기기 위해선 보를 내야합니다.");
				break;
			case "보":
				System.out.println("이기기 위해선 가위를 내야합니다.");
				break;
		}
		
		
		// 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
		// hint) 중첩 for문과 if문(띄어쓰기용도) 활용
		//     * 	1줄 공백4개 별1개
		//    **	2줄 공백3개 별2개
		//   ***	3줄 공백2개 별3개
		//  ****	4줄 공백1개 별4개
		// *****	5줄 		  별5개
		
		System.out.println("======== 4번 문제 ========");
		
		for(int i = 0 ; i < 5; i++) {
			for(int j = 1 ; j <= 5; j++) {
				if(j < 5-i ) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// 다른 풀이 방법
//		for(int i = 1 ; i <= 5; i++) {
//			for(int j =0; j<5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 0 ; k<i; k++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		

		// 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		System.out.println("======== 5번 문제 ========");
		scanner.nextLine(); // 3번문제에서 값을 scanner.next();로 받아서 엔터가 남아있으므로 없애기위해 사용
		System.out.print("m단을 입력하세요> ");
		int m = Integer.parseInt(scanner.nextLine());
		System.out.print("n번째를 입력하세요> ");
		int n = Integer.parseInt(scanner.nextLine());
		
		for(int i = 1; i<=n; i++) {
			System.out.println(m + " X " + i + " = " + (m*i));
		}
	}
}
