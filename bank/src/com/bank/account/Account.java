package com.bank.account;

import java.sql.Date;  
//java.sql.Date; : 년/월/일
//java.util.Date;: 년/월/일/시/분/초 (더 자세하고 처리하기 까다로움)

/*ACOOUNT_ID NOT NULL VARCHAR2(20) 
MEMBER_ID  NOT NULL VARCHAR2(20) 
BALANCE             NUMBER       
CREDATE             DATE */

public class Account {
	
	private String accountId;
	private String memberId;
	private int balance;
	private Date credate;
	
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Date getCredate() {
		return credate;
	}
	public void setCredate(Date credate) {
		this.credate = credate;
	}
	
	

}
