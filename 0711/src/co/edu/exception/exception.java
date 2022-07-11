package co.edu.exception;
/*
 * 인스턴스 참조변수 = null
 */

public class exception {
		public static void main(String[] args) {
			
		
		String name="홍길동";
		name = null;
		
		try {
		System.out.println(name.toString());
		
		System.out.println("name 을 출력.");            //위의 메서드 true면 실행.
		} catch(NullPointerException e) {             //예외처리해주는 클래스
//			System.out.println(e.getMessage());
			e.printStackTrace();                      // 예외난 곳 알려줌.
		}
		
		System.out.println("프로그램 종료.");

}
}
		
		
	
