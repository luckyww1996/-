package com.ssm.yunshang.controller;

import static org.junit.Assert.assertNotNull;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.varia.NullAppender;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.yunshang.pojo.AccountInfo;
import com.ssm.yunshang.pojo.VipBasicInfo;
import com.ssm.yunshang.pojo.VipConsumeInfo;
import com.ssm.yunshang.service.VipManagerService;



@Controller
public class VipManager {
	@Resource
	VipManagerService vms;
	
	@RequestMapping("/IntoIndexC.do")
	public String IntoIndexCController() throws Exception{
		
		return "index";
	}
	
	@RequestMapping("/IntoVipLogin.do")
	public String IntoVipLoginController() {
		
		return "VipLogin";
	}
	
	@RequestMapping("/VipLogin.do")
	public String VipLoginController(String AccountName,String AccountPassword,HttpServletRequest request,Model model) throws Exception{
		
		AccountInfo accountInfo = null;
		String s1 = "��Ա";
		String s2 = "�ѵ�½";
		accountInfo=vms.VipLogin(AccountName, AccountPassword);
	    if(accountInfo!=null) {
			if((accountInfo.getAccountType()).equals(s1)==false) {
	    		model.addAttribute("MSG","�ǻ�Ա�����ܲ�����");
	     		return "VipLogin";
	    	}
	    	else if((accountInfo.getAccountStatus()).equals(s2)==true) {
	    		model.addAttribute("MSG","�����ظ���½��");
	     		return "VipLogin";
	    	}
	    	else if(request.getSession().getAttribute("CurrentUser")!=null) {
	    		model.addAttribute("MSG","��Ǹ��ͬһ���������ͬʱ��½����˻���");
	     		return "VipLogin";	
	    	}
	    	else {
	    		request.getSession().setAttribute("CurrentUser",AccountName);
				//model.addAttribute("MSG",AccountName);
				vms.updateVipStatus(s2,AccountName);
		        return "VipManage";
	    	}
	    } 
		model.addAttribute("MSG","�˺Ż��������");
 		return "VipLogin";
	}
	
	@RequestMapping("/VipLogout.do")
	public String VipLogoutController(HttpServletRequest request) throws Exception{
		
		String s1 = "δ��½";
        String s2 = (String)request.getSession().getAttribute("CurrentUser");
		vms.updateVipStatus(s1,s2);
		request.getSession().removeAttribute("CurrentUser"); 
		return "index";
	}
	
	@RequestMapping("/IntoVipManage.do")
	public String IntoVipManageController() {
		
		return "VipManage";
	}
	
	@RequestMapping("/IntoVipPasswordChange.do")
	public String IntoVipPasswordChangeController() {
		
		return "VipPasswordChange";
	}
	
	@RequestMapping("/VipPasswordChange.do")
	public String VipPasswordChangeController(String AccountName,String AccountPassword1,String AccountPassword2,String AccountPassword3,HttpServletRequest request,Model model) throws Exception{
		
		AccountInfo accountInfo = null;
		String s1 = (String)request.getSession().getAttribute("CurrentUser");
		accountInfo=vms.VipLogin(s1, AccountPassword1);
		if(accountInfo!=null){
			if(AccountPassword2.equals(AccountPassword3)==true) {
				vms.VipPasswordChange(AccountPassword2,s1);
				model.addAttribute("MSG","�޸ĳɹ���");
			 	return "VipManage";					
			}
			model.addAttribute("MSG","�������벻һ�£�");
			return "VipPasswordChange";
		}
		model.addAttribute("MSG","�����������");
	 	return "VipPasswordChange";		
	}
	
	@RequestMapping("/IntoVipAccountManage.do")
	public String IntoVipAccountManageController(HttpServletRequest request,Model model) throws Exception{
		
		VipBasicInfo vipBasicInfo=null;
		vipBasicInfo=vms.QueryVipBasicInfo((String)request.getSession().getAttribute("CurrentUser"));
		if(vipBasicInfo!=null) {
			model.addAttribute("VipBasicInfo",vipBasicInfo);
			return "VipAccountManage";
		}
		model.addAttribute("MSG","��Ա������Ϣ��δ�Ǽǣ�");
		return "VipManage";
	}
	
	@RequestMapping("/VipBasicInfoMaintenance.do")
	public String VipBasicInfoMaintenanceController(String VipCardNumber,String SellerName,String IdCardNumber,String VipSex,String VipPhone,String VipAddress,String VipEmail,String VipName,HttpServletRequest request,Model model) throws Exception{
		
        String s1 = (String)request.getSession().getAttribute("CurrentUser");
		vms.UpdateVipBasicInfo(VipSex,VipPhone,VipAddress,VipEmail,s1);
		//model.addAttribute("MSG","��Ϣ�ύ�ɹ���");
		return "SucceedA";	
	}
	
	@RequestMapping("/IntoVipCardBalanceQuery.do")
	public String IntoVipCardBalanceQueryController(HttpServletRequest request,Model model) throws Exception{
		
		VipConsumeInfo vipConsumeInfo=null;
		vipConsumeInfo=vms.QueryVipCardBalance((String)request.getSession().getAttribute("CurrentUser"));
		if(vipConsumeInfo!=null) {
			model.addAttribute("VipConsumeInfo",vipConsumeInfo);
			return "VipCardBalanceQuery";
		}
		model.addAttribute("MSG","�û�Աû�й���ֵ��ʷ�����ܲ�ѯ��");
		return "VipManage";
	}
	
}
