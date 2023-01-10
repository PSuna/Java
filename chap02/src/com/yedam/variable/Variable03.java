package com.yedam.variable;

public class Variable03 {

	public static void main(String[] args) {
		
		int var1 = 0b1011; //2진수, 0b
		int var2 = 0206; //8진수, 0
		int var3 = 365; // 10진수
		int var4 = 0xB3; //16진수, 0x

		//출력할땐 10진수로 출력됨
		System.out.println("var1: " + var1); 
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
		byte bVar1 = 125; // 바이트의 허용 범위 : -128 ~ 127
		int bVar2 = 200;
		
		System.out.println("bVar1: " + bVar1);
		System.out.println("bVar2 " + bVar2);
		
		// Long : int 범위안에선 편하게 사용하면되지만 int 범위를 넘어서면 끝에 L을 붙여줘야함
		long lVar1 = 2000000;
		long lVar2 = 20000000000L;
		
		//char
		char c1 = 'A';
		char c2 = 65; // 유니코드
		char c3 = '\u0041'; // 16진수
		
		char c4 = '가';
		char c5 = 44032; // 유니코드
		char c6 = '\uac00'; // 16진수
		
		
		// char의 출력은 모두 문자가 나옴
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
	}
}
