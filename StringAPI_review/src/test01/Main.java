package test01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 문자열 뒤집기
		// 입력한 문자열에 대해서 뒤집기
		// String a = "abc12345" => console출력 : 54321cba
		
		Scanner sc =new Scanner(System.in);
		System.out.print("뒤집을 문자열 입력> ");
		String a = sc.nextLine();
		
		String result = "";
		for(int i = a.length()-1; i >= 0; i--) {
			char str = a.charAt(i);
			result += str;
		}
		
		System.out.println(result);
		
		
	}

}
