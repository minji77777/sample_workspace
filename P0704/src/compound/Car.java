package compound;
/*
 * 자동차(object) => class(설계도)
 */
public class Car { // 설계도:클래스
	// 속성: 필드(class) :데이터가 저장되는 곳
	String model;
	int price;
	int maxSpeed;
	int speed;
	double weight; 
	double width;
	
	//생성자 : 필드의 초기값을 지정.
	public Car() {
		System.out.println("생성자 호출.");
		maxSpeed = 200;
	}
	public Car(String model,int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		
	}
	
	
	// 동작:메소드(기능)
	public void run() {    //void 결과 반환 . run 메소드
		System.out.println(model +"가 달립니다.");
		
	}
	public void start() {
		System.out.println(model+"가 출발합니다.");
	}
	public void stop() {
		System.out.println(model+"가 멈춥니다.");
	}
	public void showSpeed() {
		System.out.println("현재속도는 "+ speed+"km/h입니다.");
		
	}
	public void setSpeed(int speed) {  
		this.speed = speed;
	} //this. car 인스턴스
	
	
	
}
