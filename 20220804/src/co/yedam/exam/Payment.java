package co.yedam.exam;

public interface Payment {
	//<상수필드>
	//1) 온라인 결제 할인율 (ONLINE_PAYMENT_RATIO), 5%
    //2) 오프라인 결제 할인율 (OFFLINE_PAYMENT_RATIO), 3%  
	
	//온라인 결제 할인율 (static final -> 다른 인스턴스에서도 사용가능)
	public static final double ONLINE_PAYMENT_RATIO =0.05;  //상수는 보통 대문자
	//오프라인 결제 할인율
	public static final double OFFLINE_PAYMENT_RATIO=0.03;
	
	
	//추상 메소드 -> 상속받은 놈들 강제로 오버라이딩 해야
	public abstract int online(int price);  //interface에선 abstract 생략해도 똑같아 (public int online(int price);)
	public int offline(int price);
	public void showInfo();
	
	
}
