package com.ssm.yunshang.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.yunshang.dao.ApplyInfoManagerMapper;
import com.ssm.yunshang.pojo.ApplyInfo;
import com.ssm.yunshang.pojo.Page;
import com.ssm.yunshang.pojo.SellerBasicInfo;

@Service
public class ApplyInfoManagerService {
	
		@Resource
		private ApplyInfoManagerMapper applyinfoManagerMapper;
		

		/**
		 * 
		 * @param 
		 * @return
		 * @throws Exception
		 */
		public Page<ApplyInfo> QueryApplyInfo(ApplyInfo applyinfo,Page<ApplyInfo> page) throws Exception{
			int pageMAXRow = page.getPageRowNum();
			int startrow = (page.getCurrentPage()-1)*pageMAXRow;
			
			List<ApplyInfo> applyinfoList = applyinfoManagerMapper.queryApplyInfo(applyinfo,startrow,pageMAXRow);
			page.setObjList(applyinfoList);
			
			int allRowNum = applyinfoManagerMapper.queryApplyInfoCount(applyinfo);
			int allPageNum = allRowNum%pageMAXRow==0?allRowNum/pageMAXRow:allRowNum/pageMAXRow+1;
			page.setAllPageNum(allPageNum);
			
			return page;
		}

		public void UpdateApplyInfoShenHe(String ApplySellerName,String result) throws Exception{
			result = "0".equals(result)?"未通过":"通过";
			applyinfoManagerMapper.updateApplyInfoShenHe(ApplySellerName,result);
		}

		public void InsertApplyInfoShenHe(String ApplySellerName) throws Exception{
			
			ApplyInfo applyinfo=applyinfoManagerMapper.SelectApplyInfoShenHe(ApplySellerName);
			
			applyinfoManagerMapper.InsertApplyInfoShenHe(applyinfo);
		}
		
		public Page<SellerBasicInfo> QuerySellerBasicInfo(SellerBasicInfo sellerbasicinfo,Page<SellerBasicInfo> page) throws Exception{
			
			int pageMAXRow = page.getPageRowNum();
			int startrow = (page.getCurrentPage()-1)*pageMAXRow;
			
			List<SellerBasicInfo> sellerbasicinfoList = applyinfoManagerMapper.querySellerBasicInfo(sellerbasicinfo,startrow,pageMAXRow);
			page.setObjList(sellerbasicinfoList);
			
			int allRowNum = applyinfoManagerMapper.querySellerBasicInfoCount(sellerbasicinfo);
			int allPageNum = allRowNum%pageMAXRow==0?allRowNum/pageMAXRow:allRowNum/pageMAXRow+1;
			page.setAllPageNum(allPageNum);
			
			return page;
		}
		
		public SellerBasicInfo QuerySellerId(int id) throws Exception {
			
			SellerBasicInfo sellerbasicinfo;
			sellerbasicinfo=applyinfoManagerMapper.querySellerId(id);
			return sellerbasicinfo;
		}
		
		public void UpdateSellerBasicInfo(String sellerId,String sellerTrade,String sellerName,String sellerAddress,String sellerStar,String sellerIntroduce,String sellerProvince,String sellerCity,String sellerPhone,String sellerEmail,String consumeIntegralPercent,String sellerVipDiscountPercent) throws Exception {
			
			applyinfoManagerMapper.UpdateSellerBasicInfo(sellerId,sellerTrade,sellerName,sellerAddress,sellerStar,sellerIntroduce,sellerProvince,sellerCity,sellerPhone,sellerEmail,consumeIntegralPercent,sellerVipDiscountPercent);
		
		}
		
}


