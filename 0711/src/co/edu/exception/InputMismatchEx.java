package co.edu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		try {
		System.out.println("숫자를 입력하세요");
		
		int num = scn.nextInt(); // 정수값 입력해야되는데 => 문자입력.
		System.out.println("입력값 "+num);
		
		} catch (InputMismatchException e) {
			System.out.println("잘못된 값 입력됨");
			
		}
		
		System.out.println("프로그램 종료.");
	}
}
