package java복습;
//부모클래스
public class Human {
	//속성(필드)
	 String name;
	 double tall;
	 double weight;
	 //생성자 -생성과 동시에 초기화
	 public Human(String name, double tall, double weight) {
		 this.name = name;
		 this.tall =tall;
		 this.weight= weight;
	 }
	 //메소드
	 public void getInformation() {
		 System.out.println("이름: "+name+" 키: "+tall+" 몸무게: "+weight);
	 }
	 //getter
	public String getName() {
		return name;
	}
	public double getTall() {
		return tall;
	}
	public double getWeight() {
		return weight;
	}
	 

}
