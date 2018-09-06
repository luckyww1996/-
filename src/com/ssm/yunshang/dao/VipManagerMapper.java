package com.ssm.yunshang.dao;

import java.io.IOException;

import org.apache.ibatis.annotations.Param;

import com.ssm.yunshang.pojo.AccountInfo;
import com.ssm.yunshang.pojo.VipBasicInfo;
import com.ssm.yunshang.pojo.VipConsumeInfo;

public interface VipManagerMapper {

	public AccountInfo findVipByLogin(@Param("AccountName")String AccountName,@Param("AccountPassword")String AccountPassword) throws Exception;
	
	public void updateVipStatus(@Param("AccountStatus")String AccountStatus,@Param("AccountName")String AccountName) throws Exception;
	
	public void VipPasswordChange(@Param("AccountPassword")String AccountPassword,@Param("AccountName")String AccountName) throws Exception;
	
	public void UpdateVipBasicInfo(@Param("VipSex")String VipSex,@Param("VipPhone")String VipPhone,@Param("VipAddress")String VipAddress,@Param("VipEmail")String VipEmail,@Param("VipName")String VipName) throws Exception;
	
	public VipBasicInfo QueryVipBasicInfo(@Param("VipName")String VipName) throws Exception;
	
	public VipConsumeInfo QueryVipCardBalance(@Param("VipName")String VipName) throws Exception;
	

}