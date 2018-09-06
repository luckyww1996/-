package com.ssm.yunshang.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.yunshang.dao.SellerManagerMapper;
import com.ssm.yunshang.pojo.AccountInfo;
import com.ssm.yunshang.pojo.SellerBasicInfo;
import com.ssm.yunshang.pojo.VipBasicInfo;
import com.ssm.yunshang.pojo.VipConsumeInfo;

@Service
public class SellerManagerService {
	
	@Resource
	private SellerManagerMapper sellerManagerMapper;
    
    public void SellerJoin(String ApplySellerName,String ApplySellerTrade,String ApplySellerAddress,String ApplySellerStar,String ApplySellerIntroduce,String ApplySellerProvince,String ApplySellerCity,String ApplySellerPhone,String ApplySellerEmail,Float ApplyConsumeIntegralPercent,Float ApplyVipDiscountPercent) throws Exception{
		
		sellerManagerMapper.SellerApply(ApplySellerName,ApplySellerTrade,ApplySellerAddress,ApplySellerStar,ApplySellerIntroduce,ApplySellerProvince,ApplySellerCity,ApplySellerPhone,ApplySellerEmail,ApplyConsumeIntegralPercent,ApplyVipDiscountPercent);
	}
	
	public AccountInfo SellerLogin(String AccountName,String AccountPassword) throws Exception{
		
		AccountInfo accountInfo = sellerManagerMapper.Login(AccountName, AccountPassword);		
		return accountInfo;
	}
	
	public void updateStatus(String AccountStatus,String AccountName) throws Exception{
		
		sellerManagerMapper.updateStatus(AccountStatus,AccountName);
	}
	
	public void SellerProduct(String SellerName,String ProductName,String ProductIntroduce,Float ProductPrice,String ProductPicture) throws Exception{
		
		sellerManagerMapper.Product(SellerName,ProductName,ProductIntroduce,ProductPrice,ProductPicture);
	}
	
	public void SellerVip(Integer VipCardNumber,String SellerName,String IdCardNumber,String VipName,String VipSex,String VipPhone,String VipAddress,String VipEmail) throws Exception{
		
		sellerManagerMapper.VipInfo(VipCardNumber,SellerName,IdCardNumber,VipName,VipSex,VipPhone,VipAddress,VipEmail);
	}
	
	public void VipRegister(String AccountType,String AccountName,String AccountPassword,String AccountPassword2) throws Exception{
		
		sellerManagerMapper.Register(AccountType,AccountName,AccountPassword,AccountPassword2);
	}
	
	public SellerBasicInfo QuerySellerInfo(String SellerName) throws Exception{
    	
		SellerBasicInfo sellerBasicInfo = sellerManagerMapper.QueryInfo(SellerName);
    	return sellerBasicInfo;
    }
	
	public void UpdateSellerInfo(String SellerName,String SellerTrade,String SellerAddress,String SellerStar,String SellerIntroduce,String SellerProvince,String SellerCity,String SellerPhone,String SellerEmail,float ConsumeIntegralPercent,float SellerVipDiscountPercent) throws Exception{
		
		sellerManagerMapper.UpdateInfo(SellerName,SellerTrade,SellerAddress,SellerStar,SellerIntroduce,SellerProvince,SellerCity,SellerPhone,SellerEmail,ConsumeIntegralPercent,SellerVipDiscountPercent);
	}
	
	/*
	public List<String> QueryVipName() throws Exception{
    	
		List<String> Name = sellerManagerMapper.QueryName();
    	return Name;
    }
	*/
	
	public String VerifyName(String VipName) throws Exception{
    	
		String temp = sellerManagerMapper.Verify(VipName);
    	return temp;
    }	
	
    public VipConsumeInfo QueryVipCardBalance(String SellerName,String VipName) throws Exception{
    	
    	VipConsumeInfo vipConsumeInfo=sellerManagerMapper.QueryVipCardBalance(SellerName,VipName);
    	return vipConsumeInfo;
    	
    }
    
    public void UpdateVipConsumeInfo(float Balance,float Integral,String VipName) throws Exception{
    	
        sellerManagerMapper.UpdateVipConsumeInfo(Balance,Integral,VipName);
    	
    }
	
    public void UpdateIntegralInfo(float Integral,String VipName) throws Exception{
    	
        sellerManagerMapper.UpdateIntegralInfo(Integral,VipName);
    	
    }
	
    public void UpdateBalanceInfo(float Balance,String VipName) throws Exception{
    	
        sellerManagerMapper.UpdateBalanceInfo(Balance,VipName);
    	
    }
    
    public void InsertVipConsumeInfo(String SellerName,String VipName) throws Exception{
    	
        sellerManagerMapper.InsertVipConsumeInfo(SellerName,VipName);
    	
    }
    
    public VipBasicInfo QueryVipBasicInfo(String SellerName,String VipName) throws Exception{
    	
    	VipBasicInfo vipBasicInfo=sellerManagerMapper.QueryVipBasicInfo(SellerName,VipName);
    	return vipBasicInfo;
    	
    }
    
}







