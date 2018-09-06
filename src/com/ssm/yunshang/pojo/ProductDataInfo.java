package com.ssm.yunshang.pojo;

public class ProductDataInfo {
	
	private String SellerName;
	private String ProductName;
	private String ProductIntroduce;
	private Float ProductPrice;
	private String ProductPicture;
	
	public String getSellerName() {
		return SellerName;
	}
	
	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}
	
	public String getProductName() {
		return ProductName;
	}
	
	public void setProductName(String productName) {
		ProductName = productName;
	}
	
	public String getProductIntroduce() {
		return ProductIntroduce;
	}
	
	public void setProductIntroduce(String productIntroduce) {
		ProductIntroduce = productIntroduce;
	}
	
	public Float getProductPrice() {
		return ProductPrice;
	}
	
	public void setProductPrice(Float productPrice) {
		ProductPrice = productPrice;
	}

	public String getProductPicture() {
		return ProductPicture;
	}

	public void setProductPicture(String productPicture) {
		ProductPicture = productPicture;
	}

	@Override
	public String toString() {
		return "ProductDataInfo [SellerName=" + SellerName + ", ProductName=" + ProductName + ", ProductIntroduce="
				+ ProductIntroduce + ", ProductPrice=" + ProductPrice + ", ProductPicture=" + ProductPicture + "]";
	}

	

}
