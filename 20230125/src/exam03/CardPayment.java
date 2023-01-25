package exam03;

public class CardPayment implements Payment {

	// 필드
	private double cardRatio; // 카드 할인율
	
	
	// 생성자
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	// 메소드
	@Override
	public int online(int price) {
		int result = price - (int) (price * (this.cardRatio + Payment.ONLINE_PAYMENT_RATIO));
		return result;
	}


	@Override
	public int offline(int price) {
		int result = price - (int) (price * (this.cardRatio + Payment.OFFLINE_PAYMENT_RATIO));
		return result;
	}


	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (this.cardRatio + Payment.ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제 시 총 할인율 : " + (this.cardRatio + Payment.OFFLINE_PAYMENT_RATIO));
	}
	
	
}
