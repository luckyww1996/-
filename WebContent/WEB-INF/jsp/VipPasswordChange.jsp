<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <title>云尚个人账户管理</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="云尚刷卡积分管理系统个人账户管理">
	<meta http-equiv="description" content="云尚刷卡积分管理系统个人账户管理">
	<meta name="author"  content="第二小组">
	<link rel="shortcut icon" href="images/title.ico"/>
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/leftright.css">
	<style>
	  html{height:100%;}
	  form{font-size:15px;}
	  form p{margin:20px 50px 20px 50px;text-align:center;}
	  label{display:inline-block;width:60px;text-align:center;}
	  .inputtest{border:1px solid #ff9900;height:1.7em;line-height:1.5em;text-align:center;}
	  .inputbut{background:#fff;font-family:'Microsoft YaHei';font-size:14px;border:1px solid #ff9900;border-radius:5px;width:50px;height:2em;line-height:2em;vertical-align:middle;}
	  .addContent{height:30px;font-size:24px;line-height:30px;}
	</style>
  </head>
  
  <body style="background-image:url(images/bg.jpg);height:100%;">
   <div class="ban nav">
      <div class="logo">
        <img src="images/logo.jpg" alt="logo图片"/>
      </div>
      <div style="float:right;position:relative;top:20px;left:-45px;"><img src="images/smallMan.jpg" alt="小人" style="width:20px;"/>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="IntoVipManage.do">返回</a></div>
      <div class="content addContent">云&nbsp;&nbsp;尚&nbsp;&nbsp;个&nbsp;&nbsp;人&nbsp;&nbsp;账&nbsp;&nbsp;户&nbsp;&nbsp;管&nbsp;&nbsp;理</div>
   </div>
   <div class="contain ban" style="overflow:hidden;">
      <div class="sidebar">
        <div><img src="images/ad.jpg" alt="分类"/><span>&nbsp;&nbsp;&nbsp;&nbsp;选择功能：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></div>
        <div><ul>
          <li style="background:#41c7db;margin-top:20px;">功能</li><li><a href="#psw">修改密码</a></li>
        </ul></div>
        <div><img src="images/zhuzi.jpg" style="width:155px;height:300px;"/></div>
      </div>
      <div class="bigbox" style="margin-top:105px;">
        <div class="smallbox">
          <div class="smalltitle" id="psw">修改密码</div>
          <div>
             <form action="VipPasswordChange.do" method="post">
                <p style="margin-top:40px;"><label for="acc">会员账户</label> <input type="text" name="AccountName" value="${CurrentUser}" class="inputtest" id="acc" disabled style="background:#fff;"/></p>
                <p><label for="pas1">原密码</label> <input type="text" name="AccountPassword1" class="inputtest" id="pas1"/></p>
                <p><label for="pas2">新密码</label> <input type="text" name="AccountPassword2" class="inputtest" id="pas2"/></p>
                <p><label for="pas3">确认密码</label> <input type="text" name="AccountPassword3" class="inputtest" id="pas3" placeholder="请再次输入新密码"/></p>
                <p ><input type="submit" class="inputbut " value="修改"/></p>
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
