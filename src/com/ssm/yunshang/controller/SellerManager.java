package com.ssm.yunshang.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.ssm.yunshang.util.FileUtil;
import com.ssm.yunshang.pojo.AccountInfo;
import com.ssm.yunshang.pojo.SellerBasicInfo;
import com.ssm.yunshang.pojo.VipBasicInfo;
import com.ssm.yunshang.pojo.VipConsumeInfo;
import com.ssm.yunshang.service.SellerManagerService;
 
@Controller
public class SellerManager {
	@Resource
	SellerManagerService sms;
	
	@RequestMapping("/IntoIndexB.do")
	public String IntoIndexBController() throws Exception{
		
		return "index";
	}
	
	@RequestMapping("/IntoSellerJoin.do")
	public String IntoSellerJoinController() {
		
		return "SellerJoin";
	}
	
	//SellerJoin
	@RequestMapping("/SellerJoin.do")
	public String SellerJoinController(String ApplySellerName,String ApplySellerTrade,String ApplySellerAddress,String ApplySellerStar,String ApplySellerIntroduce,String ApplySellerProvince,String ApplySellerCity,String ApplySellerPhone,String ApplySellerEmail,Float ApplyConsumeIntegralPercent,Float ApplyVipDiscountPercent,HttpServletRequest request,Model model) throws Exception{
		
		sms.SellerJoin(ApplySellerName,ApplySellerTrade,ApplySellerAddress,ApplySellerStar,ApplySellerIntroduce,ApplySellerProvince,ApplySellerCity,ApplySellerPhone,ApplySellerEmail,ApplyConsumeIntegralPercent,ApplyVipDiscountPercent);
		model.addAttribute("MSG","���������ύ�ɹ����߸��������ڣ������ͨ��������Ա�����Ÿ�֪���˺���Ϣ��");
		return "index";
	}
	
	@RequestMapping("/IntoSellerLogin.do")
	public String IntoSellerLoginController() {
		
		return "SellerLogin";
	}
	
	@RequestMapping("/SellerLogin.do")
	public String SellerLoginController(String AccountName,String AccountPassword,HttpServletRequest request,Model model) throws Exception{
		
		AccountInfo accountInfo = null;
		String s1 = "�̼�";
		String s2 = "�ѵ�½";
		accountInfo = sms.SellerLogin(AccountName, AccountPassword);
	    if(accountInfo!=null) {
			if((accountInfo.getAccountType()).equals(s1)==false) {
	    		model.addAttribute("MSG","���̼ң����ܲ�����");
	     		return "SellerLogin";
	    	}
	    	else if((accountInfo.getAccountStatus()).equals(s2)==true) {
	    		model.addAttribute("MSG","�����ظ���½��");
	     		return "SellerLogin";
	    	}
	    	else if(request.getSession().getAttribute("CurrentUser")!=null) {
	    		model.addAttribute("MSG","��Ǹ��ͬһ���������ͬʱ��½����˻���");
	     		return "SellerLogin";	
	    	}
	    	else {
	    		request.getSession().setAttribute("CurrentUser",AccountName);
				//model.addAttribute("MSG",AccountName);
				sms.updateStatus(s2,AccountName);
		        return "businessMange";
	    	}
	    } 
		model.addAttribute("MSG","�˺Ż��������");
 		return "SellerLogin";
	}
	
	@RequestMapping("/SellerLogout.do")
	public String SellerLogoutController(HttpServletRequest request) throws Exception{
		
		String s1 = "δ��½";
        String s2 = (String)request.getSession().getAttribute("CurrentUser");
		sms.updateStatus(s1,s2);
		request.getSession().removeAttribute("CurrentUser"); 
		return "index";
	}
	
	@RequestMapping("/IntoSellerProduct.do")
	public String IntoSellerProductController(HttpServletRequest request,Model model) {
		
		model.addAttribute("SellerName",(String)request.getSession().getAttribute("CurrentUser"));
		return "SellerProduct";
	}
	
