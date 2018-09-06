package com.ssm.yunshang.pojo;

public class VipBasicInfo {
	
	private Integer VipCardNumber;
	private String SellerName;
	private String IdCardNumber;
	private String VipName;
	private String VipSex;
	private String VipPhone;
	private String VipAddress;
	private String VipEmail;	
	
	public int getVipCardNumber() {
		return VipCardNumber;
	}
	
	public void setVipCardNumber(int vipCardNumber) {
		VipCardNumber = vipCardNumber;
	}
	
	public String getSellerName() {
		return SellerName;
	}
	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}
	
	public String getIdCardNumber() {
		return IdCardNumber;
	}
	public void setIdCardNumber(String idCardNumber) {
		IdCardNumber = idCardNumber;
	}
	
	public String getVipName() {
		return VipName;
	}
	public void setVipName(String vipName) {
		VipName = vipName;
	}
	public String getVipSex() {
		return VipSex;
	}
	public void setVipSex(String vipSex) {
		VipSex = vipSex;
	}
	
	public String getVipPhone() {
		return VipPhone;
	}
	
	public void setVipPhone(String vipPhone) {
		VipPhone = vipPhone;
	}
	
	public String getVipAddress() {
		return VipAddress;
	}
	
	public void setVipAddress(String vipAddress) {
		VipAddress = vipAddress;
	}
	
	public String getVipEmail() {
		return VipEmail;
	}
	
	public void setVipEmail(String vipEmail) {
		VipEmail = vipEmail;
	}
	
	@Override
	public String toString() {
		return "VipBasicInfo [VipCardNumber=" + VipCardNumber + ",SellerName=" + SellerName + ",IdCardNumber=" + IdCardNumber
				+ ", VipName=" + VipName + ", VipSex=" + VipSex + ", VipPhone=" + VipPhone + ", VipAddress="
				+ VipAddress + ", VipEmail=" + VipEmail + "]";
	}

}
