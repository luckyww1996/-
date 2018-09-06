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
     * ��Ա��½
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
	 * ��Ա��½״̬����
	 * @param AccountStatus
	 * @param AccountName
	 * @throws Exception
	 */
	public void updateVipStatus(String AccountStatus,String AccountName) throws Exception{
		
		vipManagerMapper.updateVipStatus(AccountStatus,AccountName);
	}
	/**
	 * ��Ա�����޸�
	 * @param AccountPassword
	 * @param AccountName
	 * @throws Exception
	 */
	public void VipPasswordChange(String AccountPassword,String AccountName) throws Exception{
		
		vipManagerMapper.VipPasswordChange(AccountPassword,AccountName);
	}
	/**
	 * ��Ա������Ϣ����
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
     * ��Ա������Ϣ��ѯ
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
