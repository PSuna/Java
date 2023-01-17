package com.yedam.java.example;

public interface Scheduler {

	public void getNextCall(); // 상담원 : 다음 전화를 어떤걸 기준으로 받을지
	public void sendCallToAgent(); // 배분 방법 : 현재 새롭게 들어온 call에 대하여 어떤식으로 배분할지 결정
	
}
