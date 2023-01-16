package com.yedam.ch02_01;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) { // 누적 < 최대회전수
			System.out.println(location + " HankookTire 수명 : " +  (maxRotation - accumulatedRotation) + "회");
			return true;
		}else { // 누적 > 최대회전수
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
}
