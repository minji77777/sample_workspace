package co.edu;
/*메소드 연습용.
 * 입력값(매개변수) 출력값(반환값) 
 */

public class MethodExample01 {
	public static void main(String[] args) {
//		int result = sum(10,20);     main 메서드는 void라서 sum return 실행시킬수없다.
		int result = sum2(5,10);
		System.out.println("결과값은 "+result);
		
		
		double weight = properWeight(170);
		System.out.println("적정 몸무게는: "+weight);
		
		double result1 = getTriangle(23.4,12.2);
		System.out.println("삼각형의 넓이는: "+ result1);
		
    // sum2(sum2(3,5), sum2(5,7));
	
}
	//메소드 : 입력값(매개변수)-> 처리 -> 출력값
	
	public static void sum(int n1, int n2) {     //void :반환 안한다
		int result = n1 *2 +n2*3;
		System.out.println("결과: " +result);
	}
	
	public static int sum2(int n1,int n2) {        //int 타입으로 반환
		int result =  n1*2 +n2*3;
		return result;                                 // sum2메소드를 호출한 영역으로(메인 메서드) 결과 반환.
	}
	
	//키 입력 -> 처리->적정 몸무게 반환. (키-100) * 0.9 : 
	
	public static double properWeight(double height) {
		double weight = (height -100) *0.9;
		return weight;
	}
	
	//삼각형의 넓이 메소드(밑변, 높이) => 넓이 getTriangle()
	//밑변 23.4, 높이:12.2
	public static double getTriangle(double underline,double height) {
		double result1 = (underline * height)* 1/2;
		return result1;
	}
	
	
}
