package com.yedam.lotto;

public class Lotto {
	
		//클래스로 사용할 경우
		private int[] lottoNo; // 로또번호 배열
		// private List<int[]> lottoNo; 로도 할 수 있음
		
		private String name; // 이름

		public int[] getLottoNo() {
			return lottoNo;
		}

		public void setLottoNo(int[] lottoNo) {
			this.lottoNo = lottoNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
}
