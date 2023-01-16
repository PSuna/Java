package com.yedam.ch06;

import com.yedam.ch05.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; // default
//		a.field3 = 1; // private
		
		a.method1();
//		a.method2(); // default
//		a.method3(); // private
	}

}
