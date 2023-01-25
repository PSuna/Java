package com.yedam.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
	
	Scanner sc = new Scanner(System.in);
	List<Lotto> list = new ArrayList<Lotto>();
	// List<int[]> list = new ArrayList<>(); 도 가능함
	// list에 int형 배열이 객체로 들어간다.
	// list -> {1,2,3}, new int[10] 등이 들어갈수있음
	
	public LottoApp() {
		run();
	}

	private void run() {
		int menu = 0;
		
		while (menu != 99) {
			manuInfo();
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				//로또 생성
				makeLotto();
				break;
			case 2:
				//로또 조회(내가 투입한 금액과 출력 번호)
				showInfo();
				break;

			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	
	private void manuInfo() {
		System.out.println("1. 로또 생성 | 2. 로또 조회 | 99. 프로그램 종료");
		System.out.print("메뉴 번호를 입력하세요> ");
	}
	
	private void makeLotto() {
		// 로직
		// 1. 금액에 따라 생성할 줄을 구하기 => 금액 / 1000 => 줄만큼 for문 돌림
		// 2. List를 이용하여 Lotto 객체를 넣어주기
		// 3. 중복되지않는 번호 6개를 int[] 배열에다가 넣어주기
		// 4. Lotto 객체의 setLottoNo()을 이용하여 int[] 배열 값을 저장
		// 5. List에 lotto 객체 넣어주기
		
		System.out.print("금액을 입력하세요> ");
		int price = Integer.parseInt(sc.nextLine());
		int line = price / 1000; // 생성할 줄
		
		for(int i = 0 ; i < line; i++) {
			
			int[] array = new int[6]; // 1 ~ 6개의 중복되지않는 번호를 저장하는 배열
			Lotto lotto = new Lotto();
			
			for(int j = 0; j < array.length; j++) {
				int lottoNum = (int)(Math.random()*45) + 1; // 1 ~ 45 번호
		
				// 중복되지 않는 번호 저장
				for(int k = 0; k < array.length; k++) { // for(int k =0; k < i ; k++) 도 가능
					if(array[k] == lottoNum) { // 중복되는 번호가 있다면 break
						j--;
						break;
					}
				}
				array[j] = lottoNum;
			}
			lotto.setLottoNo(array);
			list.add(lotto);
		}
	}
	
	private void showInfo() {
		System.out.println("구매 한 금액> " + (list.size() * 1000) + "원");
		
			for(int i = 0; i<list.size() ; i++) {
				
				int[] lottoArray = list.get(i).getLottoNo();
				System.out.print((i%5+1) + "번> ");
				
				for(int j = 0; j<lottoArray.length; j++) {
					System.out.print(lottoArray[j] + " ");
				}
				
				System.out.println();
				
				if((i+1)!=0 && (i+1)%5 == 0) {
					System.out.println("----------------------------");
				}
			}
	}

}
