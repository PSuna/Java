package com.yedam.object;

public class MethodTest {

	public static void main(String[] args) {
		//StringUtil su = new StringUtil();
		StringUtil.greet();
		
		// static 예시
		Integer.parseInt("50");
		
		StringUtil.greet("GoodMorning");
		
		int l = StringUtil.greetLength("GoodMorning");
		System.out.println(l);
	}
}
