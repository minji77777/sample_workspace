package co.edu;

public class BitOperator {

	public static void main(String[] args) {
		int num = 10;
		int result = ~num; // 비트를 반전시키겠다.
		System.out.println(result); //result = -11
		result++;
		System.out.println(result);
		
		
		//대입연산자 : =, +=, -=, *=,/= .......
		String names = "홍길동";
		names = names + " 김민수";
		names += " 박의식";
		
		result = result -2;
		result -= 2;   //위의 결과와 같다
		System.out.println(result);
		
		
		System.out.println(names);

	}

}
