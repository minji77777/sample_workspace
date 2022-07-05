package co.edu.reference;


public class DataTypeExample2 {
	public static void main(String[] args) {
		// 기본 데이터타입.(byte, short, long, int,float,double,boolean)
		int num1 = 100;
		int num2 = 100;
		
		System.out.println(num1 == num2); //true
		
		
		// 참조 데이터타입.(주소 번지값 저장)
		String str1 = new String("홍길동"); //"홍길동" 객체 주소값 저장
		String str2 = new String("홍길동"); // 홍길동 객체 주소값
		
		System.out.println(str1 == str2); //false 변수의 주소 비교
		System.out.println(str1.equals(str2)); // 값을 비교 true
		
		int result = 0; // 초기화
		String str3 = null; // null로 초기화.
		str1 = null;
		System.out.println(str1.equals(str2)); //nullpointexception, str1 값 없어.
		
		
		
	}

}
