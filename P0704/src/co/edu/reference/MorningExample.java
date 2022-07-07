package co.edu.reference;

import java.util.Scanner;

public class MorningExample {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; //학생수
		int[] scores =null; //참조변수 초기화
		int i  =0;
		
		Scanner scn = new Scanner(System.in);
		
		
		int sum =0;
		double avg=0;
		
		while(run) {
			System.out.print("------------------------------------------------");
			System.out.println("\n1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석| 5.종료 |");
			System.out.println("------------------------------------------------");
			System.out.print("선택>> ");
			
			int selectNo = Integer.parseInt((scn.nextLine())) ; //nextInt() => 반환값이 정수/nextLine()=> 문자열로 반환
			
			if(selectNo==1) {
				System.out.print("학생수 입력> "); //학생 수 배열 크기 정함
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum]; // score 변수 studentNum 배열의 주소값 저장
				System.out.println("정상적으로 처리되었습니다.");
			} else if(selectNo ==2) {
				
				for( i =0; i< scores.length;i++) {
					System.out.print("scores["+i+"] > ");
					scores[i] =Integer.parseInt(scn.nextLine());
				}
				
			} else if(selectNo==3) {
				for(i =0; i<scores.length;i++) {
					System.out.println("scores["+i+"]> " + scores[i]);
				}
			}else if(selectNo==4) {
				
				int max = scores[0]; // 배열 초기화
				for(i=0; i<scores.length;i++) {
				if(max>scores[i]) { //최고값 구하기	
				 max = scores[i];
				}  
				}System.out.println("최고 점수: "+max);
				
				System.out.print("평균 점수: ");
				for( i =0; i<scores.length;i++) {
					sum += scores[i];
					avg = (double)sum / scores.length;
					
				}System.out.println(avg);
				
				
				
				
				
				
				
				}else  {
				
				run = false;
			}
			
		}
		System.out.println("프로그램 종료.");
	}

}

