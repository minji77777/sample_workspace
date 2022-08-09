package com.bank.account;


import java.util.List;
import java.util.Scanner;

import com.bank.member.MemberService;

import lombok.Data;


public class AccountService {
	Account ac = new Account();

	Scanner scn = new Scanner(System.in);

	// 1. 계좌개설
	// 2. 입출금
	// 3. 계좌 해지
	// 4. 계좌 이체

	// 계좌개설
	public void makeAccount() {
		Account ac = new Account();

		System.out.println("계좌번호>");
		String accountId = scn.nextLine();
		System.out.println("고객 ID>");
		String customId = scn.nextLine();

		ac.setAccountId(accountId);
		ac.setMemberId(customId);

//계좌 등록 메소드

		int result = AccountManage.getInstance().insertAccout(ac);
		if (result == 1) {
			System.out.println("계좌 등록 완료");
		} else {
			System.out.println("계좌 등록 실패");
		}
	}

	// 2. 입출금
	public void Money() {

		Account account = new Account();

		System.out.println("1.입금  | 2.출금 ");
		int cmd = Integer.parseInt(scn.nextLine());
		System.out.println("계좌번호>");
		String accountId = scn.nextLine();
		if (cmd == 1) {
			System.out.println("입금 금액>");
		} else if (cmd == 2) {
			System.out.println("출금 금액>");
		}

		int money = Integer.parseInt(scn.nextLine());

		account.setAccountId(accountId);
		account.setBalance(money);

		int result = AccountManage.getInstance().updateMoney(account, cmd);

		if (result == 1 && cmd == 1) {
			System.out.println("입금완료");
		} else if (result == 1 && cmd == 2) {
			System.out.println("출금완료");
		}
	}

	// 3. 계좌 해지 => delete
	public void deleteAccount() {

		System.out.println("======계좌해지======");
		System.out.println("계좌 입력>");
		String accountId = scn.nextLine();

		int result = AccountManage.getInstance().delAccount(accountId);
		if (result == 1) {
			System.out.println("정상 해지");
		} else {
			System.out.println("해지되지 않음");
		}
	}
	// 4.계좌이체

	// 1) 받는 사람계좌
	// 2) 보내는 사람 계좌
	// 3) 보내는 사람의 비밀번호(join) 또는 select 계좌와 비밀번호가 맞는지
	// 데이터 유효성 검사.
	// 4) 출금금액
	public void transfer() {
		System.out.println("======계좌이체======");

		System.out.println("받는 사람 계좌");
		String toAccountId = scn.nextLine();

		System.out.println("보내는 사람 계좌");
		String fromAccountId = scn.nextLine();

		System.out.println("출금 금액");
		int balance = Integer.parseInt(scn.nextLine());

		AccountManage.getInstance().transferMoney(toAccountId, fromAccountId, balance);
	}
	//계좌조회
	public void getAccount() {
		List<Account>list = AccountManage.getInstance().getAccountList(MemberService.MemberInfo.getMemberId());
		System.out.println(MemberService.MemberInfo.getMemberName()+"님의 계좌");
		for(Account account : list) {
			System.out.println("계좌id> "+account.getAccountId());
			System.out.println("잔고>"+account.getBalance());
			System.out.println("생성일>"+account.getCredate());
		}
	}
	
}
