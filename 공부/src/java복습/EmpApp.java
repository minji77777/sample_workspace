package java복습;

public class EmpApp {
	public static void main(String[] args) {
		Employee emp= new EmpDept("이지나",3000,"교육부");
		emp.getInformation();
		emp.print();
		//부모 타입(오버라이딩된 자식 메소드 사용가능)에 자식클래스로 초기화.
		//다형성 - 클래스 타입 변환
		
	}

}
