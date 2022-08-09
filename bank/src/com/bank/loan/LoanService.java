package com.bank.loan;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.bank.member.MemberService;

public class LoanService {
	Scanner scn = new Scanner(System.in);

	// 1.대출승인
	// 2. 대출 정보 변경
	// ====================
	// user
	// 3. 상환
	// 4. 대출 정보 조회

	// 1.대출승인
	public void insertLoan() {
		Loan loan = new Loan();
		System.out.println("대출 id >");
		String loanId = scn.nextLine();

		System.out.println("회원 id>");
		String memberId = scn.nextLine();

		System.out.println("대출 금액");
		int loanMoney = Integer.parseInt(scn.nextLine());

		System.out.println("대출 날짜");
		String startDay = scn.nextLine(); // 대출하려는 날짜
//		Date date = null;
//		// String -> (DateFormat) -> Date
//		// DateFormat -> SimpleDateFormat ( 날짜형태)
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
//		try {
//			date = (Date) dateFormat.parse(startDay);
//		} catch (ParseException e) { // starday와 "yyyy-mm-dd"와 형태가 안 맞을때
//			e.printStackTrace();
//		}

		System.out.println("대출 상태");
		String state = scn.nextLine();

		loan.setLoanId(loanId);
		loan.setMemberId(memberId);
		loan.setLoanMoney(loanMoney);
		loan.setState(state);
		loan.setLoanDate(startDay);

		int result = LoanManage.getInstance().insertLoan(loan);
		if (result == 1) {
			System.out.println("대출 완료");
		} else {
			System.out.println("대출 실패");
		}
	}

	// 2. 대출 정보 변경
	public void updateLoan() {
		Loan loan = new Loan();
		System.out.println("대출 id >");
		String loanId = scn.nextLine();
		System.out.println("상태 변경> ");
		String state = scn.nextLine();

		loan.setLoanId(loanId);
		loan.setState(state);

		int result = LoanManage.getInstance().updateLoan(loan);
		if (result == 1) {
			System.out.println("상태 변경 완료");
		} else {
			System.out.println("상태 변경 실패");
		}
	}

	// 3. 상환
	public void updateMoney() {
		Loan loan = new Loan();
		System.out.println("대출 id >");
		String loanId = scn.nextLine();

		System.out.println("상환금액>");
		int loanMoney = Integer.parseInt(scn.nextLine());

		loan.setLoanId(loanId);
		loan.setLoanMoney(loanMoney);

		int result = LoanManage.getInstance().updateMoney(loan);
		if (result == 1) {
			System.out.println("상환완료");
		} else {
			System.out.println("상환 실패");
		}

	}

	// 4. 대출 정보 조회
	public void loanInfo() {

		List<Loan> list = LoanManage.getInstance().getLoanInfo(MemberService.MemberInfo.getMemberId());

		System.out.print(MemberService.MemberInfo.getMemberName() + "님의 대출 정보");
		for (Loan loan : list) {
			// 회원이름, 대출id, 대출 금액, 대출 날짜
			System.out.println("대출 id>" + loan.getLoanId());
			System.out.println("대출 금액> " + loan.getLoanMoney());
			System.out.println("대출 날짜> " + loan.getLoanDate());

		}

	}

}
