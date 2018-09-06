<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>云尚网站展示平台</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="云尚网站展示平台">
	<meta http-equiv="description" content="云尚网站展示平台">
	<meta name="author"  content="第二小组">
	<link rel="shortcut icon" href="images/title.ico"/>
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/leftright.css">
	<style>
	   html{height:100%;}
	   .info{color:#003;text-align:left;padding:20px 150px 20px 150px;font-size:16px;line-height:1.5em;border-bottom:1px solid #cccccc;vertical-align:top;}
	   .info span{display:inline-block;margin-left:1em;width:270px;word-wrap:break-word;vertical-align:top;color:#666;}
	   .inputtest{background:#fff;border:1px solid #ff9900;height:1.7em;line-height:1.5em;width:150px;vertical-align:middle;text-align:center;}
       .inputbut{background:#fff;font-family:'Microsoft YaHei';font-size:14px;border:1px solid #ff9900;border-radius:5px;width:50px;height:2em;line-height:2em;}
	   .addContent{height:30px;font-size:24px;line-height:30px;}
	   form{font-size:14px;}
	   form ul li{margin:15px 50px 15px 50px;}
	   form ul li span{display:inline-block;}
	   form ul li span:first-child{display:inline-block;width:70px;}
	   form input{height:24px;line-height:24px;vertical-align:middle;margin-left:20px;}
	   form input:nth-child(2){margin-left:0px;}
	   form input:nth-child(4){background:#41c7db;border:1px solid #cccccc;width:40px;height:20px;line-height:20px;border-radius:5px;font-family:'Microsoft YaHei';font-size:14px;}
	   .picture{width:250px;hight:250px;}
	</style>
</head>
<body style="height:100%;background-image:url(images/bg.jpg);background-attachment:fixed;">
    <div class="ban nav">
      <div class="logo">
        <img src="images/logo.jpg" alt="logo图片"/>
      </div>
      <div style="float:right;position:relative;top:20px;left:-45px;"><img src="images/smallMan.jpg" alt="小人" style="width:20px;"/>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="javascript:history.back(-1)">返回</a></div>
      <div class="content addContent">云&nbsp;&nbsp;尚&nbsp;&nbsp;网&nbsp;&nbsp;站&nbsp;&nbsp;展&nbsp;&nbsp;示&nbsp;&nbsp;平&nbsp;&nbsp;台</div>
   </div>
   <div class="contain ban" style="overflow:hidden;">
      <div class="sidebar">
        <div><img src="images/ad.jpg" alt="分类"/><span>&nbsp;&nbsp;&nbsp;&nbsp;选择功能：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></div>
        <div><ul>
          <li style="background:#41c7db;margin-top:20px;">功能</li><li><a href="#perfect">商家产品信息展示</a></li>
        </ul></div>
        <div><img src="images/zhuzi.jpg" style="width:155px;height:300px;"/></div>
      </div>
      <div class="bigbox" style="margin-bottom:20px;">
        <div class="bigtitle">网站展示平台</div>
          <div class="smallbox" style="border-top:1px solid #cccccc;">
          <div class="smalltitle" id="perfect">产品所属商家</div>
          <div class="info">
             <p>商家名称:<span><c:out value="${SellerName}"/></span></p>
          </div>
          <div class="smalltitle" id="perfect">产品信息</div>
          <c:forEach items="${productDataInfoList}" var="productDataInfo">
           <div class="info">
             <p>产品名称:<span><c:out value="${productDataInfo.productName}"/></span></p>
             <p>产品介绍:<span><c:out value="${productDataInfo.productIntroduce}"/></span></p>
             <p>产品价格:<span><c:out value="${productDataInfo.productPrice}"/></span></p>
             <p>产品图片:</p>
             <div><img class="picture" src="${productDataInfo.productPicture}"/></div>
           </div>	
          </c:forEach>
        </div>
      </div>
     </div>
</body>
</html>




