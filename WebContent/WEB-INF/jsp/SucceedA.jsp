<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html >
 <head>
  <title>成功</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="云尚刷卡积分管理系统信息管理">
	<meta http-equiv="description" content="云尚刷卡积分管理系统信息管理">
	<meta name="author"  content="第二小组">
	<link rel="shortcut icon" href="images/title.ico"/>
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/leftright.css">
  <style>
  body,div{z-index:-2;margin:0px;padding:0px;text-align:center;}
  .bg{box-sizing:border-box;z-index:-1;position: absolute;left: 50%;top: 50%;margin-left: -300px;margin-top: -200px;width:600px;height:400px;padding:40px;background:url(images/sd.jpg) no-repeat 0 0;}
  .in{border:2px solid #41c7db;width:300px;height:40px;text-align:center;}
  .bluey{color:#ffffff;width:70px;background:#41c7db;border:1px solid #ccc;text-align:center;height:2.5em;line-height:2.5em;vertical-align:middle;}
  .line{font-size:38px;text-align:center;}
  </style>
 </head>
 <body>
 <div class="bg">
    <form action="IntoVipAccountManage.do" method="post">
    <div class="line"><input type="text" class="in"style="font-family:'Microsoft YaHei';font-size:18px;background:transparent;" value="个人信息修改成功，请点击返回查看" onfocus="this.blur()"><div> 
    <br/><br/><br/><br/>
    <input type="submit" class="bluey" value="确定" style="font-family:'Microsoft YaHei';font-size:18px;"/></div>
    </div>
    </form>  
  </div>
 </body>
</html>








