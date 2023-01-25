package test03;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 만 나이 계산기(올해 기준 +- 100살)
		// 입력한 생년월일 6자리
		// ex. 000101 : 24살
		// ex. 95 : 29살
		
		// 1. 계산식(하드 코딩) -> 올해만 사용
		// 1-1) 2000년 이후 2023년 이전 출생 -> (23 - 태어난 연도) + 1
		// 1-2) 1923년 이후 2000년 이전 출생 -> (123 - 태어난 연도)
		
		// 1. 계산식(일반화)
		// Calendar , date(simpledateFormat) => 오늘 날짜, 년도
		// 1-1) 2000년 이후 2023년 이전 출생 -> (기준년도 - 태어난 연도)+1
		// 1-2) 1923년 이후 2000년 이전 출생 -> (기준년도 - 태어난 연도)
		
		
		// 내가 한 풀이 방법
		// 문자열로 생년월일을 입력받고
		// 앞에 2자리만 substring으로 추출
		// String => int로 변형
		// 90년생 1990년도로 변형 / 00년생 => 20000 년도로 변형
		// 나이계산해주기
		
		Scanner sc = new Scanner(System.in);
		int age = 0; // 나이
		
		System.out.print("생년월일(6자리)을 입력하세요> ");
		String strAge = sc.nextLine();
		int intAge = Integer.parseInt(strAge.substring(0, 2)); // 앞에 2자리만 추출 
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR); // 현재 연도
		
		if(intAge <= 23) { // 1-1) 2000년 이후 2023년 이전 출생 -> (기준년도 - 태어난 연도)+1
			System.out.println("나이 : " + (23-intAge)+1);
			
		// 1922 ~ 19999	
		}else if(intAge > 23) { // 1-2) 1923년 이후 2000년 이전 출생 -> (기준년도 - 태어난 연도)
			System.out.println("나이 : " + (123-intAge));
		}
		
		
		/*
		// 1930년생 ~ 2020
		if((intAge / 10) > 2) { 
			intAge = 1900 + intAge;
		}else {
			intAge = 2000 + intAge;
		}
		
		age = year - intAge; // 만 나이 계산
		System.out.println(age + "살");
		*/
	}

}
