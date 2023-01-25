package exam04;

public class Main {

	public static void main(String[] args) {
		String[] arr = {"010102-4", "991012-1", "960304-1", "881012-2", "040403-3"};
		int manCount = 0; // 남자수
		int femaleCount = 0; // 여자수
		
		for(int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i].substring(7,8));
			switch(num) {
				// 남자일 경우
				case 1:
				case 3:
					manCount++;
					break;
				// 여자일 경우
				case 2:
				case 4:
					femaleCount++;
					break;
			}
		}
		System.out.println("남 " + manCount + " 여 " + femaleCount);
	}
}
