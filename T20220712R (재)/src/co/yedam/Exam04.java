package co.yedam;

/*
 * 문제 4: 임의의 값 생성.
 * Math.random()을 사용하여 1 ~ 100 의 임의의 값을 생성하여 두 정수에 저장한 후 
 * 두 수의 합이 150을 넘어서면 반복처리를 중단하는 기능을 작성하세요.
 * 출력 예) 14, 37 출력 23, 67 출력, 95, 72 출력 후 중지.
 */
public class Exam04 {
	public static void main(String[] args) {
	while(true) {	
		int num1=(int)(Math.random()*100)+1;
		int num2 =(int)(Math.random()*100)+1;
		
		System.out.println("첫번째: "+num1+" 두번째: "+num2);
		
		
		if(num1 +num2 >150) {
			System.out.println("150 초과> 출력끝.");
			break;
			
}
}
	}
}