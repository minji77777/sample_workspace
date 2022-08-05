package com.bank.loan;

import java.sql.Date;

public class Loan {
	
	/*LOAN_ID    NOT NULL VARCHAR2(20) 
MEMBER_ID           VARCHAR2(20) 
LOAN_DATE           DATE         
LOAN_STATE NOT NULL CHAR(1) */
	
	private String loanId;
	private String memberId;
	private Date loanDate;
	private String state;
	
	
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
	public Date getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
