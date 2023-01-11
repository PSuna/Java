package com.yedam.array;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		// 한 학생의 성적을 입력.
		// 과목 수
		int subjectNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====================================================");
			System.out.println("1. 과목수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료");
			System.out.println("=====================================================");
			System.out.print("메뉴 입력> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				
				System.out.print("과목수를 입력하세요> ");
				subjectNum = Integer.parseInt(sc.nextLine());
				
			}else if(selectNo == 2) {
				
				// 배열의 크기 설정
				scores = new int[subjectNum]; // 과목수 저장
				
				// 점수 입력
				for(int i = 0 ; i < scores.length; i++) {
					System.out.print("scores[" + i + "]" + "의 점수를 입력하세요> ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				
			}else if(selectNo == 3) {
				
				// 출력
				for(int i =0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] = " + scores[i]);
				}
				
			}else if(selectNo == 4) {
				
				//총합 , 평균
				int sum = 0;
				double avg = 0;
				for(int i = 0; i< scores.length; i++) {
					sum += scores[i]; // 총합 계산
				}
				avg = (double) sum / scores.length;
				System.out.println("총합: " + sum);
				System.out.println("평균: " + avg );
				
			}else if(selectNo == 5) { // 종료
				System.out.println("end of prog");
				break;
			}
		}
		
	}

}
