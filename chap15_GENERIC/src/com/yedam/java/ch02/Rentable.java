package com.yedam.java.ch02;

public interface Rentable<P,I> {

	// 추상 메소드
	P rent();
	I getCount();
	
}
