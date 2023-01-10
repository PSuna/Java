package com.yedam.variable;

public class Variable04 {

	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println(name);
		System.out.println(job);
		
		// 이스케이프 문자(console창에서 출력할때 사용)
		// 문자열(String) 사용
		// \t : tab만큼 벌려라
		// \n : enter (줄바꿈)
		// \r : 맨 앞줄로 이동
		
		System.out.println("번호\t이름\t직업"); // tip) println은 자동 줄바꿈이됨
		System.out.print("행 단위 출력 \n"); // tip) print는 줄바꿈이 안됨, \n은 줄바꿈
		System.out.println("우리는 \"개발자\" 입니다"); // 텍스트안에 특수문자(")를 표시하고싶을때 \와 같이씀
		System.out.println("봄\\여름\\가을\\겨울");// 텍스트안에 특수문자(\)를 표시하고싶을때 \와 같이씀
		
		// 실수
		// float , double
		
		float var1 = 3.14f; // f를 안붙이면 double로 인식하므로 뒤에 f를 꼭 붙여야함
		double var2 = 3.14;
		
		float var3 = 0.1234567890123456789f;
		double var4 = 0.1234567890123456789;
		
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
		double var6 = 3e6; // 3 * (10의6승)
		float var7 = 3e-3F; // 소수점표현
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		
		// 논리 타입(Boolean)
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		
	}

}