	@RequestMapping("/SellerProduct.do")
	public String SellerProductController(String SellerName,String ProductName,String ProductIntroduce,Float ProductPrice,@RequestParam(required = false) CommonsMultipartFile file,HttpServletRequest request,Model model) throws Exception{
		
		if(file.getSize() > 0){
			 //�ļ������·�������·����
			 String relativePath = "img/productpicture";
			 //��ȡ�ļ���Ӳ���ϵ���ʵ·��������·����
			 String path = request.getSession().getServletContext().getRealPath(relativePath);
			 //path = "D:/Program Files (x86)/WorkSpace/SpringMVCDemo/WebContent/img/productpicture";
			 //����FileUtil�����ļ��������ر������ļ������ļ�����ʱ���������ɵ�Ψһ�ַ����滻�ļ�������ֹ���������⣩
			 String newFileName = FileUtil.uploadFile(file, path);
			 System.out.println(path+newFileName);
			 if(newFileName.startsWith("error")){
			    	     
			    	model.addAttribute("MSG","��Ʒ��Ϣ�ύʧ�ܣ�");
			        return "businessMange";     
			 }
			 else{
				    //���ļ��������Ϣ���õ�user��ϸ��Ϣ����
				    String s1 = relativePath+"/"+newFileName;
				    sms.SellerProduct(SellerName,ProductName,ProductIntroduce,ProductPrice,s1);
				    model.addAttribute("MSG","��Ʒ��Ϣ�ύ�ɹ���");
				    return "businessMange";
			      }
		}
		return "businessMange";	
	}
	
	@RequestMapping("/IntoSellerVip.do")
	public String IntoSellerVipController(HttpServletRequest request,Model model) {
		
		String s1 = (String)request.getSession().getAttribute("CurrentUser");
		model.addAttribute("SellerName",s1);
		return "SellerVip";
	}
	
	@RequestMapping("/SellerVip.do")
	public String SellerVipController(Integer VipCardNumber,String SellerName,String IdCardNumber,String VipName,String VipSex,String VipPhone,String VipAddress,String VipEmail,HttpServletRequest request,Model model) throws Exception{
		
		String s1 = (String)request.getSession().getAttribute("CurrentUser");
		sms.SellerVip(VipCardNumber,s1,IdCardNumber,VipName,VipSex,VipPhone,VipAddress,VipEmail);
		model.addAttribute("MSG","��Ա��Ϣ�ύ�ɹ���");
		return "businessMange";
	}
	
	@RequestMapping("/IntoVipRegister.do")
	public String IntoVipRegisterController(HttpServletRequest request,Model model) throws Exception {
		
		//List<String> Name = sms.QueryVipName();
		//model.addAttribute("Name",Name);
		return "VipRegister";
	}
	
	@RequestMapping("/VipRegister.do")
	public String VipRegisterController(String AccountType,String AccountName,String AccountPassword,String AccountPassword2,HttpServletRequest request,Model model) throws Exception{
		
		sms.VipRegister(AccountType,AccountName,AccountPassword,AccountPassword2);
		model.addAttribute("MSG","��Աע��ɹ���");
		return "businessMange";
	}
		
	@RequestMapping("/IntoSellerInfoMaintain.do")
	public String IntoSellerInfoMaintainController(HttpServletRequest request,Model model) throws Exception{
		
		SellerBasicInfo sellerBasicInfo = null;
		sellerBasicInfo = sms.QuerySellerInfo((String)request.getSession().getAttribute("CurrentUser"));
		model.addAttribute("SellerBasicInfo",sellerBasicInfo);
		return "SellerInfoMaintain";
	}
	
	@RequestMapping("/SellerInfoMaintain.do")
	public String SellerInfoMaintainController(String SellerTrade,String SellerAddress,String SellerStar,String SellerIntroduce,String SellerProvince,String SellerCity,String SellerPhone,String SellerEmail,float ConsumeIntegralPercent,float SellerVipDiscountPercent,HttpServletRequest request,Model model) throws Exception{
		
		String SellerName = (String)request.getSession().getAttribute("CurrentUser");
		sms.UpdateSellerInfo(SellerName,SellerTrade,SellerAddress,SellerStar,SellerIntroduce,SellerProvince,SellerCity,SellerPhone,SellerEmail,ConsumeIntegralPercent,SellerVipDiscountPercent);
		//model.addAttribute("MSG","���³ɹ���");
		return "SucceedE";	
	}
	
	@RequestMapping("/VerifyName.do")
	public void VerifyNameController(String VipName,HttpServletResponse response) throws Exception {
		
		PrintWriter out = response.getWriter();
		if(sms.VerifyName(VipName) != null) {
			out.write("exist");
		} else {
			out.write("notexist");
		}
	}
	
	@RequestMapping("/IntoVipRechargeManage.do")
	public String IntoVipRechargeManageController(HttpServletRequest request,Model model) {
		
		model.addAttribute("SellerName",(String)request.getSession().getAttribute("CurrentUser"));
		return "VipRechargeManage";
	}
	
