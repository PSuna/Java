package com.yedam.java.ch02_02;

public interface SmartTV extends RemoteControl, Searchable { // 상속받음
	
	public void alarm(String time);
	
}
