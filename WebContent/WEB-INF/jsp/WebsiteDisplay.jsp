<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <title>云尚网站展示平台</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="云尚刷卡积分管理系统网站展示平台">
	<meta http-equiv="description" content="云尚刷卡积分管理系统网站展示平台">
	<meta name="author"  content="第二小组">
	<link rel="shortcut icon" href="images/title.ico"/>
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<style>
	   .addContent{font-size:22px;padding-top:10px;font:bold;}
	   .search{margin-top:10px;border:1px solid black;height:1.5em;}
	   .sidebar{position:fixed;float:left;width:150px;padding:30px 15px 0px 15px;}
	   .sidebar div{margin-bottom:15px;}
	   .sidebar ul li{width:100%;height:40px;border:2px solid #666666;font-size:16px;text-align:center;line-height:40px;}
	   .sidebar ul li a{display:block;}
	   .box{float:left;width:1082px;margin-left:180px;padding:30px 15px 0px 15px;border-left:2px solid #666666;}
	   .box div{margin-bottom:15px;}
	   dl{font-size:16px;line-height:1.5em;}
	   dt{width:85px;text-align:right;}
	   dd.r{position:relative;top:-1.5em;left:90px;}
	   dt.s,dd.s{width:100px;text-align:center;border:1px solid black;margin:0 auto;}
	   .title{border:1px solid black;height:35px;line-height:35px;background:#41c7db;text-align:center;color:#ffffff;}
	   .bigbox{overflow:hidden;}
	   .bigbox .smallbox{width:200px;float:left;margin:30px 60px;padding:20px 20px 0px 20px;box-shadow:0 0 4px rgba(0,0,0,0.1);}
	   .bigbox .smallbox img{width:200px;height:150px;}
	   .bigbox .smallbox p{text-align:center;font-size:15px;line-height:1.5em;}
	   .addContent{height:30px;font-size:24px;line-height:30px;}
	</style>
  </head>
  
  <body>
    <div class="ban nav" style="z-index:2;">
      <div class="logo">
        <img src="images/logo.jpg" alt="logo图片"/>
      </div>
      <div class="content">
         <div style="float:right;position:relative;top:20px;left:-45px;"><img src="images/smallMan.jpg" alt="小人" style="width:20px;"/>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="IntoIndexD.do">返回</a></div>
        <div class="content addContent">网&nbsp;&nbsp;站&nbsp;&nbsp;展&nbsp;&nbsp;示&nbsp;&nbsp;平&nbsp;&nbsp;台</div>
      </div>
    </div>
    <div class="ban contain" style="overflow:hidden;">
      <div class="sidebar">
        <div><img src="images/ad.jpg" alt="分类"/><span>&nbsp;&nbsp;&nbsp;&nbsp;商家查询：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></div>
        <div><ul>
          <li style="background:#41c7db;">功能</li><li><a href="#">商家查询</a></li>
        </ul></div>
        <div><img src="images/map.jpg"/></div>
      </div>
      <div class="box">
        <div><img src="images/ad.jpg" alt="分类"/><span>&nbsp;&nbsp;&nbsp;&nbsp;商家条件筛选：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></div>
        <div>
          <form action="SellerBasicInfoDisplay.do" method="post">
            <dl>
              <dt>类别:</dt>
              <dd class="r">
                <label for="l1"><input type="radio" name="SellerTrade" value="火锅" id="l1" checked/>火锅</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <label for="l2"><input type="radio" name="SellerTrade" value="烧烤" id="l2"/>烧烤</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <label for="l3"><input type="radio" name="SellerTrade" value="KTV" id="l8"/>KTV</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span><br/>
                <label for="l4"><input type="radio" name="SellerTrade" value="酒店" id="l9"/>酒店</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
              </dd>
              <dt>星级:</dt>
              <dd class="r">
                <label for="l1"><input type="radio" name="SellerStar" value="五星" id="l1" checked/>五星</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <label for="l2"><input type="radio" name="SellerStar" value="四星" id="l2"/>四星</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <label for="l3"><input type="radio" name="SellerStar" value="三星" id="l3"/>三星</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <label for="l4"><input type="radio" name="SellerStar" value="二星" id="l4"/>二星</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <label for="l5"><input type="radio" name="SellerStar" value="一星" id="l5"/>一星</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <label for="l6"><input type="radio" name="SellerStar" value="无" id="l6"/>无</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
              </dd>
              <dt>城市:</dt>
              <dd class="r">
                <label for="c1"><input type="radio" name="SellerCity" value="成都市" id="c1" checked/>成都市</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <label for="c2"><input type="radio" name="SellerCity" value="西安市" id="c2"/>西安市</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <label for="c3"><input type="radio" name="SellerCity" value="杭州市" id="c3"/>杭州市</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <label for="c4"><input type="radio" name="SellerCity" value="北京市" id="c4"/>北京市</label><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
                <label for="c5"><input type="radio" name="SellerCity" value="南京市" id="c5"/>南京市</label>
              </dd>            

              <dd class="s"><input type="submit" value="查询" style="width:100%;font-size:16px;line-height:1.5em;"/></dd>
            </dl>
          </form>
        </div> 
      </div>
    </div>
  </body>
</html>
