package java복습;

public class Employee {
	// 속성
	protected String name;
	protected int salary;

	// 생성자 -오버로딩
	
	public Employee(String name, int salary) {  // 매개변수 순서 달라도 돼. ex) prinln()메소드도 오버로딩이다. 
		this. name = name;
		this.salary =salary;
	}

	// 메소드
	public void getInformation() {
		System.out.println("이름: "+name+"연봉: "+salary);
	}
	public void print() {
		System.out.println("슈퍼클래스");
	}
	
	//getter - 이미 매개변수 입력되어 setter필요없음
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	

}
