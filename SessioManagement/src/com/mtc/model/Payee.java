package com.mtc.model;

public class Payee {

	private String name;
	private String accountNo;
	private String branchCode;

	public Payee() {
	}

	public Payee(String name, String accountNo, String branchCode) {
		this.name = name;
		this.accountNo = accountNo;
		this.branchCode = branchCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	@Override
	public String toString() {
		return "Payee [name=" + name + ", accountNo=" + accountNo + ", branchCode=" + branchCode + "]";
	}
	
}
