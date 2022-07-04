package co.edu;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("임의의 숫자 입력>> ");
		int num1 = scn.nextInt();
		
		
		
		// 3의 배수 => 입력값 6은 3의 배수입니다.
        boolean input = num1 % 3 ==0;   // 결과값 true/ false
        if (input) { 
        	System.out.printf("입력값 %d는 3의 배수입니다.", num1);
        }else {
        	System.out.printf("입력값 %d는 3의 배수가 아닙니다.", num1);
        }
        
	}
}
