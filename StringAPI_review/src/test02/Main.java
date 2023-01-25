package test02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 입력한 문자열 개수 세기
		// String b= "abcassb";
		// console 출력
		// a : 2개 , b : 2개, c : 1개 , s : 2개
		
		// 중복되는 문자가 몇개가 존재하는지,
		// a~z : 26개가 들어온다는 가정
		// 0 ~25, 각각의 인덱스 어떤 문자를 의미
		// 0 -> a , 1 -> b..... 25->z
		// 아스키코드 : a => 97, b => 98...
		// 내가 입력한 문자 - 97 = 배열의 인덱스값
		// "aabbccdd" -> 첫번째 a(내가 입력한 문자)
		// ary[내가 입력한 문자-97] => 0 ~ 25(a~z)의 자리와 갯수를 의미
		
		// <내가 한 풀이법>
		// 소문자 알파벳 갯수 26개
		// b의 문자열 길이 만큼 for문을 돌림
		// 하나씩 문자를 추출해서 해당하는 문자에대한 index를 count index에 넣고 ++ 해주기 
		// count배열의 값이 > 0 이면 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 셀 문자열을 입력하세요> ");
		String b= sc.nextLine().toLowerCase(); // toLowerCase() : 입력한 문자열 소문자로 변환
		int[] count = new int[26];
		
		for(int i = 0; i < b.length(); i++) {
			char alphabet = b.charAt(i); // 다른방식 (b.substring(i,i+1) 사용)
			int index = alphabet - 'a'; // 해당 알파벳에대한 index값 a : 0 , b : 1, c : 2 .....
			count[index]++;
		}
		
		for(int i = 0; i<count.length; i++) {
			if(count[i] > 0) {
				char alphabet = (char)(i + 'a');
				System.out.println(alphabet + " : "+ count[i] + "개");
			}
		}
			
		
		
	}

}
