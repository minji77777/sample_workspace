package com.bank.member;

import java.util.Scanner;

public class MemberService {
	
	
	
	public static Member MemberInfo=null;  // 기본값 : null, 로그인 실패
	Scanner scn = new Scanner(System.in);
	
	//로그인
	public void doLogin() {
		Member member = new Member();
		
		System.out.println("ID>");
		String id = scn.nextLine();
		
		System.out.println("PW>");
		String pw = scn.nextLine();
		
		
		member=MemberManage.getInstance().loginInfo(id);
		                                              
		//DB 조회한 정보와 내가 입력한 PW 비교
		if(member.getMemberPw().equals(pw)) {
			MemberInfo = member;
			
		}else {
			System.out.println("로그인 실패");
		}
		
	}
	//로그아웃
	public void logout() {
		if(MemberInfo != null)
		MemberInfo = null;
	}
	
	
	//고객등록
	public void registerCustomer() {
		Member member = new Member();
		System.out.println("고객 ID>");
		String id = scn.nextLine();
		
		System.out.println("고객 PW>");
		String pw = scn.nextLine();
		
		System.out.println("고객 이름>");
		String name = scn.nextLine();
		
		member.setMemberId(id);
		member.setMemberPw(pw);
		member.setMemberName(name);
		member.setRole("0");
		
		int result = MemberManage.getInstance().registCustomer(member);
		
		if(result ==1) {
			System.out.println("고객 정보 등록 완료");
		}else {
			System.out.println("고객 정보 등록 실패");
		}
		
	}

}
