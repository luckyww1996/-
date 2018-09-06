package com.ssm.yunshang.pojo;

public class VipConsumeInfo {
	
	private String VipName;
	private String SellerName;
	private float Balance;
	private float Integral;
	
	public String getVipName() {
		return VipName;
	}
	
	public void setVipName(String vipName) {
		VipName = vipName;
	}
	
	public String getSellerName() {
		return SellerName;
	}
	
	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}
	
	public float getBalance() {
		return Balance;
	}
	
	public void setBalance(float balance) {
		Balance = balance;
	}
	
	public float getIntegral() {
		return Integral;
	}
	
	public void setIntegral(float integral) {
		Integral = integral;
	}

	@Override
	public String toString() {
		return "VipConsumeInfo [VipName=" + VipName + ", SellerName=" + SellerName + ", Balance=" + Balance
				+ ", Integral=" + Integral + "]";
	}

}
