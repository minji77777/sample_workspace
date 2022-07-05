package co.edu.reference;

import java.util.Arrays;

public class ForExample01 {
	public static void main(String[] args) {
		
	
	//배열.
	int[] tempAry = new int[5];
	tempAry = new int[] {3,4,5,6,7};     //값은 알 수 없음
	for(int i = 0; i<tempAry.length; i++) {
		tempAry[i] = (int)(Math.random()* 50);
}
	//확인하는 용도
	for (int num:tempAry) {
		System.out.println(num);
	}
	//제일 큰 값을 max;
	int max=0; int i;
		for(i=0;i<tempAry.length;i++) {
			if(tempAry[i]>max) {
				max = tempAry[i];
			}
			System.out.println("제일 큰 값: "+max);
		//내림차순	
			
			}
		}
		
	
	
	}
	