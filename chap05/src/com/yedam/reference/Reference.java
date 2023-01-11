package com.yedam.reference;

public class Reference {

	public static void main(String[] args) {
		int intVal = 10;
		int[] array = {1,2,3,4,5,6}; // 배열
		int[] array2 = {1,2,3,4,5,6};
		int[] array3 = null;
		
		System.out.println(array); // array 주소번지
		System.out.println(array2); // array2 주소번지
		System.out.println(array==array2); // 같은 데이터를 가지고있지만 서로 다른 주소번지를 가짐
		System.out.println(intVal);
		System.out.println(array3[0]); // NullPointerException 오류
		
	}

}
