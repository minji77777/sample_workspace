package co.edu.loop;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		boolean isTrue = true;
		int sum =0;
		//sum 의 누적값이 100을 초과할때 반복문 종료. 그때 sum 누적값 출력
		do {
			System.out.println("임의의 값을 입력>>>");
			int num = scn.nextInt();
			sum += num;
			
			
			if(sum > 100) {
				sum -= num;
				System.out.println("반복문을 종료합니다.");
				break; //or    isTrue = false;
				
			}
			
		}while(isTrue);
		System.out.println("sum의 누적값: "+ sum); // 누적값 100을 초과하기 전의 가장 큰 값 출력. 
		
		System.out.println("end of prog");
		
	}

}
