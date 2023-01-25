package test04;

public class Main {

	public static void main(String[] args) {
		// StringBuilder
		// String 단점 보완
		
		// 메모리 5개 사용
		String a = "a";
		a += "a";
		a += "a";
		a += "a";
		a += "a";
		
		
		// 메모리 1개 사용
		StringBuilder sb = new StringBuilder();
		sb.append("aaa"); // "aaa"
		sb.append(11); // "aaa11"
		sb.append(false); //"aaa11false"
		
		System.out.println(sb); //"aaa11false"
		
		
	}

}
