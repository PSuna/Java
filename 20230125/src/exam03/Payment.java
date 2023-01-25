package exam03;

public interface Payment {

	double ONLINE_PAYMENT_RATIO = 0.05; // 온라인 결제 할인율 5%
	double OFFLINE_PAYMENT_RATIO = 0.03; // 오프라인 결제 할인율 3%
	
	public int online(int price); // 온라인 결제 메서드
	public int offline(int price); // 오프라인 결제 메서드
	public void showInfo(); // 결제 정보 출력 메서드
	
}
