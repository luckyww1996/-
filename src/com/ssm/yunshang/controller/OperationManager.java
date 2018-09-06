package com.ssm.yunshang.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ssm.yunshang.pojo.AccountInfo;
import com.ssm.yunshang.pojo.ApplyInfo;
import com.ssm.yunshang.pojo.Page;
import com.ssm.yunshang.pojo.SellerBasicInfo;
import com.ssm.yunshang.service.ApplyInfoManagerService;
import com.ssm.yunshang.service.OperationManagerService;
import com.ssm.yunshang.service.VipManagerService;

@Controller
public class OperationManager {

	@Resource
	OperationManagerService oms;
	
	@Resource
	private ApplyInfoManagerService applyinfoManagerService;
	
	@RequestMapping("/IntoIndexA.do")
	public String IntoIndexAController() throws Exception{
		
		return "index";
	}
	
	@RequestMapping("/IntoOperationLogin.do")
	public String IntoOperationLoginController() throws Exception{
		
		return "OperationLogin";
	}
	
	@RequestMapping("/IntoomMange.do")
	public String IntoomManageController() {
		
		return "omMange";
	}
	
	@RequestMapping("/OperationLogin.do")
	public String OperationLoginController(String AccountName,String AccountPassword,HttpServletRequest request,Model model) throws Exception{
		
		AccountInfo accountInfo = null;
		String s1 = "管理员";
		accountInfo=oms.OperationLogin(AccountName, AccountPassword);
	    if(accountInfo!=null) {
			if((accountInfo.getAccountType()).equals(s1)==false) {
	    		model.addAttribute("MSG","非管理员，不能操作！");
	     		return "OperationLogin";
	    	}
	    	else {
	    		request.getSession().setAttribute("CurrentUser",AccountName);
				//model.addAttribute("MSG",AccountName);
		        return "omMange";
	    	}
	    } 
		model.addAttribute("MSG","账号或密码错误！");
 		return "OperationLogin";
	}
	
	@RequestMapping("/OperationLogout.do")
	public String OperationLogoutController(HttpServletRequest request) throws Exception{
		
		request.getSession().removeAttribute("CurrentUser"); 
		return "index";
	}
	
	/**
	 * 申请信息查询
	 * @param user
	 * @param session
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/ApplyInfoQuery.do")
	public String ApplyInfoQuery(ApplyInfo applyinfo, Page<ApplyInfo> page, Model model) throws Exception {
		if(page.getCurrentPage()==null||page.getCurrentPage()==0){
			page.setCurrentPage(1);
			page.setPageRowNum(Integer.MAX_VALUE);
		}
		page =applyinfoManagerService.QueryApplyInfo(applyinfo,page);
		model.addAttribute("page", page);
		return "ApplyInfoList";
	}
	
	@RequestMapping("/ApplyInfoQueryShenHe")
	public String ApplyInfoQueryShenHe(String ApplySellerName,String result,HttpServletRequest request,Model model) throws Exception {

		if(0==Integer.parseInt(result)) {			
			applyinfoManagerService.UpdateApplyInfoShenHe(ApplySellerName,result);
			//model.addAttribute("MSG","信息审核成功，未通过！");
			return "SucceedB";		
		}
		model.addAttribute("ApplySellerName",ApplySellerName);
		model.addAttribute("result",result);
		return "AccountAssignment";
	}
	
	@RequestMapping("/AccountAssignment.do")
	public String AccountAssignment(String ApplySellerName,String AccountName,String AccountPassword,String result,HttpServletRequest request,Model model) throws Exception {
        
		applyinfoManagerService.UpdateApplyInfoShenHe(ApplySellerName,result);
		applyinfoManagerService.InsertApplyInfoShenHe(ApplySellerName);
		oms.SellerAccountAssignment(AccountName, AccountPassword);
		//model.addAttribute("MSG","信息审核成功，通过！");
		return "SucceedC";
	}
	
	@RequestMapping("/SellerManage.do")
	public String SellerManage(SellerBasicInfo sellerbasicinfo, Page<SellerBasicInfo> page, Model model) throws Exception {
	
		if(page.getCurrentPage()==null||page.getCurrentPage()==0){
			page.setCurrentPage(1);
			page.setPageRowNum(Integer.MAX_VALUE);
		}
		page =applyinfoManagerService.QuerySellerBasicInfo(sellerbasicinfo,page);
		model.addAttribute("page", page);
		return "SellerBasicInfoList";
	}
	
	@RequestMapping("/SearchSellerBasicInfo.do")
	public String SearchSellerBasicInfo(Integer id,Model model) throws Exception {
		
		SellerBasicInfo sellerbasicinfo;
		sellerbasicinfo=applyinfoManagerService.QuerySellerId(id);
		model.addAttribute("sellerbasicinfo", sellerbasicinfo);
		return "Display";
	}
	
	
	@RequestMapping("/UpdateSellerBasicInfo.do")
	public String UpdateSellerBasicInfo(String SellerId,String SellerTrade,String SellerName,String SellerAddress,String SellerStar,String SellerIntroduce,String SellerProvince,String SellerCity,String SellerPhone,String SellerEmail,String ConsumeIntegralPercent,String SellerVipDiscountPercent,HttpServletRequest request,Model model) throws Exception {
	
		applyinfoManagerService.UpdateSellerBasicInfo(SellerId,SellerTrade,SellerName,SellerAddress,SellerStar,SellerIntroduce,SellerProvince,SellerCity,SellerPhone,SellerEmail,ConsumeIntegralPercent,SellerVipDiscountPercent);
		//model.addAttribute("MSG","信息提交成功 ！");
		return "SucceedD";
	}
	
}

