package java복습;

public class EmpDept extends Employee{
	//속성
	private String deptName;
	//생성자
	public EmpDept(String name, int salary, String deptName) {
		super(name, salary);  // 자식 객체 만들때 부모클래스 생성자 상속받아야.(거쳐야)
		this.deptName =deptName; 
	}
	
	
	//getter
	public String getDeptName() {
		return deptName;
	}
	//메소드 -Employee 클래스 메소드 오버라이딩
	@Override  //default , protected
	public void getInformation() {
		System.out.println("이름: "+ name +" 연봉: "+ salary +" 부서: "+deptName);
	}

	@Override
	public void print() {
		
		super.print();  //부모 클래스에 있는 print 메소드 호출
		System.out.println("서브클래스");
	}
	
	

}
