package co.edu.api;

public class ValueCompareEX {
	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println();
		System.out.println("==결과: "+(obj3==obj4));
		System.out.println("언박싱후==결과: "+(obj3.intValue()==obj4.intValue()));
		System.out.println("equals() 결과: "+obj3.equals(obj4));
	}
}
