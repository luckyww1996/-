package com.ssm.yunshang.pojo;

public class SellerBasicInfo {
	
	private int SellerId;
	private String SellerTrade;
	private String SellerName;
	private String SellerAddress;
	private String SellerStar;
	private String SellerIntroduce;
	private String SellerProvince;
	private String SellerCity;
	private String SellerPhone;
	private String SellerEmail;
	private float ConsumeIntegralPercent;
	private float SellerVipDiscountPercent;
	
	public int getSellerId() {
		return SellerId;
	}
	
	public void setSellerId(int sellerId) {
		SellerId = sellerId;
	}
	
	public String getSellerTrade() {
		return SellerTrade;
	}
	
	public void setSellerTrade(String sellerTrade) {
		SellerTrade = sellerTrade;
	}
	
	public String getSellerName() {
		return SellerName;
	}
	
	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}
	
	public String getSellerAddress() {
		return SellerAddress;
	}
	
	public void setSellerAddress(String sellerAddress) {
		SellerAddress = sellerAddress;
	}
	
	public String getSellerStar() {
		return SellerStar;
	}
	
	public void setSellerStar(String sellerStar) {
		SellerStar = sellerStar;
	}
	
	public String getSellerIntroduce() {
		return SellerIntroduce;
	}
	
	public void setSellerIntroduce(String sellerIntroduce) {
		SellerIntroduce = sellerIntroduce;
	}
	
	public String getSellerProvince() {
		return SellerProvince;
	}
	
	public void setSellerProvince(String sellerProvince) {
		SellerProvince = sellerProvince;
	}
	
	public String getSellerCity() {
		return SellerCity;
	}
	
	public void setSellerCity(String sellerCity) {
		SellerCity = sellerCity;
	}
	
	public String getSellerPhone() {
		return SellerPhone;
	}
	
	public void setSellerPhone(String sellerPhone) {
		SellerPhone = sellerPhone;
	}
	
	public String getSellerEmail() {
		return SellerEmail;
	}
	
	public void setSellerEmail(String sellerEmail) {
		SellerEmail = sellerEmail;
	}
	
	public float getConsumeIntegralPercent() {
		return ConsumeIntegralPercent;
	}
	
	public void setConsumeIntegralPercent(float consumeIntegralPercent) {
		ConsumeIntegralPercent = consumeIntegralPercent;
	}
	
	public float getSellerVipDiscountPercent() {
		return SellerVipDiscountPercent;
	}
	
	public void setSellerVipDiscountPercent(float sellerVipDiscountPercent) {
		SellerVipDiscountPercent = sellerVipDiscountPercent;
	}

	@Override
	public String toString() {
		return "SellerBasicInfo [SellerId=" + SellerId + ", SellerTrade=" + SellerTrade + ", SellerName=" + SellerName
				+ ", SellerAddress=" + SellerAddress + ", SellerStar=" + SellerStar + ", SellerIntroduce="
				+ SellerIntroduce + ", SellerProvince=" + SellerProvince + ", SellerCity=" + SellerCity
				+ ", SellerPhone=" + SellerPhone + ", SellerEmail=" + SellerEmail + ", ConsumeIntegralPercent="
				+ ConsumeIntegralPercent + ", SellerVipDiscountPercent=" + SellerVipDiscountPercent + "]";
	}
	
}
