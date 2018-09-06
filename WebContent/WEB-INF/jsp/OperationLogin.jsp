 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <title>云尚运维登录界面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="云尚刷卡积分管理系统运维登录界面">
	<meta http-equiv="description" content="云尚刷卡积分管理系统运维登录界面">
	<meta name="author"  content="第二小组">
	<link rel="shortcut icon" href="images/title.ico"/>
	<link rel="stylesheet" type="text/css" href="css/base.css">
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <style>
	.addContent{height:30px;font-size:24px;line-height:30px;}
	</style>
  </head>
  <body>
   <div class="ban nav">
      <div class="logo">
        <img src="images/logo.jpg" alt="logo图片"/>
      </div>
      <div style="float:right;position:relative;top:20px;left:-45px;"><img src="images/smallMan.jpg" alt="小人" style="width:20px;"/>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="IntoIndexA.do">返回</a></div>
      <div class="content addContent">云&nbsp;&nbsp;尚&nbsp;&nbsp;刷&nbsp;&nbsp;卡&nbsp;&nbsp;积&nbsp;&nbsp;分&nbsp;&nbsp;管&nbsp;&nbsp;理&nbsp;&nbsp;系&nbsp;&nbsp;统&nbsp;&nbsp;运&nbsp;&nbsp;维&nbsp;&nbsp;登&nbsp;&nbsp;录</div>
   </div>
   <div class="contain ban">
      <div class="addContain">
         <div class="line"><span style="color:#0099cc;">欢迎管理员登录</span></div>
         <div class="main" style="overflow:hidden;">
           <div class="imgs"><img src="images/deng.jpg" style="height:100%;width:100%;"/></div>
           <div class="login addlogin">
               <form action="OperationLogin.do" method="post">
                <p style="width:100%;" class="bluey">欢迎运维登录</p>  
                <p><label for="acc">账户：</label> <input type="text" name="AccountName" class="in" id="acc"/></p>
                <p><label for="pas">密码：</label> <input type="text" name="AccountPassword" class="in" id="pas"/></p>
                <p><input type="submit" class="bluey" value="登录" style="font-family:'Microsoft YaHei';font-size:14px; margin-right:30px;width:100%;"/></p>
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