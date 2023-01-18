package com.yedam.java.ch01;

public class ExceptionExample {

	public static void main(String[] args) {
		// NullPointerException
//		String data = null;
//		System.out.println(data.toCharArray());

		// ArrayIndexOutOfBoundsException
		if (args.length > 2) { // 예외처리 코드 : 배열의 길이가 최소 2개 이상이어야함
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("arags[0] : " + data1);
			System.out.println("argas[1] : " + data2);
		}
		
		// NumberFormatException
//		String data3 = "100";
//		String data4 = "a200";
//		
//		int value3 = Integer.parseInt(data3);
//		int value4 = Integer.parseInt(data4); // 여기서 NumberFormatException 에러가 남
//		
//		int result = value3 + value4;
//		System.out.printf("%s + %s = %d \n",data3, data4, result);
		
		// ClassCastException
		// 매개변수에서 자동타입변환이 일어난후 => 메서드 호출의 실행문에서 강제타입변환이 일어남
		changeDog(new Dog()); 
		changeDog(new Cat()); // instanceof 연산자 실행문이 없다면 ClassCastException남
	
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) { // 예외 처리 코드
			Dog dog = (Dog)animal; // 강제타입변환
		}
	}
	
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}