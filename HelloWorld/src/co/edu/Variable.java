package co.edu;

public class Variable {
	public static void main(String[] args) {
		byte b1 = 10; // -128~127
		short s1 = 0;
		int n1 = 0;
		long l2  = 8L;//long 타입의 8 . L 안 붙여도 돼.
		
		int result = b1 + 20; // 별다른 타입없는 숫자면 int /같은 타입과 , (int) b1 + 20;, int result
		long result1 = l2 + (long) 20; // 연산은 동일한 데이터 타입끼리만 가능. 자동형변환(promotion):큰 데이터타입으로 변환
		result = (int) l2 + 20 ; // 강제형변환(casting)
		
		System.out.println(result);
		
		char c1 = 'A';
		c1++; //c1++ => c1=c1+1
		for (int i = 0; i<27; i++) {
			System.out.println((int)c1++);
		}
		System.out.println(c1);
		System.out.println((int) c1 + 1);
		
		System.out.println("이력변경추가.");
		// 이력변경추가 2022.07.01 12:55
	}
}
