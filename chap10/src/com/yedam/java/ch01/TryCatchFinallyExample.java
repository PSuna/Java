package com.yedam.java.ch01;

import java.util.Scanner;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		// 일반 예외
		// Class.forName : 해당 클래스가 가지고 있는 정보(필드,생성자,메소드)등을 얻을수있음
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// 예외의 원인을 가장 정확하게 알려주는 코드 => 예외가 왜 발생하였는지 알려주는 코드 , 예외 원인이 정확하지 않을때 사용
			// e.printStackTrace();
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}

		// 실행 예외 : 개발자가 직접 try - catch 구문을 써야함
		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.printf("%s + %s = %d \n", data1, data2, result);
			
			throw new ClassCastException(); //예외를 강제로 발생시킴
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
		// 최상위 부모 클래스는 맨윗줄에 오면 안됨 => 왜냐 아래의 자식 예외클래스들은 실행되지않으므로 => 맨 아랫줄로 옮겨주면 좋음
		}catch(Exception e) { 
			System.out.println("정상적으로 실행되지 않았습니다.");
			//return; // 메소드 종료
		}finally { // 예외가 발생하던 안하던 무조건 실행되는 블럭, try-catch구문에서 return을 만나도 무조건 실행됨
			System.out.println("프로그램이 종료되었습니다.");
		}
		
		try {
			findClass();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	// throws : 예외 떠넘기기 => 다른곳에서 findClass() 메서드 호출시 호출하는곳에서 
	// NullPointerException에대한 예외처리코드가 필요함 (얘는 throw로 한거라 강제성이 부여되지않음 : 예외처리 안해도됨)
	// ClassNotFoundException은 무조건 예외처리 코드가 필요함
	public static void findClass() throws NullPointerException, ClassNotFoundException{ 
		String className = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고자 하는 클래스 이름을 적어주세요.");
		
		className = sc.nextLine();
		
		if(className == null || className.equals("")) { // 값을 입력하지않거나 빈값을 입력하면
			throw new NullPointerException(); // 예외 발생
		}
		
		Class clazz = Class.forName(className);
		
	}

}
