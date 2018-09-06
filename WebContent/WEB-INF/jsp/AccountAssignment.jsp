<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

               
<!DOCTYPE HTML>
<html>
  <head>
    <title>云尚商家账户分配</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="云尚刷卡积分管理系统商家账户分配">
	<meta http-equiv="description" content="云尚刷卡积分管理系统商家账户分配">
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
      <div style="float:right;position:relative;top:20px;left:-45px;"><img src="images/smallMan.jpg" alt="小人" style="width:20px;"/>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="ApplyInfoQuery.do">返回</a></div>
      <div class="content addContent">商&nbsp;&nbsp;家&nbsp;&nbsp;帐&nbsp;&nbsp;户&nbsp;&nbsp;分&nbsp;&nbsp;配</div>
   </div>
   <div class="contain ban" style="overflow:hidden;">
      <div class="sidebar">
        <div><img src="images/ad.jpg" alt="分类"/><span>&nbsp;&nbsp;&nbsp;&nbsp;选择功能：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></div>
        <div><ul>
          <li style="background:#41c7db;margin-top:20px;">功能</li><li><a href="#perfect">商家账户分配</a></li>
        </ul></div>
        <div><img src="images/zhuzi.jpg" style="width:155px;height:300px;"/></div>
      </div>
      <div class="bigbox">
        <div class="bigtitle">商家账户分配</div>
        <div class="smallbox" style="border-top:1px solid #cccccc;">
          <div class="smalltitle" id="perfect">商家账户填写</div>
           <div>
             <form action="AccountAssignment.do" method="post">
               <ul>
                <li style="margin-top:40px;"><span>商家名称</span><input class="inputtest" name="ApplySellerName" value="${ApplySellerName}"/></li>
                <li><input class="inputtest" type="hidden" value="${result}" name="result"/></li>
                <li><span>账户名字</span><input class="inputtest" name="AccountName" value="${AccountName}"/></li>
                <li><span>账户密码</span><input class="inputtest" name="AccountPassword" value="${AccountPassword}"/></li>
                <li ><input type="submit" class="inputbut " value="提交"/></li>
               </ul>
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




