package com.yedam.variable;

public class OperatorCasting {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		// 결국엔 long이 가장 큰 범위이므로 나머지값들도 long으로 자동 타입변환됨
		long result = value1 + value2 + value3;
		System.out.println(result);
		
		
		// 실수와 정수 타입변환(연산)
		int intValue1 = 10;
		int intValue4 = intValue1/4; // 10/4 => 2가 됨
		System.out.println(intValue4); // => 2가 나옴
		
		int intValue2 = 10;
		double intValue3 = intValue2 / 4.0; // 피연산자중 하나가 실수(double)이므로 결과는 실수로 나옴
		System.out.println(intValue3); // => 2.5가 나옴
		
		int x = 1;
		int y = 2;
		double result2 = x/y; // 둘다 int/int 이므로 0이 나옴
		System.out.println(result2); // => 0이 나옴
		
		//★★★ 해결법 : 둘중하나를 double로 바꿔줘야함
		result2 = (double)x/y; 
		System.out.println(result2); // => 0.5가 나옴
			
		// + 연산
		// 숫자 연산(더하기)
		int value = 10 + 2 + 8;
		System.out.println(value); // => 20 이 나옴
		
		// 문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1:" + str1); // => "(10+2)" + "8" => 따라서 128 이 나옴
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2); // => 1028이 나옴
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3); // => 1028이 나옴
		
		String str4 = "10" + (2+8); // 2+8이 먼저 연산됨
		System.out.println("str4: " + str4); // => 1010이 나옴
		
		// String <-> 정수, 실수 타입변환
		int valueStr = Integer.parseInt(str4); // 문자열(1010)을 기본타입(int)으로 바꿔줌
		System.out.println(valueStr); // => 숫자 : 1010
		
		//byte byteValue = Byte.parseByte(str4);
		
		short shortValue = Short.parseShort(str4);
		long longValue = Long.parseLong(str4);
		
		double dValue = Double.parseDouble(str4);// 문자열(1010)을 기본타입(double)으로 바꿔줌
		System.out.println(dValue); // => 실수 : 1010.0
		//boolean bValue = Boolean.parseBoolean(str4);
		
		
		// int -> String
		String str5 = String.valueOf(valueStr);
		// long -> String
		String str6 = String.valueOf(longValue);
		// double -> String
		String str7 = String.valueOf(dValue);
	}

}
