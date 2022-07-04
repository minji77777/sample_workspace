package co.edu.loop;

public class Example01 {
	public static void main(String[] args) {
		// 3)10번 반복(for문)
		// 1)num 변수 =>1~10까지 임의의 정수. math.random()
		// 2)sum 변수 => 2의 배수
//		int i =0; 
//		int num = (int)(Math.random()*10)+1;
//		for(i=2;i<=20;i+=2) {
//		int sum = sum + num }

		int sum, num;
		sum = 0;

		for (int i = 1; i <= 10; i++) {

			num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0) {
				sum += num;
				System.out.println(num + "," + sum);
			}
			System.out.println("2의 배수의 합계: " + sum);
		}

		// 2의 배수 또는 3의 배수
		for (int i = 1; i <= 10; i++) {
			num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0 || num % 3 == 00)
				;
			{
				sum += num;
				System.out.println(num + "," + sum);

			}
		}
		System.out.println("2또는 3의 배수의 합계: " + sum);

		int sum2, sum3;
		sum2 = sum3 = 0;

		for (int i = 1; i <= 10; i++) {

			num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0) {
				sum2 += num;
			}
			if (num % 3 == 00) {
				sum3 += num;
			}
			System.out.println("2의 배수의 합계: " + sum2);
			System.out.println("3의 배수의 합계: " + sum3);
		}

	}

}
