<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <title>云尚商家产品管理</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="云尚刷卡积分管理系统商家产品管理">
	<meta http-equiv="description" content="云尚刷卡积分管理商家产品管理">
	<meta name="author"  content="第二小组">
	<link rel="shortcut icon" href="images/title.ico"/>
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/leftright.css">
	<style>
	  html{height:100%;}
	  form{font-size:15px;}
	  form p{margin:20px 50px 20px 50px;text-align:center;}
	  label{display:inline-block;width:60px;text-align:center;}
	  .inputtest{border:1px solid #ff9900;height:1.7em;line-height:1.5em;width:300px;}
	  .inputbut{background:#fff;font-family:'Microsoft YaHei';font-size:14px;border:1px solid #ff9900;border-radius:5px;width:50px;height:2em;line-height:2em;vertical-align:middle;}
	  .addContent{height:30px;font-size:24px;line-height:30px;}
	</style>
  </head>
  <body style="background-image:url(images/bg.jpg);height:100%;">
   <div class="ban nav">
      <div class="logo">
        <img src="images/logo.jpg" alt="logo图片"/>
      </div>
      <div style="float:right;position:relative;top:20px;left:-45px;"><img src="images/smallMan.jpg" alt="小人" style="width:20px;"/>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="IntobusinessManage.do">返回</a></div>
      <div class="content addContent">云&nbsp;&nbsp;尚&nbsp;&nbsp;商&nbsp;&nbsp;家&nbsp;&nbsp;信&nbsp;&nbsp;息&nbsp;&nbsp;维&nbsp;&nbsp;护</div>
   </div>
   <div class="contain ban" style="overflow:hidden;">
      <div class="sidebar">
        <div><img src="images/ad.jpg" alt="分类"/><span>&nbsp;&nbsp;&nbsp;&nbsp;选择功能：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></div>
        <div><ul>
          <li style="background:#41c7db;margin-top:20px;">功能</li><li><a href="#shangjia">商家信息维护</a></li>
        </ul></div>
        <div><img src="images/zhuzi.jpg" style="width:155px;height:300px;"/></div>
      </div>
      <div class="bigbox">
        <div class="bigtitle">商家信息维护</div>
        <div class="smallbox" style="border-top:1px solid #cccccc;">
          <div class="smalltitle" id="shangjia">商家信息维护</div>
          <div>
             <form action="SellerInfoMaintain.do" method="post">
                <p style="margin-top:40px;"><label for="nam">商家名称</label> <input type="text" class="inputtest" id="nam" name="SellerName" value="${SellerBasicInfo.sellerName}" disabled/></p>
                <p><label for="Trade">商家行业</label> <input type="text" class="inputtest" id="Trade" name="SellerTrade" value="${SellerBasicInfo.sellerTrade}"/></p>
                <p><label for="Address">商家地址</label> <input type="text" class="inputtest" id="Address" name="SellerAddress" value="${SellerBasicInfo.sellerAddress}"/></p>
                <p><label for="Star">商家星级</label> <input type="text" class="inputtest" id="Star" name="SellerStar" value="${SellerBasicInfo.sellerStar}"/></p>
                <p><label for="Introduce">商家介绍</label> <input type="text" class="inputtest" id="Introduce" name="SellerIntroduce" value="${SellerBasicInfo.sellerIntroduce}"/></p>
                <p><label for="Province">商家省份</label> <input type="text" class="inputtest" id="Province" name="SellerProvince" value="${SellerBasicInfo.sellerProvince}"/></p>
                <p><label for="City">商家城市</label> <input type="text" class="inputtest" id="City" name="SellerCity" value="${SellerBasicInfo.sellerCity}"/></p>
                <p><label for="Phone">商家电话</label> <input type="text" class="inputtest" id="Phone" name="SellerPhone" value="${SellerBasicInfo.sellerPhone}"/></p>
                <p><label for="Email">商家邮箱</label> <input type="text" class="inputtest" id="Email" name="SellerEmail" value="${SellerBasicInfo.sellerEmail}"/></p>
                <p><label for="Integral">消费积分比例</label> <input type="text" class="inputtest" id="Integral" name="ConsumeIntegralPercent" value="${SellerBasicInfo.consumeIntegralPercent}"/></p>
                <p><label for="Discount">会员折扣比例</label> <input type="text" class="inputtest" id="Discount" name="SellerVipDiscountPercent" value="${SellerBasicInfo.sellerVipDiscountPercent}"/></p>
                <p ><input type="submit" class="inputbut " value="提交"/></p>
             </form>
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
