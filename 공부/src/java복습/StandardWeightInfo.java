package java복습;

public class StandardWeightInfo extends Human{
	//필드
	
	//생성자 - 부모클래스와 같이 초기화
	public StandardWeightInfo(String name, double tall, double weight) {
		super(name, tall, weight); // 부모 생성자 거쳐야돼. 
	}
	
	//메소드
	@Override
	public void getInformation() {
		
	System.out.println("이름: "+name+"키: "+tall+"몸무게: "+weight+" 표준체중: "+getStandardWeight(tall));
	}
	public double getStandardWeight(double height) {
		return (height-100)*0.9;
		
		
		
	}
	
	//getter
	
	
	

}
