package homeWork;

import java.util.Scanner;

public class HomeWork04Upgrade {
	
	static Scanner sc = new Scanner(System.in);
	
	// 함수로 바꾸기 
	public static int menuSelect() {
		System.out.println("=======================================================");
		System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
		System.out.println("=======================================================");
		
		System.out.println("메뉴번호를 선택하세요> ");
		int menu = Integer.parseInt(sc.nextLine());
		return menu;
	}
	
	public static int inputProductNo() {
		System.out.print("상품수를 입력하세요> ");
		int count = Integer.parseInt(sc.nextLine());
		return count;
	}
	
	public static Product[] insertProduct(int count, Product[] product) {
		product = new Product[count];
		for(int i =0; i<product.length; i++) {
			
			System.out.println("상품명을 입력하세요> ");
			String proName = sc.nextLine();
			
			System.out.println("가격을 입력하세요> ");
			int price = Integer.parseInt(sc.nextLine());

			product[i] = new Product(proName, price);
		}
		return product;
	}
	
	public static void print(Product[] product) {
		for(int i = 0; i<product.length; i++) {
			System.out.println(product[i].proName + " : " + product[i].price);
		}
	}
	
	public static void totalSum(Product[] product) {
		int sum = 0; // 총합
		int max = product[0].price; // 초기화
		int maxIndex = 0;
		
		for(int i = 0 ; i < product.length; i++) {
			if(max < product[i].price) {
				max = product[i].price;
				maxIndex = i;
			}
		}
		System.out.println("최고가격을 가지는 제품명: " + product[maxIndex].proName +", 가격: " + max);
		
		for(int i = 0; i < product.length; i++) {
			if(i == maxIndex) { // 최고가격을 가지는 제품의 인덱스라면
				continue;  // 건너뛰기
			}
			sum += product[i].price;
			
		}
		System.out.println("최고 가격을 가지는 제품을 제외한 제품들의 총합 : " + sum);
		
	}
	
	
	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
			
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
			
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		
		Product[] product = null;
		int count = 0;
		
		while(true) {
			
			int menu = menuSelect();
			
			if(menu == 1) {
				
				count = inputProductNo();
				
			}else if(menu == 2) {
				
				product = insertProduct(count, product);
				
			}else if(menu == 3) {
				
				print(product);
				
			}else if(menu == 4) {
				//최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합
				//분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				totalSum(product);
				
			}else if(menu == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}

}
