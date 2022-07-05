package co.edu.reference;

import java.util.Scanner;

public class ForExample02 {
	public static int sumAry(int[] ary) {  //변수 이름 ary
		int sum =0;
		for(int i=0;i<ary.length;i++) {
			sum += ary[i];                                               //메소드 정의구문
		}
		return sum; //메소드를 호출한 영역으로 sum 의 값을 반환.
	}
	
	
	
	public static void main(String[] args) {
		//메소드 호출구문.
		
		
		
		
		// 배열합계
		int sum =0;
		double avg = 0; int j;
		
		int[] intAry = {34, 23, 56, 22, 99, 28};  
		//intAry 배열의 합과 평균.
		sum=sumAry(intAry);
			for(j=0;j<intAry.length;j++)
				sum += intAry[j];
	
			avg =(double)sum/intAry.length;
				System.out.println("intAry 배열의 합: " +sum);
				System.out.println("intAry배열의 평균: "+ sum/avg);
	
		int[] intArray = new int[6]; //0~5
		sum=0; avg=0;
		for(int i =0; i<intArray.length; i++) {
			intArray[i] = (int)(Math.random()*100)+1;
			sum +=intArray[i];
			avg = (double)sum/intArray.length;
			
		}
		// intArray배열의 합과 평균
		System.out.printf("intArray배열의 합은 %d이고 평균은 %.1f이다." ,sum,avg);
	
		int[] scanArray = new int[5];
		sum =0;avg=0;
		
		Scanner scn = new Scanner(System.in);
		
		for(int i = 0; i<scanArray.length;i++) {
			
			scanArray[i] = scn.nextInt();
			sum =sumAry(scanArray);
			avg = (double)sum/scanArray.length;
			
		}
		System.out.println("scanArray의 합 :"+sum);
		System.out.println("scanArray의 평균"+avg);
		//scanArray 배열의 합과 평균
		//sum 계속 쓸거면 매번 0으로 초기화
	}
}
