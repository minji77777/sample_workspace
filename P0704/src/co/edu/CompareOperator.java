package co.edu;

public class CompareOperator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		// ==, !=(not), >, >=, <, <=
		
		if(num1 == num2); {
			System.out.println("두 수가 같습니다.");
		}
		
		if(num1 != num2) {
			System.out.println(" 두수는 다릅니다.");
		}
		num1 =20; // num2=20;
		if(num1 >= num2) {
			System.out.println("num1이 num2보다 크거나 같습니다.");
		}
		
		//클래스의 값을 비교. String
		String name1 = new String("홍길동");  // 문자열을 비교할 땐 비교연산자 == 사용하면 안돼.
		String name2 = new String("홍길동");
		
		System.out.println(name1 + ", " +name2);
		
//		if (name1 == name2) {
		
		if (name1.equals(name2)) {                           // 문자열을 비교할 땐 equals()
			System.out.println("두값이 동일합니다.");
		} else {
			System.out.println("두값이 동일하지 않습니다.");
			
		}
		
		String result =(name1.equals(name2)) ? "두값이 동일합니다." : "두 값이 동일하지 않습니다."; //위를 삼항연산자로 나타내면.
		
		//삼항연산자.(if -else 대체)
		boolean isTrue = false;
		if(num1 > num2) {
			isTrue = true;
		} else {
			isTrue = false;
		}
		isTrue = (num1 > num2) ? true : false; // 반환타입에 변수를 선언.
		result = (num1 > num2) ? "true" : "false" ; // 문자열 반환 => result 변수 선언.
	}

}
