package com.ssm.yunshang.pojo;

public class ApplyInfo {
	
	private String ApplySellerName;
	private String ApplySellerTrade;
	private String ApplySellerAddress;
	private String ApplySellerStar;
	private String ApplySellerIntroduce;
	private String ApplySellerProvince;
	private String ApplySellerCity;
	private String ApplySellerPhone;
	private String ApplySellerEmail;
	private float ApplyConsumeIntegralPercent;
	private float ApplyVipDiscountPercent;
	private String ApplyStatus;
	
	public String getApplySellerTrade() {
		return ApplySellerTrade;
	}
	
	public void setApplySellerTrade(String applySellerTrade) {
		ApplySellerTrade = applySellerTrade;
	}
	
	public String getApplySellerName() {
		return ApplySellerName;
	}
	
	public void setApplySellerName(String applySellerName) {
		ApplySellerName = applySellerName;
	}
	
	public String getApplySellerAddress() {
		return ApplySellerAddress;
	}
	
	public void setApplySellerAddress(String applySellerAddress) {
		ApplySellerAddress = applySellerAddress;
	}
	
	public String getApplySellerStar() {
		return ApplySellerStar;
	}
	
	public void setApplySellerStar(String applySellerStar) {
		ApplySellerStar = applySellerStar;
	}
	
	public String getApplySellerIntroduce() {
		return ApplySellerIntroduce;
	}
	
	public void setApplySellerIntroduce(String applySellerIntroduce) {
		ApplySellerIntroduce = applySellerIntroduce;
	}
	
	public String getApplySellerProvince() {
		return ApplySellerProvince;
	}
	
	public void setApplySellerProvince(String applySellerProvince) {
		ApplySellerProvince = applySellerProvince;
	}
	
	public String getApplySellerCity() {
		return ApplySellerCity;
	}
	
	public void setApplySellerCity(String applySellerCity) {
		ApplySellerCity = applySellerCity;
	}
	
	public String getApplySellerPhone() {
		return ApplySellerPhone;
	}
	
	public void setApplySellerPhone(String applySellerPhone) {
		ApplySellerPhone = applySellerPhone;
	}
	
	public String getApplySellerEmail() {
		return ApplySellerEmail;
	}
	
	public void setApplySellerEmail(String applySellerEmail) {
		ApplySellerEmail = applySellerEmail;
	}
	
	public float getApplyConsumeIntegralPercent() {
		return ApplyConsumeIntegralPercent;
	}
	
	public void setApplyConsumeIntegralPercent(float applyConsumeIntegralPercent) {
		ApplyConsumeIntegralPercent = applyConsumeIntegralPercent;
	}
	
	public float getApplyVipDiscountPercent() {
		return ApplyVipDiscountPercent;
	}
	
	public void setApplyVipDiscountPercent(float applyVipDiscountPercent) {
		ApplyVipDiscountPercent = applyVipDiscountPercent;
	}
	
	public String getApplyStatus() {
		return ApplyStatus;
	}
	
	public void setApplyStatus(String applyStatus) {
		ApplyStatus = applyStatus;
	}

	@Override
	public String toString() {
		return "ApplyInfo [ApplySellerTrade=" + ApplySellerTrade + ", ApplySellerName=" + ApplySellerName
				+ ", ApplySellerAddress=" + ApplySellerAddress + ", ApplySellerStar=" + ApplySellerStar
				+ ", ApplySellerIntroduce=" + ApplySellerIntroduce + ", ApplySellerProvince=" + ApplySellerProvince
				+ ", ApplySellerCity=" + ApplySellerCity + ", ApplySellerPhone=" + ApplySellerPhone
				+ ", ApplySellerEmail=" + ApplySellerEmail + ", ApplyConsumeIntegralPercent="
				+ ApplyConsumeIntegralPercent + ", ApplyVipDiscountPercent=" + ApplyVipDiscountPercent
				+ ", ApplyStatus=" + ApplyStatus + "]";
	}

}
