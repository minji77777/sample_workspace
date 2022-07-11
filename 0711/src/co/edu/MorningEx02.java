package co.edu;

public class MorningEx02 {
	public static void main(String[] args) {
		
	
	// 정수 int를 담을 수 있는 배열 선언(6개) -> 배열변수 이름 intAry
	// 1~100 까지 임의의 값.
	
	int[] intAry = new int[6];
	
	//최대.
	int max = intAry[0];
	int sum = 0;
	double avg = 0;
	
	
	
	for(int i =0; i< intAry.length ; i++) {
		intAry[i] = (int)(Math.random()*100)+1;
		sum += intAry[i];
	}
	
	avg=(double)sum/intAry.length;
		
		
		//확장 for
		for(int num : intAry) {
			System.out.println(num);
		}
	}
	
	
	
	 

}


