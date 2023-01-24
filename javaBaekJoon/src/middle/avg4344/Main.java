package middle.avg4344;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 각 케이스마다 한줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째자리까지 출력
		// 비율 계산 = 평균을 넘는 학생들의 수 / 해당 테스트 케이스의 학생수 * 100
		
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt(); // 테스트 케이스의 갯수
		
		int N = 0; // 각 테스트 케이스마다 학생의 수
		int[] scores = null; // 해당 테스트 케이스의 학생들의 점수 배열
		double[] ratio = new double[C];// 비율
		
		// 테스트 케이스의 갯수만큼 for문 돌림
		for(int i = 0; i < C; i++) { 
			
			N = sc.nextInt(); // 학생
			scores = new int[N]; // 학생들의 수(N) 만큼 할당
			int sum = 0; // 합계
			double avg = 0; // 평균
			int count = 0; //평균을 넘는 학생들의 수
			
			// 점수들을 scores배열에 저장
			for(int j = 0; j < scores.length; j++) {
				scores[j] = sc.nextInt();
				sum += scores[j];
			}
			
			avg = (double)sum/scores.length; // 평균
			
			// 평균을 넘는 학생들의 수를 구하는 for문
			for(int k = 0; k < scores.length; k++) {
				if(scores[k] > avg) { // 평균을 넘으면
					count++;
				}
			}
			
			// 비율 계산 = 평균을 넘는 학생들의 수 / 해당 테스트 케이스의 학생수 * 100
			ratio[i] = (double)count / scores.length * 100; // 해당 테스트 케이스의 비율
		}
		
		for(int i = 0; i< ratio.length; i++) {
			System.out.printf("%.3f%% \n",ratio[i]);
		}
		
	}
}
