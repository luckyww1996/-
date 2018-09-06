package com.ssm.yunshang.pojo;

public class AccountInfo {
	
	private int AccountId;
	private String AccountType;
	private String AccountName;
	private String AccountPassword;
	private String AccountStatus;
	
	public int getAccountId() {
		return AccountId;
	}
	
	public void setAccountId(int accountId) {
		AccountId = accountId;
	}
	
	public String getAccountType() {
		return AccountType;
	}
	
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	
	public String getAccountName() {
		return AccountName;
	}
	
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	
	public String getAccountPassword() {
		return AccountPassword;
	}
	
	public void setAccountPassword(String accountPassword) {
		AccountPassword = accountPassword;
	}
	
	public String getAccountStatus() {
		return AccountStatus;
	}
	
	public void setAccountStatus(String accountStatus) {
		AccountStatus = accountStatus;
	}

	@Override
	public String toString() {
		return "AccountInfo [AccountId=" + AccountId + ", AccountType=" + AccountType + ", AccountName=" + AccountName
				+ ", AccountPassword=" + AccountPassword + ", AccountStatus=" + AccountStatus + "]";
	}

}
