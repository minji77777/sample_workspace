package co.edu;

public class Example03 {
	public static void main(String[] args) {
		// main 메서드는 
		// 10+20 = 30, "10" + "20"="1020"
		
		// 내 이름은 "홍길동" 입니다.
		

				System.out.println("내 이름은 \" 홍길동 \"입니다.");
				
				//{"name":"홍길동", "age":20} json 데이터타입
				System.out.println("{\"name\":\"홍길동\", \"age\" :20}");
				
				//문자열 -> 정수, 실수
				
				int num1 = Integer.parseInt("100"); // "100" -> 100 , integer라는 클래스의 par~ 메소드
				double num2 =Double.parseDouble("123.4"); // Double.parseDouble : 문자열에서 double형으로 바꿈
				double num3 = Double.parseDouble("122.01");
						
						
				double result = sum(num1, num2); //223.4
				System.out.println("합결과: "+result);
				
				result = minus(num2, num3);//1.39
				System.out.printf("차이는 %.2f 입니다.", result);
				
				System.out.printf("저의 이름은 %s이고 나이는 %d 입니다", "홍길동", 14);
				
				// 이름, 나이, 몸무게(소수점) => 3개 변수선언.
				// 나의 이름은 홍길동이고
				// 나이는  16이고
				// 몸무게는 65.4 입니다.
				
				String name = "홍길동";
				int age = 16;
				double weight = 65.4;
				
				System.out.printf("\n나의 이름은 %s이고\n나이는 %d이고\n몸무게는 %.1f 입니다.",name,age,weight);
				//%.1f = 소수점 한 자리까지 ,,,,, %.2f = 소수점 2자리까지
				
				
				
				
				}

  //2개의 숫자를 합한 결과를 반환. method. sum이라는 새로운 메소드 선언하므로 바깥으로 나옴
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum; 
	}
		
		public static double sum(int n1, double n2) {
			double sum = n1 + n2 ;
			return sum;
		}
		
		public static double minus(double n1, double n2) {
			double sum = n1 - n2 ;
			return sum;
		}
		
		


						
				
						
		
		
	}

