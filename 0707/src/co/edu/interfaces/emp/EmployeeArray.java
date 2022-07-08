package co.edu.interfaces.emp;

import java.util.Scanner;

public class EmployeeArray implements EmployeeList {
	//싱글톤
	private static EmployeeArray instance= new EmployeeArray();
	private EmployeeArray() {}
	public static EmployeeArray getInstance() {
		return instance;
	}

	Employee[] list;// 사원정보를 배열.
	int empNum;
	Scanner scn = new Scanner(System.in);
	
	@Override
	public void init() {  //추가기능
		System.out.println("사원수 >> ");
		int num=Integer.parseInt(scn.nextLine());
		list = new Employee[num];
		
		
	}

	@Override
	public void input() {
		System.out.printf("%d 사번입력> ",empNum);
		int no = Integer.parseInt(scn.nextLine());
		
		System.out.print("이름> ");
		String name =scn.nextLine();
		System.out.println("급여> ");
		int sal = Integer.parseInt(scn.nextLine());
		
		list[empNum++]= new Employee(no,name,sal);
		
	}

	@Override
	public Employee search(int empId) {
		for (int i =0; i<empNum;i++) {
			if(list[i].getEmployeeId() == empId) {
				return list[i];
			}
		}
		
		return null;
	}

	@Override
	public void printList() {
		for(int i =0; i<empNum;i++) {
			System.out.printf("%5d %10s %7\n", list[i].getEmployeeId(),list[i].getName(),list[i].getSalary());
		}
		
		
	}

}
