package co.yedam;

import java.util.Scanner;

/*
 * 문제2 : 정수형 변수 num1, num2를 선언하고  Scanner 클래스를 이용하여 사용자의 입력값을 비교한 후 두 수의 평균을
 * 소수점 첫번째 자리까지 구하는 기능을 구현하세요.
 * 출력 예: 14와 23의 평균은 18.5 입니다.
 */
public class Exam02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 =0, num2=0;
		double avg=0;
		
		System.out.println("첫번째 값을 입력> ");
		num1 = scn.nextInt();
		System.out.println("두번째 값을 입력> ");
		num2 = scn.nextInt();
		
		avg = (double)(num1+num2) / 2;
		System.out.printf("%d와 %d의 평균은 %.1f",num1,num2,avg);
		
		
		
	}
}
