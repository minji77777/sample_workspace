package co.edu.interfaces.emp;
/*
 * 기능 정의(선언)부분만 있어.
 */

public interface EmployeeList {
	
	// 배열 초기화.
	public void init();
	//사원정보입력.
	public void input();
	
	//사번에 해당하는 정보 조회
	public Employee search(int empId);
	
	//전체 출력.
	public void printList();

}
