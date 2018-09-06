<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

               
<!DOCTYPE HTML>
<html>
  <head>
    <title>商家资料管理</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="云尚刷卡积分管理系统商家资料管理">
	<meta http-equiv="description" content="云尚刷卡积分管理系统商家资料管理">
	<meta name="author"  content="第二小组">
	<link rel="shortcut icon" href="images/title.ico"/>
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/leftright.css">
	<style>
	  form{font-size:15px;text-align:left;padding-left:140px;}
	  form ul li{margin:15px 50px 15px 50px;}
	  form ul li span{display:inline-block;}
	  form ul li span:first-child{display:inline-block;width:70px;}
	  label{font-size:12px;color:#666666;}
	  .inputtest{background:#fff;border:1px solid #ff9900;height:1.7em;line-height:1.5em;width:150px;vertical-align:middle;text-align:center;}
	  .inputbut{background:#fff;font-family:'Microsoft YaHei';font-size:14px;border:1px solid #ff9900;border-radius:5px;width:50px;height:2em;line-height:2em;vertical-align:middle;position:relative;left:100px;}
	  .addContent{height:30px;font-size:24px;line-height:30px;}
	</style>
  </head>
  
  <body>
   <div class="ban nav">
      <div class="logo">
        <img src="images/logo.jpg" alt="logo图片"/>
      </div>
      <div style="float:right;position:relative;top:20px;left:-45px;"><img src="images/smallMan.jpg" alt="小人" style="width:20px;"/>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="javascript:history.back(-1)">返回</a></div>
      <div class="content addContent">商&nbsp;&nbsp;家&nbsp;&nbsp;资&nbsp;&nbsp;料&nbsp;&nbsp;管&nbsp;&nbsp;理</div>
   </div>
   <div class="contain ban" style="overflow:hidden;">
      <div class="sidebar">
        <div><img src="images/ad.jpg" alt="分类"/><span>&nbsp;&nbsp;&nbsp;&nbsp;选择功能：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></div>
        <div><ul>
          <li style="background:#41c7db;margin-top:20px;">功能</li><li><a href="#perfect">商家资料维护管理</a></li>
        </ul></div>
        <div><img src="images/zhuzi.jpg" style="width:155px;height:300px;"/></div>
      </div>
      <div class="bigbox">
        <div class="bigtitle">商家资料管理</div>
        <div class="smallbox" style="border-top:1px solid #cccccc;">
          <div class="smalltitle" id="perfect">商家资料维护管理</div>
          <div>
             <form action="UpdateSellerBasicInfo.do" method="post">
               <ul>
                <li style="margin-top:40px;display:none;"><span>商家ID</span><input type="text" class="inputtest" name="SellerId" value="${sellerbasicinfo.sellerId}"/></li>
                <li><span>商家行业</span><input type="text" class="inputtest" name="SellerTrade" value="${sellerbasicinfo.sellerTrade}"/></li>
                <li><span>商家名称</span><input type="text" class="inputtest" name="SellerName" value="${sellerbasicinfo.sellerName}"/></li>
                <li><span>商家地址</span><input type="text" class="inputtest" name="SellerAddress" value="${sellerbasicinfo.sellerAddress}"/></li>
                <li><span>商家星级</span><input type="text" class="inputtest" name="SellerStar" value="${sellerbasicinfo.sellerStar}"/></li>
                <li><span>商家介绍</span><input type="text" class="inputtest" name="SellerIntroduce" value="${sellerbasicinfo.sellerIntroduce}"/></li>
                <li><span>商家省份</span><input type="text" class="inputtest" name="SellerProvince" value="${sellerbasicinfo.sellerProvince}"/></li>
                <li><span>商家城市</span><input type="text" class="inputtest" name="SellerCity" value="${sellerbasicinfo.sellerCity}"/></li>
                <li><span>商家电话</span><input type="text" class="inputtest" name="SellerPhone" value="${sellerbasicinfo.sellerPhone}"/></li>
                <li><span>商家邮箱</span><input type="text" class="inputtest" name="SellerEmail" value="${sellerbasicinfo.sellerEmail}"/></li>
                <li><span>积分比例</span><input type="text" class="inputtest" name="ConsumeIntegralPercent" value="${sellerbasicinfo.consumeIntegralPercent}"/></li>
                <li><span>会员折扣</span><input type="text" class="inputtest" name="SellerVipDiscountPercent" value="${sellerbasicinfo.sellerVipDiscountPercent}"/></li>
                <li ><input type="submit" class="inputbut " value="提交"/></li>
               </ul>
             </form>
           </div>         
          </div>
        </div> 
     </div>
   </div>
  </body>
  
  <script type="text/javascript">
      var msg = "${MSG}";
      if(msg!=null&&msg!="")
          alert(msg);
  </script>
  
</html>