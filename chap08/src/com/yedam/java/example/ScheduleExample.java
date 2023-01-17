package com.yedam.java.example;

import java.util.Scanner;

public class ScheduleExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scheduler scheduler = null;
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");
		
		
		String ch = scanner.next();
		
		if("R".equals(ch) || "r".equals(ch) ) {
			scheduler = new RoundRobin(); // 한명씩 차례로 할당
		}else if("L".equals(ch) || "l".equals(ch) ) {
			scheduler = new LeastJob(); // 쉬고있거나 대기가 가장적은 상담원에게 할당
		}else if("P".equals(ch) || "p".equals(ch)) {
			scheduler = new PriorityAllocation(); // 우선순위가 높은 고객먼저 할당
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		// 추상클래스로도 만들수 있음
		scheduler.getNextCall(); // 상담원 : 다음 전화를 어떤걸 기준으로 받을지
		scheduler.sendCallToAgent(); // 배분 방법 : 현재 새롭게 들어온 call에 대하여 어떤식으로 배분할지 결정
	}
}
