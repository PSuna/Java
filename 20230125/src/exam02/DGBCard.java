package exam02;

public class DGBCard extends Card{

	// 필드
	private String company = "대구은행"; // 카드사
	private String cardStaff; // 담당직원
	
	
	// 생성자
	public DGBCard(String cardNo, String validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}
	
	// 메서드
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 (Card NO : " + super.getCardNo() + ", 유효기간 : " + super.getValidDate() + ", CVC : " + super.getCvc() + " )");
		System.out.println("담당직원 - " + this.cardStaff + ", " + this.company);
	}

	
}
