<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <title>云尚刷卡积分管理系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="云尚刷卡积分管理系统">
	<meta http-equiv="description" content="云尚刷卡积分管理系统">
	<meta name="author"  content="第二小组">
	<link rel="shortcut icon" href="images/title.ico"/>
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<style>
	  .content ul.l li{float:left;margin-right:45px;}
	  .content ul.r li{float:right;margin-left:20px;color:#999999;}
	  .search{margin-top:1em;border:1px solid black;height:1.5em;}
	  .sidebar{width:300px;float:left;margin:50px 100px 0 0;}
	  .sidebar ul li{width:160px;height:40px;border:2px solid #cccccc;font-size:16px;text-align:center;line-height:40px;}
	  .ad{width:800px;float:left;margin:50px 0 50px 0;}
	  .ad select{width:200px;height:36px;border:1px solid black;}
	  .ad .adimg{width:100px;padding:50px 0 0 0;}
	</style>
  </head>
  
  <body>
    <div class="ban nav">
      <div class="logo">
        <img src="images/logo.jpg" alt="logo图片"/>
      </div>
      <div class="content">
      <!-- 微调左侧ul，使得左右侧ul水平对齐 -->
      <!-- overflow清除浮动，使得父元素获得高度 -->
        <ul class="l" style="position:relative;top:1em;left:0px;overflow:hidden;">
          <li>首页</li>
          <li>行业中心</li>
          <li>产品概览</li>
          <li><a href="#">商家入驻</a></li>
          <li>会员服务</li>
          <li>商家新闻</li>
          <li>关于我们</li>
        </ul>
        <form>
          <input class="search" type="search" placeholder="站内搜索" style="width:500px;margin-top:2em;border-right:none;border-radius:5px 0px 0px 5px"/><input class="search" type="submit" value="搜索" style="margin-top:2em;color:#666666;border-left:none;border-radius:0px 5px 5px 0px"/>
        </form>
      </div>
    </div>
    <!-- 首页滑动导航栏bug，此处改变图片大小，或者改变nav固定定位的样式 -->
    <div class="contain">
      <img src="images/index.jpg" style="width:100%"/>
      <div class="ban" style="overflow:hidden;">
      <!-- ban未设置border，sidebar、ad的margin-top未使其一起下移 -->
        <div class="sidebar">
          <ul>
           <li style="background:#0099cc;border-top:4px solid #cccccc;">云尚管理中心</li>
           <li><a href="IntoSellerLogin.do">商家管理平台</a></li>
           <li><a href="IntoVipLogin.do">会员管理平台</a></li>
           <li><a href="IntoOperationLogin.do">运维管理平台</a></li>
           <li><a href="IntoWebsiteDisplay.do">网站展示平台</a></li>
           <li><a href="IntoSellerJoin.do">入盟</a></li>
           <li>云尚积分商城</li>
           <li style="border-bottom:border-top:4px solid #cccccc;"><a href="#callus">联系我们</a></li>
          </ul>
        </div>
        <div class="ad">
          <img src="images/ad.jpg" alt="分类"/><span>&nbsp;&nbsp;&nbsp;&nbsp;选择行业：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
          <select name="selectH">
            <option>购</option>
            <option>游</option>
            <option>吃</option>
            <option>住</option>
            <option>行</option>
            <option>娱</option>
          </select>
          <div class="adimg"><img src="images/ad1.jpg"/></div>
        </div>
      </div>
    </div>
    <div class="footer" id="callus">
      <div class="ban">
       <div class="other"><img src="images/phone.jpg"/>咨询热线：400-677-3566</div>
       <div class="other" style="text-align:center;">地址：成都市软件园</div>
       <div class="other" style="margin-right:0px"><img src="images/footad.jpg"/></div>
      </div>
    </div>
  </body>
  
  <script type="text/javascript">
      var msg = "${MSG}";
      if(msg!=null&&msg!="")
          alert(msg);
  </script>
  
</html>
