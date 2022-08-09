package com.bank.loan;

import java.sql.Date;

public class Loan {
	
	/*LOAN_ID    NOT NULL VARCHAR2(20) 
MEMBER_ID           VARCHAR2(20) 
LOAN_DATE           DATE         
LOAN_STATE NOT NULL CHAR(1) */
	
	private String loanId;
	private String memberId;
	private String loanDate; //대출날짜
	private String state; // 상태
	private int loanMoney;
	
	private String memberName;
	
	
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getLoanMoney() {
		return loanMoney;
	}
	public void setLoanMoney(int loanMoney) {
		this.loanMoney = loanMoney;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	

}
