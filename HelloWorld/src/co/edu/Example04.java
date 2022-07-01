package co.edu;

import java.io.IOException;

public class Example04 {
	public static void main(String[] args) {
		System.out.println("값을 입력하세요.");
		//System : 
		int num = 10;
		boolean run = true;
	while (run) { 
		int result = 0;	                                 //반복문. 거짓 나올 때까지
		try {
			result = System.in.read();// 예외가 발생했을 경우 catch 구문 실행
			System.out.printf("입력값은 %d 입니다.", result);
		} catch (IOException e) {
			e.printStackTrace();
		} // 93페이지
		
		run = result != 48;  ///read 가 a , result 값이 97 run은 true. 
	}
		System.out.println("end of prog");

}
}