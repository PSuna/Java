package com.yedam.java.ch01.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		// Java JDBC  Database Servlet/JSP iBATIS
		list.add("Java");
		int size = list.size(); // length와 같은 의미
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		// list[index] => list.get(index)와 같은 의미
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d : %s\n", i, list.get(i));
		}
		System.out.println();
		
		list.remove(2); // Database 제거
		list.remove(2); // Servlet/JSP 제거
		list.remove("Java"); // ★★ 중복되는 객체가 있을때 index가 작은값이 먼저 제거됨 ★★
		
		for(String data : list) {
			System.out.println(data); 
		}
		
		
	}
		
}
