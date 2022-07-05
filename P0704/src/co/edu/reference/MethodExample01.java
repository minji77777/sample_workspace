package co.edu.reference;

public class MethodExample01 {
	// 실행구문.
	public static void main(String[] args) {
//		long sum = sum(10);  //매개 값 arguments
		
//		showInfo("김민지", 25);
		printStar(4, "★");
		for(int i =2; i<=5; i++)
		printGugudan(i);
	}

//*
//**
//***
//****

	
		public static void printStar(int times, String shape) {
			for(int i=1;i<=times;i++) {
			System.out.print(shape);
			}
		}
		public static void printGugudan(int dan) {
			for(int i=1;i<=9;i++) {
				for(int j=1;j<=9;j++)
					System.out.printf("%d * %d =%d%n", dan, i,(dan*i));
				
		
 	}}
//		
//		
//		for(int i =1; i<= times;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.printf(shape);
//			}
//			System.out.println();
//		}
//	
//	public static void showInfo(String name, int age) {  //매개변수
//		System.out.println("반갑습니다. "+name+"입니다. 나이는 "+age+"살 입니다.");
				
	
 //정의구문
public static long sum(int num) {   //int num 매개변수parameter
	int result = num*2;
	return (long)result; //자동형변환 (작은 놈에서 큰 놈으로)

//	public static void printStar(int times, String shape) {

	}

}


