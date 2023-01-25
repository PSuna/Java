package exam02;

public class Card {
	
	// 필드
	private String cardNo; // 카드번호
	private String validDate; // 유효날짜
	private int cvc; // CVC
	
	// 생성자
	public Card(String cardNo, String validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}

	// 메소드
	public String getCardNo() {
		return cardNo;
	}

	public String getValidDate() {
		return validDate;
	}

	public int getCvc() {
		return cvc;
	}
	
	public void showCardInfo() {
		System.out.println("카드정보 ( Card NO : " + this.cardNo + ", 유효기간 : " + this.validDate + ", CVC : " + this.cvc + " )");
	}
	
	
}
