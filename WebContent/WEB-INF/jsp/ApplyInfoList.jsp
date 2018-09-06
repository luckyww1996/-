<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>云尚商家入盟申请信息审核</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="商家入盟申请信息审核">
	<meta http-equiv="description" content="商家入盟申请信息审核">
	<meta name="author"  content="第二小组">
	<link rel="shortcut icon" href="images/title.ico"/>
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/leftright.css">
	<style>
	   html{height:100%;}
	   .info{color:#003;text-align:left;padding:20px 150px 20px 150px;font-size:16px;line-height:1.5em;border-bottom:1px solid #cccccc;vertical-align:top;}
	   .info span{display:inline-block;margin-left:1em;width:270px;word-wrap:break-word;vertical-align:top;color:#666;}
	   form{font-size:14px;}
	   form input{height:24px;line-height:24px;vertical-align:middle;margin-left:20px;}
	   form input:nth-child(2){margin-left:0px;}
	   form input:nth-child(4){background:#41c7db;border:1px solid #cccccc;width:40px;height:20px;line-height:20px;border-radius:5px;font-family:'Microsoft YaHei';font-size:14px;}
	   .addContent{height:30px;font-size:24px;line-height:30px;}
	</style>
</head>
<body style="height:100%;background-image:url(images/bg.jpg);background-attachment:fixed;">
    <div class="ban nav">
      <div class="logo">
        <img src="images/logo.jpg" alt="logo图片"/>
      </div>
      <div style="float:right;position:relative;top:20px;left:-45px;"><img src="images/smallMan.jpg" alt="小人" style="width:20px;"/>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="IntoomMange.do">返回</a></div>
      <div class="content addContent">云&nbsp;&nbsp;尚&nbsp;&nbsp;商&nbsp;&nbsp;家&nbsp;&nbsp;入&nbsp;&nbsp;盟&nbsp;&nbsp;信&nbsp;&nbsp;息&nbsp;&nbsp;审&nbsp;&nbsp;核</div>
   </div>
   <div class="contain ban" style="overflow:hidden;">
      <div class="sidebar">
        <div><img src="images/ad.jpg" alt="分类"/><span>&nbsp;&nbsp;&nbsp;&nbsp;选择功能：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></div>
        <div><ul>
          <li style="background:#41c7db;margin-top:20px;">功能</li><li><a href="#perfect">商家入盟信息</a></li>
        </ul></div>
        <div><img src="images/zhuzi.jpg" style="width:155px;height:300px;"/></div>
      </div>
      <div class="bigbox" style="margin-bottom:20px;">
        <div class="bigtitle">商家入盟信息</div>
        <div class="smallbox" style="border-top:1px solid #cccccc;">
          <div class="smalltitle" id="perfect"></div>
          <c:forEach items="${page.objList}" var="applyinfo" >
           <div class="info">
             <p>商家名称:<span><c:out value="${applyinfo.applySellerName}"/></span></p>
             <p>商家行业:<span><c:out value="${applyinfo.applySellerTrade}"/></span></p>
             <p>商家地址:<span><c:out value="${applyinfo.applySellerAddress}"/></span></p>
             <p>商家星级:<span><c:out value="${applyinfo.applySellerStar}"/></span></p>
             <p>商家介绍:<span><c:out value="${applyinfo.applySellerIntroduce}"/></span></p>
             <p>商家省份:<span><c:out value="${applyinfo.applySellerProvince}"/></span></p>
             <p>商家城市:<span><c:out value="${applyinfo.applySellerCity}"/></span></p>
             <p>商家电话:<span><c:out value="${applyinfo.applySellerPhone}"/></span></p>
             <p>商家邮箱:<span><c:out value="${applyinfo.applySellerEmail}"/></span></p>
             <p>兑换比例:<span><c:out value="${applyinfo.applyConsumeIntegralPercent}"/></span></p>
             <p>会员折扣:<span><c:out value="${applyinfo.applyVipDiscountPercent}"/></span></p>
             <p>商家状态:<span><c:out value="${applyinfo.applyStatus}"/></span></p>
        <%-- <td><input type="button" value="未通过" onclick="update_(${applyinfo.applySellerName })"></td>
        <td><input  <input type="button" value="未通过" > onclick="update_(${applyinfo.applySellerName })"></td> --%>
        
             <form action="ApplyInfoQueryShenHe.do" method="post">
         	      <input type="hidden" name="ApplySellerName" value="${applyinfo.applySellerName}">
                  <input type="radio" value="0" name="result">&nbsp;未通过
                  <input type="radio" value="1" name="result">&nbsp;通过
                  <input type="submit" value="提交"/>
     	     </form>
     
           </div>	
          </c:forEach>
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



