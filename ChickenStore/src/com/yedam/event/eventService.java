package com.yedam.event;

import java.util.ArrayList;
import java.util.List;

import com.store.member.Member;
import com.store.member.MemberManagement;
import com.store.order.OrderFood;
import com.store.order.OrderFoodManage;

public class eventService {
	
	List<OrderFood> list = new ArrayList<>();
	
	
//	eventService es = new eventService();
	
	
	public String randomMember() {  // 치킨 구매한 고객을 대상으로, 랜덤으로 상품 뿌리기 
		
		String[] memberList = new String[];
		
//		for(int i = 0 ; i<30 ;i++) {
//			
//			memberList[i]= OrderFoodManage.getInstance().seeAll(memberId);
//		}
		 
		
	
		
		
		 
		
	}
	
	public void randomPrize() {
		
		String prize[] = {"치즈볼 교환권","꽝","1000원 교환권","5000원 교환권","치킨 1마리 교환권","꽝","꽝","콜라 교환권"};
		
		 String finalPrize=prize[((int)Math.random()*30 +1)];
		 
		 System.out.println(finalPrize);
		
	}
	
	

}
