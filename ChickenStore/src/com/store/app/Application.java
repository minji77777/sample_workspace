package com.store.app;

import java.util.Scanner;

import com.store.member.Member;
import com.store.member.MemberManagement;
import com.store.member.MemberService;

public class Application {
	Scanner scn = new Scanner(System.in);
	int menuNo = 0;
	MemberService ms = new MemberService();
	

	public Application() {
		run();
	}

	public void run() {
		System.out.println("============================");
		System.out.println("       1. 회원 | 2. 관리자");
		System.out.println("============================");
		int role = Integer.parseInt(scn.nextLine());

		switch (role) {
		case 1: // 회원
			System.out.println("*************************  <회원>  **********************************");
			System.out.println("1. 로그인 | 2.회원가입 | 3.회원정보 변경 | 4.주문하기 | 5.리뷰 | 6. 이벤트 ");
			System.out.println("********************************************************************** ");

			int menuNo1 = Integer.parseInt(scn.nextLine());

			while (true) {
				if (menuNo1 == 1) { // 로그인
					ms.login();
					break;
				} else if (menuNo1 == 2) { // 회원가입
					ms.registerMember();
					break;
				} else if (menuNo1 == 3) {// 정보 변경
					ms.update();
					break;
				} else if (menuNo1 == 4) {// 주문하기
					
					break;
				} else if (menuNo1 == 5) { // 리뷰
					ms.review();
					break;
				} else if (menuNo1 == 6) {// 이벤트

					break;
				}
			}

			break;
		case 2: // 관리자
			System.out.println("*************************  <관리자>  **************************************************");
			System.out.println("1.로그인 | 2.회원 조회 | 3.회원 삭제 | 4.주문조회 | 5.총 매출 | 6.공지사항 | 7.이벤트 | 8.리뷰관리 ");
			System.out.println("**************************************************************************************");
			
		while(true) {
			System.out.println("메뉴 선택>");
			int menuNo0 = Integer.parseInt(scn.nextLine());
			
			if(menuNo==1) {
				//로그인
				ms.login();
				break;
			}else if(menuNo==2) {
				// 회원조회
				System.out.println("1. 전체조회 | 2. 단건 조회");
				int num = Integer.parseInt(scn.nextLine());
				if (num == 1) {// 전체 조회
					
				}else {
					// 단건 조회
					
				}
				break;	
				
			}else if(menuNo==3) { // 회원 삭제
				ms.delete(); 
				System.out.println("회원 삭제 완료");
				break;
				
			}else if(menuNo==4) {// 주문조회
				
			}else if(menuNo==5) { // 총 매출
				
			}else if(menuNo==6) {// 공지사항
				
			}else if(menuNo==7) {// 이벤트
				
			}else if(menuNo==8) {// 리뷰관리
				
			}
		}
			

			
			
			
			

}
	}
}
