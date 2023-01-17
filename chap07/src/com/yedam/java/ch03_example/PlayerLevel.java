package com.yedam.java.ch03_example;

public abstract class PlayerLevel {
	
	// 추상메소드 run, jump , turn : 메소드 오버라이딩을 통해 레벨마다 출력값이 달라짐
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	// 같은 프로세스를 가지기 때문에(오버라이딩해도 실행문이 달라지지않음) 일반 메서드임
	public final void go(int count) { 
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}

}
