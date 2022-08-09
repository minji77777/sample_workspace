package com.bank.app;

import java.util.Scanner;

import com.bank.account.AccountService;
import com.bank.loan.LoanService;
import com.bank.member.MemberService;

public class ManageMent {
	Scanner scn = new Scanner(System.in);
	
	MemberService ms = new MemberService();
	AccountService as = new AccountService();
	LoanService ls = new LoanService();
	
	int menuNo =0;
	
	public ManageMent() {
		bankJob();
	}
	
	private void bankJob() {
		
		while(true) {
			menuInfo();
			//은행원
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
					System.out.println("1.대출승인 | 2. 대출 정보 변경");
					int menu = Integer.parseInt(scn.nextLine());
					if(menu ==1) {
						//대출승인
						ls.insertLoan();
						
					}else if(menu ==2) {
						ls.updateLoan();
					}
				}
				//일반고객
			}else if(MemberService.MemberInfo.getRole().equals("0")) {
				if(menuNo==1) {
					//계좌 조회
					as.getAccount();
					
				}else if(menuNo==2){
					//입출금
					as.Money();
				}else if(menuNo==3) {
					as.transfer();
					
				}else if(menuNo==4) {
					
					System.out.println("1.상환 | 2. 대출 조회");
					int menu = Integer.parseInt(scn.nextLine());
					
					//상환
					if(menu ==1) {
						ls.updateMoney();
					}//대출 정보 조회
					else if(menu ==2) {
						ls.loanInfo();
					}
					
				}
				
			}
			
		}
	}
	
	private void menuInfo() {
		if(MemberService.MemberInfo.getRole().equals("1")) {   //은행원(role :1)
			System.out.println("1.고객등록 | 2. 계좌개설 | 3.입출금 | 4.계좌이체 | 5. 계좌해지 | 6.대출");
			
		}else if(MemberService.MemberInfo.getRole().equals("0")) { //고객(role: 0)
			System.out.println("1.계좌조회 | 2.입출금 | 3.계좌 이체 | 4.대출");
			
		}
		System.out.println("입력> ");
		menuNo = Integer.parseInt(scn.nextLine());
		
		
		
	}

}
