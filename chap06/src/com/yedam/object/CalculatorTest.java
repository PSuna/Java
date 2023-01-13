package com.yedam.object;

import java.util.Calendar;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int result = calc.sum(10, 20);
		System.out.println(result);
		
		Calculator calc1 = new Calculator();
		int result1 = calc.sum(10, 20);
		System.out.println(result1);
		
		System.out.println(calc == calc1);
		
		CalculatorSingle calcSingle = CalculatorSingle.getInstance(); // 생성되어있는 객체를 참조
		CalculatorSingle calcSingle2 = CalculatorSingle.getInstance();
		System.out.println(calcSingle == calcSingle2); // true
		
		// Calendar today = new Calendar(); // Calendar은 싱글톤이므로 new로 접근 불가 
		Calendar today = Calendar.getInstance(); // 싱글톤
		today.set(2023,2,1); // month : 1월은 0부터 시작
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
		
	}

}
