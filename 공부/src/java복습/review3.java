package java복습;

import java.util.Scanner;

public class review3 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//배열
		int[] arr1 = {10,20,30,50,3,60,-3};
		
		for(int i =0; i<arr1.length; i++) {
			if(arr1[i]==60) {
				System.out.println((i+1)+"번째 위치입니다.");
				break;
			}
		}
		
		//인덱스가 3인 곳 출력하지 말고, 나머지만 출력하라
		for(int i =0; i<arr1.length;i++) {
			if(i != 3) {
				System.out.println(arr1[i]);
			}
		}
		
		// 인덱스 번호를 입력받아 그 값을 1000으로 변경하자
		System.out.println("인덱스 입력> ");
		int index = Integer.parseInt(scn.nextLine());
		arr1[index] = 1000;
		//System.out.println(int arr1[]);
	
		
	//문제4
	// 최대값, 최소값 구할때 초기값은 배열의 첫 번째로 지정하는 것이 좋다. (0말고)
	int arr[]= {10,20,30,50,3,60,-3};
	
	int max = arr[0];
	int min = arr[0];
	
	for(int i =0; i<arr.length;i++) {
		if(arr[i]>max) {
			arr[i] =max;
			System.out.println("max: "+ arr[i]);
		}
		if(arr[i]<min) {
			arr[i]=min;
			System.out.println("min: "+ arr[i]);
		}
	}
}
}

