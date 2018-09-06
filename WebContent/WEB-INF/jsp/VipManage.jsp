<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <title>云尚会员管理平台</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="云尚刷卡积分管理系统会员管理平台">
	<meta http-equiv="description" content="云尚刷卡积分管理系统会员管理平台">
	<meta name="author"  content="第二小组">
	<link rel="shortcut icon" href="images/title.ico"/>
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<style>
	  .addContent{height:30px;font-size:24px;line-height:30px;}
	  .addContain{padding:0 15px 0 15px;} 
	  .line{border-bottom:2px solid #cccccc;padding:10px 0px 30px 70px;text-align:left;font-size:20px;}
	  .image{padding:20px 20px 0 20px;}
	  .bigbox{overflow:hidden;padding:50px;}
	  .smallbox{float:left;width:300px;height:250px;border:1px solid black;margin-right:124px;margin-bottom:40px;}
	  .smallbox:nth-child(3n){margin-right:0px;}
	  .smallbox img{width:300px;height:200px;}
	  .smallbox p{height:50px;line-height:50px;text-align:center;}
	  .smallbox p a{color:#666666;font-size:20px;}
	</style>
  </head>
  <body>
   <div class="ban nav">
      <div class="logo">
        <img src="images/logo.jpg" alt="logo图片"/>
      </div>
      <div style="float:right;position:relative;top:20px;left:-45px;"><img src="images/smallMan.jpg" alt="小人" style="width:20px;"/>&nbsp;&nbsp;|&nbsp;&nbsp;<a href=VipLogout.do>退出</a></div>
      <div class="content addContent">云&nbsp;&nbsp;尚&nbsp;&nbsp;会&nbsp;&nbsp;员&nbsp;&nbsp;管&nbsp;&nbsp;理&nbsp;&nbsp;平&nbsp;&nbsp;台</div>
   </div>
   <div class="contain ban">
      <div class="addContain">
         <div class="line">欢迎进入云尚刷卡积分管理系统会员管理平台</div>
         <div class="image"><img src="images/welcome.jpg" style="width:100%"/></div>
         <div class="bigbox">
           <div class="smallbox">
             <label for="hui2"><img src="images/hui2.jpg"/></label>
             <p><a href="IntoVipAccountManage.do" id="hui2">个人账户管理</a></p>
           </div>
           <!-- <div class="smallbox">
             <label for="hui3"><img src="images/hui3.jpg"/></label>
             <p><a href="IntoIntegralGueryExchange.do" id="hui3">积分查询兑换</a></p>
           </div> -->
           <div class="smallbox">
             <label for="hui5"><img src="images/hui5.jpg"/></label>
             <p><a href="IntoVipPasswordChange.do" id="hui5">密码修改</a></p>
           </div>
           <div class="smallbox">
             <label for="hui4"><img src="images/hui4.jpg"/></label>
             <p><a href="IntoVipCardBalanceQuery.do" id="hui4">会员卡余额查询</a></p>
           </div>
           <div class="smallbox">
             <label for="hui6"><img src="images/hui6.jpg"/></label>
             <p><a href="#" id="hui6">需求登记</a></p>
           </div>
         </div>
      </div>
   </div>
   <div class="footer">
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
