package com.yedam.java.ch01.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		long start;
		long end;
		
		//ArrayList
		start = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			arrayList.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린시간  : " + (end-start) + " ns");
		
		// LinkedList
		start = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			linkedList.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("linkedList 걸린시간 : " + (end-start) + " ns");
		
	}

}
