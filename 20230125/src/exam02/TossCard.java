package exam02;

public class TossCard extends Card {

	// 필드
	private String company = "Toss"; // 카드사
	private String cardStaff; // 담당직원
	
	
	// 생성자
	public TossCard(String cardNo, String validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}
	
	// 메소드
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO, " + super.getCardNo());
		System.out.println("담당직원 - " + this.cardStaff + ", " + this.company);
	}

}
