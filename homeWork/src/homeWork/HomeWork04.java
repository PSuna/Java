package homeWork;

import java.util.Scanner;

public class HomeWork04 {

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
		
		Scanner sc = new Scanner(System.in);
		Product[] product = null;
		int count = 0;
		int sum = 0;
		int max = 0;
		int maxIndex = 0;
		while(true) {
			System.out.println("=======================================================");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("=======================================================");
			
			System.out.println("메뉴번호를 선택하세요> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				System.out.print("상품수를 입력하세요> ");
				count = Integer.parseInt(sc.nextLine());
			}else if(menu == 2) {
				product = new Product[count];
				for(int i =0; i<product.length; i++) {
					
					System.out.println("상품명을 입력하세요> ");
					String proName = sc.nextLine();
					
					System.out.println("가격을 입력하세요> ");
					int price = Integer.parseInt(sc.nextLine());

					product[i] = new Product(proName, price);
				}
			}else if(menu == 3) {
				for(int i = 0; i<product.length; i++) {
					System.out.println(product[i].proName + " : " + product[i].price);
				}
			}else if(menu == 4) {
				//최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합
				//분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				for(int i = 0 ; i < product.length; i++) {
					max = product[i].price;
					if(max < product[i].price) {
						max = product[i].price;
						maxIndex = i;
					}
				}
				System.out.println("최고가격을 가지는 제품" + product[maxIndex].proName +"가격: " + max);
				
				for(int i = 0; i < product.length; i++) {
					if(i == maxIndex) {
						continue;
					}else {
					sum += product[i].price;
					}
				}
				System.out.println("최고 가격을 가지는 제품을 제외한 제품들의 총합 : " + sum);
				
			}else if(menu == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
		
		
		

	}

}
