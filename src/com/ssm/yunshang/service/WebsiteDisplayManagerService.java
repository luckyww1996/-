package com.ssm.yunshang.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.yunshang.dao.WebsiteDisplayManagerMapper;
import com.ssm.yunshang.pojo.ProductDataInfo;
import com.ssm.yunshang.pojo.SellerBasicInfo;

@Service
public class WebsiteDisplayManagerService {
	
	@Resource
	private WebsiteDisplayManagerMapper websiteDisplayManagerMapper;
    
    public List<SellerBasicInfo> QuerySellerBasicInfo(SellerBasicInfo sellerBasicInfo) throws Exception{
    	
    	List<SellerBasicInfo> sellerBasicInfoList=websiteDisplayManagerMapper.QuerySellerBasicInfo(sellerBasicInfo);
    	return sellerBasicInfoList;
    	
    }
    
    public List<ProductDataInfo> QueryProductDataInfo(ProductDataInfo productDataInfo) throws Exception{
    	
    	List<ProductDataInfo> productDataInfoList=websiteDisplayManagerMapper.QueryProductDataInfo(productDataInfo);
    	return productDataInfoList;
    	
    }

}
