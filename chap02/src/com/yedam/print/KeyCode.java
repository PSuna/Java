package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;

public class KeyCode {

	public static void main(String[] args) throws IOException {
		// 문자 하나하나 밖에 안됨
		int keyCode = 0;
		
		System.out.println("입력>"); // => a 입력
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode); // => 97 (a)
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode); // => 엔터키 13 (CR:줄바꿈-엔터키)
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode); // => 엔터키 10 (LF:맨앞으로 이동)
		
		// Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력> ");
		
		// scanner.nextLine() 
		// => enter키 이전까지 데이터를 받아오세요 라는 말 
		// => enter를 기준으로 데이터를 읽어옴
		String inputData = scanner.nextLine();
		// scanner.nextInt(); // 숫자만 가져가고 엔터키가 남으므로 바로 scanner.nextLine()하면 남은 엔터키가 들어가서 바로 끝남
		System.out.println("Scanner 활용: " + inputData);
		
		
		// 기본타입은 ==으로 비교하면됨
		// 문자열 내용 비교
		if(inputData.equals("yedam")) {
			System.out.println("yedam과 일치합니다.");
		}
		
		
		
		
	}

}
