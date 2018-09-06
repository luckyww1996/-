<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>
<html>
  <head>
    <title>云尚商家会员注册管理</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="云尚刷卡积分管理系统会员注册管理">
	<meta http-equiv="description" content="云尚刷卡积分管理系统会员注册管理">
	<meta name="author"  content="第二小组">
	<link rel="shortcut icon" href="images/title.ico"/>
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/login.css"> 
	<style>
	  form p{margin-bottom:11px;}
	  .c{text-align:center;}
	  .addContent{height:30px;font-size:24px;line-height:30px;}
	</style>
	  <script src="js/jquery.js"></script>
  </head>
  
  <body>
   <div class="ban nav">
      <div class="logo">
        <img src="images/logo.jpg" alt="logo图片"/>
      </div>
      <div style="float:right;position:relative;top:20px;left:-45px;"><img src="images/smallMan.jpg" alt="小人" style="width:20px;"/>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="IntobusinessManage.do">返回</a></div>
      <div class="content addContent">云&nbsp;&nbsp;尚&nbsp;&nbsp;刷&nbsp;&nbsp;卡&nbsp;&nbsp;积&nbsp;&nbsp;分&nbsp;&nbsp;管&nbsp;&nbsp;理&nbsp;&nbsp;系&nbsp;&nbsp;统&nbsp;&nbsp;会&nbsp;&nbsp;员&nbsp;&nbsp;注&nbsp;&nbsp;册</div>
   </div>
   <div class="contain ban">
      <div class="addContain">
         <div class="line"><span style="color:#0099cc;">欢迎注册商家会员</span></div>
         <div class="main" style="overflow:hidden;">
           <div class="imgs"><img src="images/deng.jpg" style="height:100%;width:100%;"/></div>
           <div class="login addlogin" style="padding:30px 50px;">
              <form onsubmit="return checkpas()" action="VipRegister.do" method="post">
                <p style="width:100%;" class="bluey">欢迎注册商家会员</p>  
                <p><label for="typ">类型：</label> <input type="text" class="in c" id="typ" name="AccountType"/></p>
                <p><label for="acc">帐户：</label> <input type="text" class="in c" id="acc" name="AccountName" onblur="check()"/></p>
                <p><label for="pas1">密码：</label> <input type="text" class="in c" id="pas1" name="AccountPassword"/></p>
                <p><label for="pas2">密码：</label> <input type="text" class="in c" id="pas2" placeholder="请再次输入密码" name="AccountPassword2"/></p>
                <p style="font-size:10px;vertical-align:middle;"><input type="checkbox" style="vertical-align:middle;color:#cccccc;" id="item" checked/><label for="item">&nbsp;&nbsp;&nbsp;我已同意《云尚条约》</label></p>
                <p style="text-align:center;"><input type="submit" class="bluey" value="注册" style="width:100%;font-family:'Microsoft YaHei';font-size:14px;"/></p>
             </form>
           </div>
         </div>
      </div>
   </div>
   <!--
   <c:forEach items="${Name }" var="n">
   		${n}
   </c:forEach>
   -->
  </body>

  <script type="text/javascript">
	function check(){
		var name = document.getElementById("acc").value;	
		//var name = $("#acc").val();
		if(name!=null && name!=""){
			$.ajax({
					url:"VerifyName.do",
					type:"post",
					dataType:"text",
					data:{
						"VipName":name
					},
					success:function(responseText){
						if(responseText==="exist"){
							alert("帐户名已存在！");
							$("#acc").val("");
						}else{
							
						}
						
					},
					error:function(){
						alert("system error");
					}
				});
		}
	}
</script>
  
  <script type="text/javascript">
    window.onload=function(){
	   //插入会员类型
	    var typ=document.getElementById("typ");
	    typ.value="会员";
	}
  
  //表单验证
	function checkpas(){
		var pas1=document.getElementById("pas1");
		var pas2=document.getElementById("pas2");
		var acc=document.getElementById("acc");
		var item=document.getElementById("item");
		//密码验证
        if(pas1.value!=pas2.value){
            alert("两次密码不同，请重新输入");
            pas1.value="";
            pas2.value="";
            return false;
        }
		//不能为空验证
		if(pas1.value==""||pas2.value==""||acc.value==""){
			alert("信息不能为空");
			return false;
		}
		//条约
		if(item.checked==false){
			alert("请同意条约");
			return false;
		}
	}
  </script>
</html>

