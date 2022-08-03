package java복습;

public class ObesityApp {
	public static void main(String[] args) {
		Human h1 = new StandardWeightInfo("홍길동", 168, 45);
		h1.getInformation();
		Human h2 = new ObesityInfo("박둘이", 168, 90);
		h2.getInformation();  // 부모 클래스를 오버라이딩한 자식의 메소드만 불러 쓸수 있다. 
		
	}

}
