package middle.numbersum11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// N개의 숫자가 공백없이 쓰여있음 => 이 숫자들을 모두 합해서 출력하기
		// N : 숫자의 갯수
		
		// int형으로 값을 받을 경우 : 각 자리의수를 구해서 다 더하기 => 일의자리 + 십의자리 + 백의자리... 
		// => 계산이 복잡하고, 숫자가 커지면 별로임
		
		// String으로 값을 받을 경우 : charAt을 사용하여 숫자(문자)를 하나씩 가져와서 더하기
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine()); // N : 숫자의 갯수
		String numbers = sc.nextLine(); // N개의 숫자
		int sum = 0;
		
		for(int i = 0; i <N ; i++) {
			//charAt(int index) : 매개값으로 주어진 인덱스의 문자리턴 => char 반환
			char charNum = numbers.charAt(i);
			
			// char형 숫자를 int형으로 변환하는법 => char형 변수는 아스키 코드값을 정수 형태로 저장하고있다는걸 이용
			// 숫자의 아스키코드 값은 48번부터 0 ~ 9를 할당하고 있음
			// char형 '1'은 정수값(아스키코드값) 49를 가짐
			// 따라서 0의 정수값(아스키코드값)인 48을 char형(숫자)의 값에서 빼주면 순수한 숫자값를 얻어낼 수 있음
			
			int num = charNum - '0'; // char => int 자동변환
			sum += num;
		}
		System.out.println(sum);
	}
}
