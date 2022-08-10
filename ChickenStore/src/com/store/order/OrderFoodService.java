package com.store.order;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderFoodService {

	Scanner scn = new Scanner(System.in);
	OrderFood of = new OrderFood();
	OrderFoodService ofs = new OrderFoodService();
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

	// 주문하기
	public void order() {
		System.out.println("주문할 치킨 번호 > ");
		seeMenu();
		int num = Integer.parseInt(scn.nextLine());

		System.out.println("주문수량>");
		int count = Integer.parseInt(scn.nextLine());

		if (1 <= num && num <= 6) {

			System.out.println("주문내역");
			System.out.println("─────────────────────────────────");
			System.out.printf("   %d.%s    %d마리  총 주문 금액: %d원", of.getNo(), of.getMenuName(), count,
					of.getPrice() * count);
			System.out.println("─────────────────────────────────");
		}
	}
	// 주문조회하기(사장님)
	public void seeAll() {
		System.out.println("-----------------------");
		System.out.println();
	}
}
