package java복습;

public class ObesityInfo extends StandardWeightInfo{
	//필드
	//생성자
	public ObesityInfo(String name, double tall, double weight) {
		super(name, tall, weight);
	}
	//메소드

	@Override
	public void getInformation() {
		
		System.out.print("이름: "+name+" 키: "+tall+" 몸무게: "+weight);
		BMI(getObesity(weight,tall));
	}
	
	public double getObesity(double weight, double height) {
		return  (weight - super.getStandardWeight(height))/super.getStandardWeight(height)*100;
		
	}
	
	public void BMI(double bmi) {
		if(bmi <=18.5) {
			System.out.println(", 저체중입니다.");
		}else if(bmi <=22.9) {
			System.out.println(", 정상입니다.");
		}else if(bmi <= 24.9) {
			System.out.println(", 비만입니다. ");
		}else {
			System.out.println(", 고도비만입니다.");
		}
		
	}
     /*18.5 이하면 저체중 ／ 18.5 ~ 22.9 사이면 정상 ／ 23.0 ~ 24.9 사이면 과체중*/
}
