package basic.fasterplus15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		
		// BufferedReader : Scanner와 비슷한 기능
		// BufferedWriter : System.out.println()과 비슷한 기능
		
		// 버퍼 : 데이터를 한곳에서 다른 한곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역
		// 입출력 속도 향상을 위해 버퍼를 사용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			// readLine() : String 타입을 반환
			// readLine() : IOException에 대한 예외 처리 필요
			// readLine() : Scanner처럼 공백과 개행 단위로 끊지 않고, 개행(\n)만 단위로 끊어준다.
			// Integer.parseInt : String -> int
			
			int T = Integer.parseInt(br.readLine()); // T : 테스트케이스의 개수
			
			for(int i = 0; i < T; i++ ) {
				String numbers = br.readLine();
				int A = Integer.parseInt(numbers.split(" ")[0]);
				int B = Integer.parseInt(numbers.split(" ")[1]);
				
				// write() : 문자 또는 문자열을 출력한다.
				// 숫자 타입의 변수만 넣고싶은경우 String.valueOf() 메소드를 이용해 문자로 변환해야함
				bw.write(A+B + "\n");
				
			}
			
			br.close();
			bw.flush(); // 버퍼를 비워내는 동시에 버퍼에 저장되어있는 데이터들을 콘솔에 출력시킴(버퍼를 비우는 동작)
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
