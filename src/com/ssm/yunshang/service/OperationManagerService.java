package com.ssm.yunshang.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.ssm.yunshang.dao.OperationManagerMapper;
import com.ssm.yunshang.dao.VipManagerMapper;
import com.ssm.yunshang.pojo.AccountInfo;
import com.ssm.yunshang.pojo.ApplyInfo;

@Service
public class OperationManagerService {
	
	@Resource
	private OperationManagerMapper operationManagerMapper;
    /**
     * ÔËÎ¬µÇÂ½
     * @param AccountName
     * @param AccountPassword
     * @return
     * @throws IOException
     */	
	public AccountInfo OperationLogin(String AccountName,String AccountPassword) throws Exception{
		
		AccountInfo accountInfo = operationManagerMapper.OperationLogin(AccountName, AccountPassword);		
		return accountInfo;
	}
	
	public List<ApplyInfo> OperationApplyInfo(String ApplySellerName,String ApplySellerTrade,String ApplySellerAddress,String ApplySellerStar,String ApplySellerIntroduce,String ApplySellerProvince,String ApplySellerCity,String ApplySellerPhone,String ApplySellerEmail,float ApplyConsumeIntegralPercent,float ApplyVipDiscountPercent,String ApplyStatus) throws Exception{
		
		List<ApplyInfo> applyInfo = operationManagerMapper.OperationApplyInfo(ApplySellerName,ApplySellerTrade,ApplySellerAddress,ApplySellerStar,ApplySellerIntroduce,ApplySellerProvince,ApplySellerCity,ApplySellerPhone,ApplySellerEmail,ApplyConsumeIntegralPercent,ApplyVipDiscountPercent,ApplyStatus);		
		return applyInfo;
	}
	
	public void SellerAccountAssignment(String AccountName,String AccountPassword) throws Exception{
		
		operationManagerMapper.SellerAccountAssignment(AccountName, AccountPassword);
	}
	
}









