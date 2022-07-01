package co.edu;

public class Example01 {
	public static void main(String[] args) {
		boolean isTrue = false;
		
		int myAge = 10;
		int yourAge = 11;
		myAge = 13;
		
		isTrue = myAge > yourAge; //false
			if (isTrue) {
				System.out.println("나의 나이가 더 많다.");
			} else {
				System.out.println("나의 나이가 더 적다.");
			}
	} //else구문 생략가능
	
	// float, double : double default
		float f1 = 23.4F; // 뒤에 접미사 안 쓰면 기본적으로 double 인줄 알아(범위가 겹치면)
		double d1 = 23.4;  //8byte
		
		//long(8byte) float(4byte)
		float sum = (float) 2345L + 22.3F ;
		
		
		
		
		
		
		
		
		
		double weight =0;
		
		if ( weight > 100.0); {
			System.out.println("다이어트가 필요합니다");
			System.out.println("식단리스트를 어플에 업로드합니다.");
		} else if (50.0< weight <60.0); {
		    System.out.println("이대로 쭉 힘내세요");
		} else {
			System.out.println("체중~ 어플의 식단리스트를 참고하세요");
	}
		
	}
}


