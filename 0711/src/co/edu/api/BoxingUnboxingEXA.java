package co.edu.api;

import java.util.HashSet;

public class BoxingUnboxingEXA {
	public static void main(String[] args) {
		//로또번호 생성 1~45
		int[] lotto = new int[6];           // 똑같은 임의의 수 나올 가능성ㅇ
	
		for(int i=0; i<lotto.length;i++) {
			
			int temp=(int)(Math.random()*45)+1;
			
			for(int j =0; j<i;j++); // 현재 값과 동일한 값 있는지 체크.
		}	//code HERE (lotto 에 중복된 값은 저장하지 않겠다)
		
			
		for(int num :lotto) {
			System.out.println(num);
		}
		
		HashSet<Integer> set = new HashSet<Integer>(); //중복 값 안돼.
		//1,2,3,3 => 3
		
		int cnt = set.size(); 
		while(cnt<6) {
			int temp = (int)(Math.random()*45)+1;
			
			
			set.add(temp); //중복된 값은 허용 안함
			cnt=set.size();
			System.out.println(temp+","+ set.size());
		}
	}
}
