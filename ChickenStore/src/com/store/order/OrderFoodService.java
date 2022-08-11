package com.store.order;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderFoodService {

	Scanner scn = new Scanner(System.in);
	OrderFood of = new OrderFood();

	List<OrderFood> list = new ArrayList<>();

	// 치킨 메뉴 조회
	public void seeMenu() {

		List<OrderFood> list = OrderFoodManage.getInstance().seeMenu();

		System.out.println("*********치킨메뉴**********");
		System.out.println();

		for (OrderFood of : list) {
			System.out.println(of.getNo() + " . " + of.getMenuName() + " = " + of.getPrice() + "원");
		}

	}

	// 주문하기(회원)
	public void order() {
		List<OrderFood> list1 =OrderFoodManage.getInstance().orderMenu();
		
		seeMenu();
		System.out.println(); //줄바꿈
		System.out.println(" 주문할 치킨 번호 >> ");
		int num = Integer.parseInt(scn.nextLine());
		

		System.out.println("주문수량>>");
		int count = Integer.parseInt(scn.nextLine());
		of.setCount(count) ;

		if (1 <= num && num <= 6) {
			
		
			System.out.println("    주문내역     ");
			System.out.println("────────────────────────────────────");
		for (OrderFood of : list1) {	
//			System.out.printf("   %s    %d마리  총 주문 금액: %d원 " , of.getMenuName(), count , (of.getPrice() * count) );
			System.out.println( "치킨 명 : " + of.getMenuName() + " 주문 수 : " + count + " 총 주문 금액" + (of.getPrice() * count));
			}
		}
	}

	
	// 주문조회하기(사장님)
	public void seeAll() {
		OrderFood of = new OrderFood();
		System.out.println("고객ID   치킨   수량   구매일");
		System.out.println("---------------------------");
		System.out.println(of.getMemberId() + of.getMenuName() + of.getCount() + of.getOrderDate());
	}
		
		
		//총 매출
		public void money() {
			OrderFood of = new OrderFood();
			System.out.println("────────"+of.getOrderDate()+"────────");
			System.out.println(OrderFoodManage.getInstance().money());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

