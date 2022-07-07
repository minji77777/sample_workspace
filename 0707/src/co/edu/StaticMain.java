package co.edu;
/* static 정적메소드
 * 
 */

public class StaticMain {
	public static void main(String[] args) {
		//정적(static)기능 : 인스턴스 안 만들어도 클래스로 가 바로 쓸수있어.
		
		//Calculator cal = new Calculator();
		//System.out.println(cal.pi);               
		
		
		System.out.println(Calculator.pi);
		int result= Calculator.sum(10, 20);
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		System.out.println(sing1 == sing2);  // sing1과 sing2의 getInstance가 리턴해주는 주소가 같다.
		
		
	}

}
