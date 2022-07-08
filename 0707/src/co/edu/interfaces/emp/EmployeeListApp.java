package co.edu.interfaces.emp;

import java.util.Scanner;

public class EmployeeListApp {
	public static void main(String[] args) {
		
		EmployeeList app = EmployeeArray.getInstance();
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.사원수(초기화) 2.사원입력 3.사원리스트 4.상세검색 9.종료");
			System.out.println("선택> ");
			
			int selectNo = scn.nextInt();
			if(selectNo == 1) {
				for(int i =0; i<employeeId.length; i++)
					int sum;
					sum += i;
					
				
			}else if(selectNo ==2) {
				
			}else if(selectNo ==3) {
				
			}else if(selectNo ==4) {
				System.out.println("검색할 사번입력> ");
				int empId = scn.nextInt();
				Employee emp = app.search(empId);
				System.out.println(emp.getDetailInfo()); 
				
			}else if(selectNo ==9) {
				System.out.println("프로그램 종료합니다.");
				break;
			}
		}//end of while()
		System.out.println("프로그램 종료.");
	}
}
