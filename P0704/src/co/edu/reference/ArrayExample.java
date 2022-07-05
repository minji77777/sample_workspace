package co.edu.reference;

public class ArrayExample {
	public static void main(String[] args) {
		//배열의 저장공간 선언.
		int[] intAry = new int[10]; //저장공간 10개인 객체. byte,short,int,long => 초기값 0
		intAry[0] = 10; //첫번째 위치에 10 값을 할당.
		intAry[4] = 50; // 다섯번째 위치에 50할당.
		
		System.out.println(intAry.length);//배열의 크기를 알려주는
		for (int i=0; i<10; i++) {
		System.out.println(intAry[i]);
	}

		double[] dblAry = new double[5]; // double형 공간 5개 선언. 0.0으로 초기화
		for(int i = 0; i<dblAry.length; i++) {
			System.out.println(dblAry[i]);
		}
		
		boolean[] boolAry = new boolean[3]; // boolean 형 초기값 false
		boolAry[1] = true;
//		boolAry[2] = "true"; // boolAry 에는 boolean형 대입. 문자 대입할 수 없어.
		for(int i =0; i < boolAry.length;i++) {
			System.out.println(boolAry[i]);
		}
		String[] strAry = {"홍길동", "김민수", "허민기"}; // 초기값을 직접 넣어 선언, 3개 값을 할당.
//		strAry[3] = "황경영"; // 에러 발생. 인덱스 2까지 있기 때문
		strAry[2] = "황경영"; // 인덱스 2번 값 바꿀래.
		for(int i =0; i <strAry.length; i++) {
			System.out.println(strAry[i]);
		}
}
}
