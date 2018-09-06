package com.ssm.yunshang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.yunshang.pojo.AccountInfo;
import com.ssm.yunshang.pojo.ApplyInfo;

public interface OperationManagerMapper {
	
	public AccountInfo OperationLogin(@Param("AccountName")String AccountName,@Param("AccountPassword")String AccountPassword) throws Exception;
	
	public List<ApplyInfo> OperationApplyInfo(@Param("ApplySellerName")String ApplySellerName,@Param("ApplySellerTrade")String ApplySellerTrade,@Param("ApplySellerAddress")String ApplySellerAddress,@Param("ApplySellerStar")String ApplySellerStar,@Param("ApplySellerIntroduce")String ApplySellerIntroduce,@Param("ApplySellerProvince")String ApplySellerProvince,@Param("ApplySellerCity")String ApplySellerCity,@Param("ApplySellerPhone")String ApplySellerPhone,@Param("ApplySellerEmail")String ApplySellerEmail,@Param("ApplyConsumeIntegralPercent")float ApplyConsumeIntegralPercent,@Param("ApplyVipDiscountPercent")float ApplyVipDiscountPercent,@Param("ApplyStatus")String ApplyStatus) throws Exception;
	
	public void SellerAccountAssignment(@Param("AccountName")String AccountName,@Param("AccountPassword")String AccountPassword) throws Exception;

}