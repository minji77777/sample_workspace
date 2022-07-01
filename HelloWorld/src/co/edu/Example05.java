package co.edu;

import java.util.Scanner;  // 자바의 lang 패키지 안에 없는 클래스는 import 해줘서 명시해줘야 해., java util 패키지에 있는 scanner라고 명시

public class Example05 {
	public static void main(String[] args) {
		// String name = new String("홍길동");    // 원래 클래스는 new라는 연산자 써야돼. string은 예외
		
		System.out.println("값을 입력.");
		
		Scanner sn = new Scanner(System.in);    //import하기. system.in 키보드
		
		
		//String input =sn.nextLine(); //사용자가 입력한 값을 문자열로 읽음.
		// sn.nextInt(); // "                정수로 읽음.
		//System.out.printf("입력값은 %d", input);
		
		System.out.println("첫번째 값을 입력");
		int num1 = sn.nextInt();
		
		System.out.println("두번째 값을 입력.");
		int num2 = sn.nextInt();
		
		
	//if(num1 > num2) {
		//System.out.printf("입력값 %d와 %d의 차이는 %d 입니다",num1,num2,num1-num2);
	//} else {
		//System.out.printf("입력값 %d와 %d의 차이는 %d 입니다",num2,num1,num2-num1);
		
		
		int result = num1 - num2;
				
		if(num1 > num2) {
			System.out.printf("입력값 %d와 %d의 차이는 %d 입니다",num1,num2,Math.abs(result));
		} else {
			System.out.printf("입력값 %d와 %d의 차이는 %d 입니다",num2,num1,Math.abs(result));
	}
		
		
		
		
		//int result = num1 + num2; // 입력한 두 수의 합.
		
		//System.out.printf("입력값 %d와 %d의 차이는 %d 입니다.",num1,num2,num1+num2);		//입력값 a와 b의 차이는 c 입니다.양수로 
	}

}

