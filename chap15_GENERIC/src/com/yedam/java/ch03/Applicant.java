package com.yedam.java.ch03;

public class Applicant<T> {

	public T kind; // 신분
	
	public Applicant(T kind) {
		this.kind = kind;
	}
	
}
