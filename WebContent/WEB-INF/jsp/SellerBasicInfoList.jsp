<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>云尚商家管理</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="商家信息查询">
	<meta http-equiv="description" content="商家信息查询">
	<meta name="author"  content="第二小组">
	<link rel="shortcut icon" href="images/title.ico"/>
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/leftright.css">
	<style>
	   html{height:100%;}
	   .info{color:#003;text-align:left;padding:20px 150px 20px 150px;font-size:16px;line-height:1.5em;border-bottom:1px solid #cccccc;vertical-align:top;}
	   .info span{display:inline-block;margin-left:1em;width:270px;word-wrap:break-word;vertical-align:top;color:#666;}
	   .t{position:relative;left:0;top:1em;}
	   .in{border:1px solid black;height:24px;line-height:24px;text-align:center;}
	   .sub{border:1px solid black;background:#41c7db;height:26px;line-height:24px;}
	   .addContent{height:30px;font-size:24px;line-height:30px;}
	</style>
</head>
<body style="height:100%;background-image:url(images/bg.jpg);background-attachment:fixed;">
    <div class="ban nav">
      <div class="logo">
        <img src="images/logo.jpg" alt="logo图片"/>
      </div>
      <div style="float:right;position:relative;top:20px;left:-45px;"><img src="images/smallMan.jpg" alt="小人" style="width:20px;"/>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="IntoomMange.do">返回</a></div>
      <div class="content addContent">云&nbsp;&nbsp;尚&nbsp;&nbsp;商&nbsp;&nbsp;家&nbsp;&nbsp;管&nbsp;&nbsp;理</div>
   </div>
   <div class="contain ban" style="overflow:hidden;">
      <div class="sidebar">
        <div><img src="images/ad.jpg" alt="分类"/><span>&nbsp;&nbsp;&nbsp;&nbsp;选择功能：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></div>
        <div><ul>
          <li style="background:#41c7db;margin-top:20px;">功能</li><li><a href="#perfect">商家信息查询</a></li>
        </ul></div>
        <div><img src="images/zhuzi.jpg" style="width:155px;height:300px;"/></div>
      </div>
      <div class="bigbox" style="margin-bottom:20px;">
        <div class="bigtitle">商家信息概览</div>
        <div class="smallbox" style="border-top:1px solid #cccccc;">
          <div class="smalltitle" id="perfect"></div>
          <c:forEach items="${page.objList}" var="sellerbasicinfo" >
           <div class="info">
             <p>商家名称&nbsp;:<span><c:out value="${sellerbasicinfo.sellerName}"/></span></p>
             <p>商&nbsp;&nbsp;家&nbsp;&nbsp;ID&nbsp;:<span><c:out value="${sellerbasicinfo.sellerId}"/></span></p>
     
           </div>	
          </c:forEach>
          <div class="info">
              <form class="t"  action="SearchSellerBasicInfo.do" method="post">
                 请输入商家ID&nbsp;:&nbsp;&nbsp;<input type="text" name="id" class="in"/>&nbsp;&nbsp;&nbsp;<input type="submit" value="查询" class="sub"/>
              </form>
              <br>
          </div>
        </div>
      </div>
   </div>


</body>
</html>