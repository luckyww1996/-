package com.ssm.yunshang.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.yunshang.pojo.ProductDataInfo;
import com.ssm.yunshang.pojo.SellerBasicInfo;
import com.ssm.yunshang.service.WebsiteDisplayManagerService;
import java.util.List;

@Controller
public class WebsiteDisplayManager {
	
	@Resource
	WebsiteDisplayManagerService wdms;
	
	@RequestMapping("/IntoIndexD.do")
	public String IntoIndexDController() throws Exception{
		
		return "index";
	}
	
	@RequestMapping("/IntoWebsiteDisplay.do")
	public String IntoVipLoginController() throws Exception{
		
		return "WebsiteDisplay";
	}
	
	@RequestMapping("/SellerBasicInfoDisplay.do")
	public String SellerBasicInfoDisplayController(SellerBasicInfo sellerBasicInfo,HttpServletRequest request,Model model) throws Exception{
		
		List<SellerBasicInfo> sellerBasicInfoList =wdms.QuerySellerBasicInfo(sellerBasicInfo);
		model.addAttribute("sellerBasicInfoList", sellerBasicInfoList);
		return "SellerInfoDisplay";
	}
	
	@RequestMapping("/ProductDataInfoDisplay.do")
	public String ProductDataInfoDisplayController(ProductDataInfo productDataInfo,HttpServletRequest request,Model model) throws Exception{
		
		String s1 = productDataInfo.getSellerName();
		List<ProductDataInfo> productDataInfoList =wdms.QueryProductDataInfo(productDataInfo);
		model.addAttribute("productDataInfoList", productDataInfoList);
		model.addAttribute("SellerName", s1);
		return "ProductDataInfoDisplay";
	}

}
