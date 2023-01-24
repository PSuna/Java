package middle.findalphabet10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
		// 각각의 알파벳에 대해서, 
		// 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
		// 단어에 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine(); // 소문자로만 이루어진 단어 S
		int[] count = new int[26]; // 소문자 알파벳 총갯수 : 26개
		
		// 단어에 알파벳이 포함되어있지 않다면 -1의 값을 가지므로 초기화
		for(int i = 0; i<count.length; i++) {
			count[i] = -1; 
		}
		
		for(int i = 0; i < S.length(); i++) {
			char alphabet = S.charAt(i); // i번째 인덱스가 가지는 알파벳(문자)를 가져옴
			// 아스키코드값을 이용해서('a' : 97 부터 시작) count에 들어갈 index값을 구함
			// a : 0 , b : 1, c : 2 .....
			int index = alphabet - 'a'; 
			// indexOf : 매개값으로 주어진 문자가 시작되는 인덱스 리턴
			count[index] = S.indexOf(alphabet);
		}
		
		for(int i = 0; i< count.length; i++) {
			System.out.print(count[i] + " ");
		}
		
	}

}
