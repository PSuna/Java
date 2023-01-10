package homeWork;

public class Question {

	public static void main(String[] args) {
		// [1번 문제]
		// 369게임
		// 3, 6, 9가 포함 되어있으면 짝으로 표기한다.
		// 아래 내용처럼 출력하면 되고, 출력 범위는 1~50으로 한다.

		// ※ 사칙연산을 활용해서 풀어볼 것.

		// 출력 예시) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 17 18 짝...
	    //            28, 짝, 짝, 짝, 짝, 짝짝,짝,짝,짝짝,짝,짝,짝짝, 40...50
		
		
		// 3 6 9 13 16 19 23 26 29
		
		// 3, 6, 9가 들어간것 "짝"
		for(int i = 1; i<=50 ; i++) { 
			if((i % 3 == 0) && (i < 10)) { // 10이하인 경우 3의 배수라면 "짝"
				System.out.println("짝");
				continue;
			}else if( (i%3==0) && (i<=20)) { // 10 ~ 20인 경우 3의배수 + 1
				System.out.println("짝");
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
