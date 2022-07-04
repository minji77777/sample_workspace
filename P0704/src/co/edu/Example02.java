package co.edu;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// 사용자 입력값을 읽어서 100~90 :A, 89~80 :B, 79~70:C, 그외 : D
		// 출력값 : 점수 78은 C 등급입니다!
		// scanner클래스 사용

		Scanner scn = new Scanner(System.in);
		int score = 0;
		String grade = "D"; // String grade = ""

		score = scn.nextInt();

		if (90 <= score && score <= 100) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		}
		
		System.out.println("점수 " + score + "은 " + grade + " 등급입니다!");
	}
	int score = 0;
	String grade = (score>=90) ? "A" : (((score>=80)?"B":"C")); //3항 연산자
}
