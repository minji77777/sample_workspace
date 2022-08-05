package com.bank.app;

import java.util.Scanner;

import com.bank.account.AccountService;
import com.bank.member.MemberService;

public class ManageMent {
	Scanner scn = new Scanner(System.in);
	
	MemberService ms = new MemberService();
	AccountService as = new AccountService();
	
	int menuNo =0;
	
	public ManageMent() {
		bankJob();
	}
	
	private void bankJob() {
		menuInfo();
		while(true) {
			if(MemberService.MemberInfo.getRole().equals("1")) {
				if(menuNo==1) {
					//고객등록
					ms.registerCustomer();
				}else if(menuNo==2) {
					//입출금
					as.makeAccount();	
				}else if(menuNo==3) {
					as.Money();
				}else if(menuNo==4) {
					as.transfer();
				}else if(menuNo==5) {
					as.deleteAccount();
				}else if(menuNo==6) {
					
				}
			}else if(MemberService.MemberInfo.getRole().equals("1")) {
				
			}
			
		}
	}
	
	private void menuInfo() {
		if(MemberService.MemberInfo.getRole().equals("1")) {   //은행원
			System.out.println("1.고객등록 | 2. 계좌개설 | 3.입출금 | 4.계좌이체 | 5. 계좌해지 | 6.대출");
			
		}else if(MemberService.MemberInfo.getRole().equals("0")) { //고객
			System.out.println("1.계좌조회 | 2.입금 | 3.출금 | 4.계좌 이체 | 5.대출");
			
		}
		System.out.println("입력> ");
		menuNo = Integer.parseInt(scn.nextLine());
	}

}
