package basic.oven2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// H : 시 , M : 분, cookMinute : 요리하는데 필요한 시간(분단위)
		// 24시간 표현 : 0시 0분 ~ 23시 59분
		
		// case 1 : M + cookMinute < 60 인경우 H : 변동없음 / M = M + cookMinute
		// case 2 : M + cookMinute >= 60 인경우 H = H + (M + cookMinute)/60 / M = (M + cookMinute) % 60
			// case 2-1 : 계산 결과가 H > 23 인경우 H = H - 24 (0시부터 시작이므로) / M 변동없음
		
		
		Scanner sc = new Scanner(System.in);
		
		// nextInt : 스페이스, 탭, 엔터로 값이 구분됨
		int H = sc.nextInt();
		int M = sc.nextInt();
		int cookMinute = sc.nextInt();
		
		int sumMinutes = M + cookMinute; // 현재시각의 분 + 요리하는데 필요한시간(분)
		
		// case 1 : M + cookMinute < 60 인경우 H : 변동없음 / M = M + cookMinute
		if(sumMinutes < 60) {
			System.out.println(H + " " + sumMinutes);
		// case 2 : M + cookMinute >= 60 인경우 H = H + (M + cookMinute)/60 / M = (M + cookMinute) % 60
		}else {
			H = H + (sumMinutes/60);
			M = sumMinutes % 60;
			
			// case 2-1 : 계산 결과가 H > 23 인경우 H = H - 24 (0시부터 시작이므로) / M 변동없음
			if(H > 23) {
				H = H - 24; // 0시부터 시작이므로
			}
			
			System.out.println(H + " " + M);
		}
	}
}
