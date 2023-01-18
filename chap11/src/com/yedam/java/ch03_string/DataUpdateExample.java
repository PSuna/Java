package com.yedam.java.ch03_string;

public class DataUpdateExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "24"); // 삽입
		System.out.println(sb.toString());
		
		sb.replace(7, 14, "Book"); // 대체(수정)
		System.out.println(sb.toString());
		
		String result = sb.toString(); // 더이상 수정하고싶지않다면 값을 저장해줘야함
		sb.delete(0, 4); // 삭제
		System.out.println(result);
		System.out.println(sb.toString());
		
	}

}
