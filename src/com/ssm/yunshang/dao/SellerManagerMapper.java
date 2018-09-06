package com.ssm.yunshang.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.yunshang.pojo.AccountInfo;
import com.ssm.yunshang.pojo.SellerBasicInfo;
import com.ssm.yunshang.pojo.VipBasicInfo;
import com.ssm.yunshang.pojo.VipConsumeInfo;

public interface SellerManagerMapper {
	
public void SellerApply(@Param("ApplySellerName")String ApplySellerName,@Param("ApplySellerTrade")String ApplySellerTrade,@Param("ApplySellerAddress")String ApplySellerAddress,@Param("ApplySellerStar")String ApplySellerStar,@Param("ApplySellerIntroduce")String ApplySellerIntroduce,@Param("ApplySellerProvince")String ApplySellerProvince,@Param("ApplySellerCity")String ApplySellerCity,@Param("ApplySellerPhone")String ApplySellerPhone,@Param("ApplySellerEmail")String ApplySellerEmail,@Param("ApplyConsumeIntegralPercent")Float ApplyConsumeIntegralPercent,@Param("ApplyVipDiscountPercent")Float ApplyVipDiscountPercent) throws Exception;
	
	public AccountInfo Login(@Param("AccountName")String AccountName,@Param("AccountPassword")String AccountPassword) throws Exception;
	
	public void updateStatus(@Param("AccountStatus")String AccountStatus,@Param("AccountName")String AccountName) throws Exception;
	
	public void Product(@Param("SellerName")String SellerName,@Param("ProductName")String ProductName,@Param("ProductIntroduce")String ProductIntroduce,@Param("ProductPrice")Float ProductPrice,@Param("ProductPicture")String ProductPicture) throws Exception;
	
	public void VipInfo(@Param("VipCardNumber")Integer VipCardNumber,@Param("SellerName")String SellerName,@Param("IdCardNumber")String IdCardNumber,@Param("VipName")String VipName,@Param("VipSex")String VipSex,@Param("VipPhone")String VipPhone,@Param("VipAddress")String VipAddress,@Param("VipEmail")String VipEmail) throws Exception;
	
	public void Register(@Param("AccountType")String AccountType,@Param("AccountName")String AccountName,@Param("AccountPassword")String AccountPassword,@Param("AccountPassword2")String AccountPassword2) throws Exception;
	
	public SellerBasicInfo QueryInfo(@Param("SellerName")String SellerName) throws Exception;
	
	public void UpdateInfo(@Param("SellerName")String SellerName,@Param("SellerTrade")String SellerTrade,@Param("SellerAddress")String SellerAddress,@Param("SellerStar")String SellerStar,@Param("SellerIntroduce")String SellerIntroduce,@Param("SellerProvince")String SellerProvince,@Param("SellerCity")String SellerCity,@Param("SellerPhone")String SellerPhone,@Param("SellerEmail")String SellerEmail,@Param("ConsumeIntegralPercent")float ConsumeIntegralPercent,@Param("SellerVipDiscountPercent")float SellerVipDiscountPercent) throws Exception;
	
	//public List<String> QueryName() throws Exception;
	
	public String Verify(String VipName) throws Exception;
	
	public VipConsumeInfo QueryVipCardBalance(@Param("SellerName")String SellerName,@Param("VipName")String VipName) throws Exception;
	
	public void UpdateVipConsumeInfo(@Param("Balance")float Balance,@Param("Integral")float Integral,@Param("VipName")String VipName) throws Exception;
	
	public void UpdateIntegralInfo(@Param("Integral")float Integral,@Param("VipName")String VipName) throws Exception;
	
	public void UpdateBalanceInfo(@Param("Balance")float Balance,@Param("VipName")String VipName) throws Exception;
	
	public void InsertVipConsumeInfo(@Param("SellerName")String SellerName,@Param("VipName")String VipName) throws Exception;
	
	public VipBasicInfo QueryVipBasicInfo(@Param("SellerName")String SellerName,@Param("VipName")String VipName) throws Exception;
	
}













