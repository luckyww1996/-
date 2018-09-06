package com.ssm.yunshang.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.yunshang.pojo.ApplyInfo;
import com.ssm.yunshang.pojo.SellerBasicInfo;


public interface ApplyInfoManagerMapper {
	
	public List<ApplyInfo> queryApplyInfo(@Param("applyinfo")ApplyInfo applyinfo,@Param("startrow")int startrow,@Param("length")int length) throws Exception;
	
	public int queryApplyInfoCount(@Param("applyinfo")ApplyInfo applyinfo) throws Exception;

	public void updateApplyInfoShenHe(@Param("ApplySellerName")String ApplySellerName,@Param("result")String result) throws Exception;
	
	public void InsertApplyInfoShenHe(ApplyInfo applyinfo) throws Exception;
	
	public ApplyInfo SelectApplyInfoShenHe(@Param("ApplySellerName")String ApplySellerName) throws Exception;
	
	public int querySellerBasicInfoCount(@Param("sellerbasicinfo")SellerBasicInfo sellerbasicinfo) throws Exception;
	
	public List<SellerBasicInfo> querySellerBasicInfo(@Param("sellerbasicinfo")SellerBasicInfo sellerbasicinfo,@Param("startrow")int startrow,@Param("length")int length);
	
	public SellerBasicInfo querySellerId(@Param("id")Integer id) throws Exception;
	
	public void UpdateSellerBasicInfo(@Param("sellerId")String sellerId,@Param("sellerTrade")String sellerTrade,@Param("sellerName")String sellerName,@Param("sellerAddress")String sellerAddress,@Param("sellerStar")String sellerStar,@Param("sellerIntroduce")String sellerIntroduce,@Param("sellerProvince")String sellerProvince,@Param("sellerCity")String sellerCity,@Param("sellerPhone")String sellerPhone,@Param("sellerEmail")String sellerEmail,@Param("consumeIntegralPercent")String consumeIntegralPercent,@Param("sellerVipDiscountPercent")String sellerVipDiscountPercent)throws Exception;

}
