package com.yedam.java.ch01_01;

public interface RemoteControl {

	// 상수 : 무조건 대문자 , 상수는 무조건 초기값이 있어야함
	// 내가 따로 static final로 선언하지않아도 static final로 인식함
	public int MAX_VALUE = 10;
	public static final int MIN_VALUE = 0;
	
	
	// 내가 따로 abstract를 선언하지 않아도 추상메소드로 인식함
	// 추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
	// 일반 메소드 : default 키워드를 붙여줘야함
	public default void method() {
		System.out.println("일반 메소드입니다.");
	}
	
}
