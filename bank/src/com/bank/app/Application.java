package com.bank.app;

import java.util.Scanner;

import com.bank.member.MemberService;

public class Application {
	
	Scanner scn = new Scanner(System.in);
	MemberService ms = new MemberService();
	int menuNo=0;
	
	public Application() {
		run();
	}
	private void run() {
		System.out.println("1. 로그인 | 2.종료");
		menuNo= Integer.parseInt(scn.nextLine());
		switch(menuNo) {
		case 1:
			//로그인하는 기능
			ms.doLogin();
			if(MemberService.MemberInfo != null) {
				new ManageMent();
			}
			
	
			break;
		case 2:
			//
			
			break;
		
		}
		
		
		
	}

}
