<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
#nav {
	height: 70px;
	width: 100%;
}
#nav table {
	width: 120px;
	height: 70px;
	font-family: "Arial Black";
	font-size: 36px;
	color: #000;
}
#main {
	height: 1200px;
	width: 4%;
	border-right-width: thin;
	border-right-style: solid;
	border-right-color: #CCC;
	background-color: #ff9900;
}
#right_main {
	float: right;
	width: 92%;
	height: 900px;
}
#right {
	width: 70px;
	height: 1080px;
	float: right;
}
#right_main table {
	text-decoration: none;
	margin-left: 15%;
}
#right_main table #title td a{
	font-family: "幼圆";
	font-size: 48px;
	font-weight: normal;
	color: #000;
	border-bottom-width: thin;
	border-bottom-style: solid;
	border-bottom-color: #FF9900;
	text-decoration: none;
	display: block;
}
#right_main table #title td a:hover {
	font-family: "幼圆";
	font-size: 48px;
	font-weight: normal;
	color: #FF9900;
	border-bottom-width: thin;
	border-bottom-style: solid;
	border-bottom-color: #FF9900;
	text-decoration: none;
}
#right_main table #under td{
	padding-top: 15px;
	padding-bottom: 15px;
	border-bottom-width: thin;
	border-bottom-style: solid;
	border-bottom-color: #CCC;
	font-family: "微软雅黑";
	font-size: 16px;
	font-weight: normal;
	color: #000;
}
#right a {
}
#middle {
	height: 70px;
	text-align: center;
	margin-right: 10%;
	float: right;
}
#middle tr td {
	width: 200px;
	font-family: "微软雅黑";
	font-size: 16px;
	font-weight: normal;
}
#middle tr td a {
	text-decoration: none;
	color: #000;
	display: block;
	padding-top: 10px;
	padding-bottom: 10px;
}
#middle tr td a:hover {
	display: block;
	border-bottom-width: medium;
	border-bottom-style: solid;
	border-bottom-color: #FF9900;
}
#middle tr #userLogo {
	width: 10px;
}
#middle tr #username {
	text-align: left;
	padding-left: 5px;
}
#nav table tr #d1 {
	color: #FF9900;
}
#right_main table tr td #form1 #textfield {
	height: 40px;
	width: 600px;
	background-color: #FFF;
	border: medium solid #FF9900;
	font-family: "微软雅黑";
	font-size: 18px;
	color: #000;
	padding-left: 15px;
}
#right_main table tr td #form1 #button {
	height: 40px;
	width: 80px;
	background-color: #FFF;
	border: thin dashed #FF9900;
}
</style>
<script type="text/javascript">
function frontPageCheck(){
if(${page>1}){
return true;
}
return false;
}

function backPageCheck(){
if(${page<allPage}){
return true;
}
return false;
}
</script>
<script type="text/javascript">
function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}
function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
</script>
  </head>
  
 <body onload="MM_preloadImages('img/6.png')">
<div id="right">
 <a href="findcondition2.jsp" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image1','','img/6.png',1)"><img src="img/5.png" width="70" height="70" id="Image1" /></a></div>

  <table id="middle" border="0" cellpadding="0">
  <c:forEach items="${listLogin }" var="user">
    <tr>
      <td width="36"><a href="index.jsp">论坛首页</a></td>
      <td width="36"><a href="loginPost.do?userId=${user.userId }">发表帖子</a></td>
      <td width="36"><a href="listPostSelf.do?userId=${user.userId }">我的帖子</a></td>
      <td width="36"><a href="listComment.do?userId=${user.userId }">我的评论</a></td>
      <td width="36"><a href="pCount.do?userId=${user.userId }">我的积分</a></td>
      <td id="userLogo"><img src="img/User-Login-48.png" width="32" height="32" /></td>   
      <td width="50"><a id="username" href="findOne.do?userId=${user.userId }">${user.userName }</a></td>
    </tr>
    </c:forEach>
</table>

<div id="nav">
  <table border="0" cellpadding="0">
    <tr>
      <td>C</td>
      <td>S</td>
      <td id="d1">D</td>
      <td>N</td>
    </tr>
  </table>
</div>
<div id="right_main">
  <table width="70%" border="0" cellpadding="0">
  <tr>
      <td colspan="3"><form id="form1" name="form1" method="post" action="listVague2.do">
        <label for="textfield"></label>
        <input type="text" name="topic" id="textfield" />
        <input type="submit" name="button" id="button" value="搜索" />
      </form></td>
    </tr>
  <c:forEach items="${listAll}" var="up">
    <tr id="title">
      <td colspan="3"><a href="listPostDetail1.do?postId=${up[0].postId }">${up[0].topic}</a></td>
    </tr>
    <tr id="under">
      <td colspan="2">${up[0].postTime}</td>
      <td><a>${up[1].userName}</a></td>
    </tr>
    </c:forEach>
  </table>
</div>
<div id="main"></div>
</body>
</html>