	@RequestMapping("/IntoVipRechargeFillIn.do")
	public String IntoVipRechargeFillInController(String VipName,HttpServletRequest request,Model model) throws Exception{
		
		String s1 = VipName;
		String s2 = (String)request.getSession().getAttribute("CurrentUser");
		VipBasicInfo vipBasicInfo=null;
		vipBasicInfo=sms.QueryVipBasicInfo(s2,s1);
		VipConsumeInfo vipConsumeInfo=null;
		vipConsumeInfo=sms.QueryVipCardBalance(s2,s1);
		if(vipBasicInfo!=null) {
		     if(vipConsumeInfo!=null) {
			       model.addAttribute("VipConsumeInfo",vipConsumeInfo);
			       model.addAttribute("SellerName",(String)request.getSession().getAttribute("CurrentUser"));
			       return "VipRechargeManage";
		     }
		     else{
			       sms.InsertVipConsumeInfo(s2,s1);
			       VipConsumeInfo vipConsumeInfo2=sms.QueryVipCardBalance(s2,s1);
			       model.addAttribute("VipConsumeInfo",vipConsumeInfo2);
			       model.addAttribute("SellerName",(String)request.getSession().getAttribute("CurrentUser"));
			       return "VipRechargeManage";
		     }
		 }
		 model.addAttribute("MSG","�û�Ա���Ǳ��̼һ�Ա�����ܳ�ֵ��");
		 return "businessMange";
	}
	
	@RequestMapping("/VipRecharge.do")
	public String VipRechargeController(float RechargeMoney,String VipName,HttpServletRequest request,Model model) throws Exception{
		
		float s1 = RechargeMoney;
		sms.UpdateBalanceInfo(s1,VipName);
		model.addAttribute("MSG","�ɹ���ֵ��");
		return "businessMange";
	}
	
	@RequestMapping("/IntobusinessManage.do")
	public String IntobusinessManageController() throws Exception{
				
		return "businessMange";
	}
	
	@RequestMapping("/IntoVipConsumeManage.do")
	public String IntoVipConsumeManageController(HttpServletRequest request,Model model) throws Exception{
		
		model.addAttribute("SellerName",(String)request.getSession().getAttribute("CurrentUser"));
		return "VipConsumeManage";
	}
	
	@RequestMapping("/IntoConsumeFillIn.do")
	public String IntoConsumeFillInController(String VipName,HttpServletRequest request,Model model) throws Exception{
		
		String s1 = (String)request.getSession().getAttribute("CurrentUser");
		VipConsumeInfo vipConsumeInfo=null;
		vipConsumeInfo=sms.QueryVipCardBalance(s1,VipName);
		if(vipConsumeInfo!=null) {
			model.addAttribute("VipConsumeInfo",vipConsumeInfo);
			model.addAttribute("SellerName",s1);
			return "VipConsumeManage";
		}
		model.addAttribute("MSG","�û�Աû�й���ֵ��ʷ���Ǳ��̼һ�Ա���������ѣ�");
		return "businessMange";
	}
	
	@RequestMapping("/VipConsumeManage.do")
	public String VipConsumeManageController(float ConsumeMoney,float AvailableIntegral,String VipName,HttpServletRequest request,Model model) throws Exception{
		
		float s1 = ConsumeMoney;
		float s2 = AvailableIntegral;
		sms.UpdateVipConsumeInfo(s1,s2,VipName);
		model.addAttribute("MSG","�ɹ����ѣ�");
		return "businessMange";
	}
	
	@RequestMapping("/IntoVipConsumeIntegralManage.do")
	public String IntoVipConsumeIntegralManageController(HttpServletRequest request,Model model) {
		
		model.addAttribute("SellerName",(String)request.getSession().getAttribute("CurrentUser"));
		return "VipConsumeIntegralManage";
	}
	
	@RequestMapping("/IntoConsumeIntegralFillIn.do")
	public String IntoConsumeIntegralFillIn(String VipName,HttpServletRequest request,Model model) throws Exception{
		
		String s1 = (String)request.getSession().getAttribute("CurrentUser");
		VipConsumeInfo vipConsumeInfo=null;
		vipConsumeInfo=sms.QueryVipCardBalance(s1,VipName);
		if(vipConsumeInfo!=null) {
			model.addAttribute("VipConsumeInfo",vipConsumeInfo);
			model.addAttribute("SellerName",s1);
			return "VipConsumeIntegralManage";
		}
		model.addAttribute("MSG","�û�Աû�й���ֵ��ʷ���Ǳ��̼һ�Ա���������ѣ�");
		return "businessMange";
	}
	
	@RequestMapping("/VipConsumeIntegralManage.do")
	public String VipConsumeIntegralManageController(float ConsumptionIntegral,String VipName,HttpServletRequest request,Model model) throws Exception{
		
		float s1 = ConsumptionIntegral;
		sms.UpdateIntegralInfo(s1,VipName);
		model.addAttribute("MSG","�������ѳɹ���");
		return "businessMange";
	}
}







