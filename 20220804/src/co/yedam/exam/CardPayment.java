package co.yedam.exam;

public class CardPayment implements Payment {
	/*
	 * - 필드로 카드할인율(cardRatio)을 가진다. - 생성자를 통해 매개변수로 값을 받아 필드를 초기화 한다. - 아래의 실행코드와
	 * 실행결과를 참조하여 Payment 인터페이스 메서드를 오버라이딩 한다.
	 */

	// 필드
	public double cardRatio;

	// 생성자
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	@Override
	public int online(int price) {
		// 온라인 할인율 + 카드결제 할인율
		int pay = (int)(price - (price*(Payment.ONLINE_PAYMENT_RATIO + cardRatio )));
		return pay;
	}

	@Override
	public int offline(int price) {
		int pay = (int)(price - (price*(Payment.OFFLINE_PAYMENT_RATIO+cardRatio)));
		return pay;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율: " + (Payment.ONLINE_PAYMENT_RATIO + cardRatio ));
		System.out.println("오프라인 결제시 총 할인율: "+ (Payment.OFFLINE_PAYMENT_RATIO+cardRatio));
		

	}

}
