package co.edu.collect.generic;
/*
 * 제네릭 : 타입을 크래스 정의하는 시점이 아니라 사용하는 시점에 지정. ex) T, G , 상관없음.  
 */

public class BoxExample2 {
	public static void main(String[] args) {   //generic : 쓰는 시점에 타입을 지정함. e
		Box<String> box =  new Box<String>();
		box.set("문자열");
		String result = box.get();
//		Integer result1 = box.get(); //에러. String => Integer 
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100); // int=>Integer(boxing)
		int result1 = intBox.get(); //Integer => int( unboxing)
	}
}
