<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>审核成功</title>
<style>
  *{margin:0px;padding:0px;}
  html{height:100%;}
  body{height:100%;background-image:url(images/bg.jpg);background-attachment:fixed;}
  div{position:relative;width:400px;height:300px;margin:auto;top:50%;margin-top:-150px;border:1px solid #cccccc;text-align:center;}
  p{margin:50px;}
</style>

</head>

<body>
<div>
      <p> ${MSG}审核成功</p>
      <form action=ShenHeSuccess.do method="post" >
       <p><input type="text" value="${ApplySellerName}" name="ApplySellerName" /> </p>
        <input type="hidden" value="${result}" name="result"/> 
      <p><input type="submit"  value="提交"  id="sub"/></p>
      </form>
      </div>
</body>
<script type="text/javascript">
fun(){
    	var sub=documnet.getElemntById("sub");
    	sub.removeAttribute("disabled");
    	return true;
    }
</script>

</html>
<!-- action="Succeed.do" method="post" -->