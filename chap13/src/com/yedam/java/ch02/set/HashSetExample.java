package com.yedam.java.ch02.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("iBATIS");
		set.add("Java");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		// 반복자
		Iterator<String> iterator = set.iterator();
		
		// 값 출력 : 향상된 for문을 사용해도됨
		while(iterator.hasNext()) { // iterator.hasNext() : 가져올수 있는 객체가 있는지 확인
			// iterator.next() : set안에있는 객체를 가지고오는애(걔를 가리키고있는 주소를 가져옴)
			String element = iterator.next(); 
			System.out.println("\t" + element);
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		// 향상된 for문으로 값을 출력할수도 있음 
		for(String skill : set) {
			System.out.println("\t" + skill);
		}
		
		System.out.println();
		
		set.clear(); // 저장된 객체들이 모두 삭제됨 : 인스턴스는 있지만 안에 내부에 값이 없다는 말
		
		if(set.isEmpty()) {
			System.out.println("내부가 비어있습니다.");
		}
		
		
	}

}
