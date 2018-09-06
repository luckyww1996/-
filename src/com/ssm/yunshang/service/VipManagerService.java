package com.ssm.yunshang.service;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.ssm.yunshang.controller.VipManager;
import com.ssm.yunshang.dao.VipManagerMapper;
import com.ssm.yunshang.pojo.AccountInfo;
import com.ssm.yunshang.pojo.VipBasicInfo;
import com.ssm.yunshang.pojo.VipConsumeInfo;


@Service
public class VipManagerService {
	
	@Resource
	private VipManagerMapper vipManagerMapper;
    /**
     * 会员登陆
     * @param AccountName
     * @param AccountPassword
     * @return
     * @throws IOException
     */	
	public AccountInfo VipLogin(String AccountName,String AccountPassword) throws Exception{
		
		AccountInfo accountInfo = vipManagerMapper.findVipByLogin(AccountName, AccountPassword);		
		return accountInfo;
	}
	/**
	 * 会员登陆状态更新
	 * @param AccountStatus
	 * @param AccountName
	 * @throws Exception
	 */
	public void updateVipStatus(String AccountStatus,String AccountName) throws Exception{
		
		vipManagerMapper.updateVipStatus(AccountStatus,AccountName);
	}
	/**
	 * 会员密码修改
	 * @param AccountPassword
	 * @param AccountName
	 * @throws Exception
	 */
	public void VipPasswordChange(String AccountPassword,String AccountName) throws Exception{
		
		vipManagerMapper.VipPasswordChange(AccountPassword,AccountName);
	}
	/**
	 * 会员基本信息更新
	 * @param VipSex
	 * @param VipPhone
	 * @param VipAddress
	 * @param VipEmail
	 * @param AccountName
	 * @throws Exception
	 */
    public void UpdateVipBasicInfo(String VipSex,String VipPhone,String VipAddress,String VipEmail,String VipName) throws Exception{
		
		vipManagerMapper.UpdateVipBasicInfo(VipSex,VipPhone,VipAddress,VipEmail,VipName);
	}
    /**
     * 会员基本信息查询
     * @param VipName
     * @return
     * @throws Exception
     */
    public VipBasicInfo QueryVipBasicInfo(String VipName) throws Exception{
    	
    	VipBasicInfo vipBasicInfo=vipManagerMapper.QueryVipBasicInfo(VipName);
    	return vipBasicInfo;
    	
    }
    
    public VipConsumeInfo QueryVipCardBalance(String VipName) throws Exception{
    	
    	VipConsumeInfo vipConsumeInfo=vipManagerMapper.QueryVipCardBalance(VipName);
    	return vipConsumeInfo;
    	
    }

}
