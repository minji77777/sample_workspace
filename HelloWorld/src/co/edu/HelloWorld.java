package co.edu;

public class HelloWorld {
	public static void main(String[] args) {
		// 변수의 종류 : int(정수), double(실수), boolean(논리), String(문자열)
		// int(4byte) < double(8byte)
		// 정수 : byte(1byte) < short(2byte) <int(4byte)
		String name = "김민지";
		name = "10";
		// my_age 변수에 두 단어를 조합하려면 두번째 단어에 첫번째 문자는 대문자로 구별
		// 클래스는 대문자로 시작
		
		int myAge = 20; //선언하면서 값을 할당 => 초기화
		int yourAge; // 선언 : 초기화(X)
		yourAge = 22;
		double height = 162.4;
		boolean isMarried = true;
		String myAddress = "대구시";
		
		 myAge = 30;
		 height = 165.2;
		 
		 int result = myAge + yourAge; //변수를 사용하기 위해선 값이 할당되어야 함.
		 double result1 = (double) myAge + height; //  연산하려면 두 타입이 같아야 함. (형변환)
		 
		System.out.println(result);
		System.out.println("안녕하세요 " + name + "입니다.");
	}
}
