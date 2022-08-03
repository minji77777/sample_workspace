package java복습;

import java.util.Scanner;

public class Age {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하시오> ");
		String Num = scn.nextLine();
		String birth = Num.substring(0, 2);
		
		int b =Integer.parseInt(birth);
		int age ;
		System.out.print("태어난 연도는>");
		if(b>23) {
			age = 2022-(1900+b)+1;
			System.out.println(1900+b);
			System.out.println("나이는 > ");
			System.out.println(age);
			
		} else {
			age = 2022-(2000+b)+1;
			System.out.println(2000+b);
			System.out.println("나이는 > ");
			System.out.println(age);
		}
	}

}
