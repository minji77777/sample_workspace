package co.edu.reference;

public class ArrayExample02 {
	public static void main(String[] args) {
		int[] intAry = {20, 27, 15, 33, 29}; //배열 크기 5, intAry.length (배열의 크기)
		int i;
		for(i=0; i<intAry.length ;i++) {
			if(intAry[i] % 2 ==0) {                  //값이 짝수
			 
			System.out.println(intAry[i]);
			
			
			//25보다 큰 수만 출력
			// 짝수 출력
			
			
		}
			if(intAry[i] > 25) {
				System.out.println(intAry[i]);
			}
				
		for(i=0; i<intAry.length ;i++) {	//순번이 짝수
			if(i%2 ==0) {
				System.out.println(intAry[i]);        
				
				
				//위치 세번째 15 => 30
				intAry[2] = 30;
				int temp = intAry[0];
				intAry[0] = intAry[1]; 
				intAry[1] = temp;
				
				int sum = 0;
				
				for(i=0; i<intAry.length ;i++) {
					sum += intAry[i];
				}
				System.out.println("합계: " + sum);
//					System.out.println(intAry[i]);
				
				
			}
	}
		
		}

	}
		}
