package exam03;

public class SimplePayment implements Payment {

	// 필드
	private double simplePaymentRatio; // 간편결제 할인율
	
	// 생성자
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	@Override
	public int online(int price) {
		int result = price - (int) (price * (this.simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO));
		return result;
	}

	@Override
	public int offline(int price) {
		int result = price - (int) (price * (this.simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO));
		return result;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (this.simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제시 총 할인율 : " + (this.simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO));
	}
	
}
