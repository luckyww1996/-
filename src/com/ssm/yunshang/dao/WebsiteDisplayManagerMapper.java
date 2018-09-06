package com.ssm.yunshang.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.yunshang.pojo.ProductDataInfo;
import com.ssm.yunshang.pojo.SellerBasicInfo;

import java.util.List;

public interface WebsiteDisplayManagerMapper {
	
	public List<SellerBasicInfo> QuerySellerBasicInfo(@Param("sellerBasicInfo")SellerBasicInfo sellerBasicInfo) throws Exception;
	
	public List<ProductDataInfo> QueryProductDataInfo(@Param("productDataInfo")ProductDataInfo productDataInfo) throws Exception;

}