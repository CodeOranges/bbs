<%@ page language="java" import="java.util.*,com.*" pageEncoding="UTF-8"%>
<%@page import="com.entity.User"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showAll.jsp' starting page</title>
    
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
	background-color: #3399ff;
}
#right_main {
	float: right;
	width: 92%;
	height: 900px;
}
#right_main #form1 {
	margin-top: 50px;
	text-align: center;
}
#right_main #form1 table {
	margin-right: auto;
	margin-left: auto;
}
#right_main #form1 table tr #title {
	font-family: "幼圆";
	font-size: 45px;
	font-weight: normal;
	color: #000;
	border-bottom-width: thin;
	border-bottom-style: solid;
	border-bottom-color: #3399ff;
	text-align: right;
}
#right_main #form1 table tr #content {
	font-family: "微软雅黑";
	font-size: 18px;
	font-weight: normal;
	color: #666;
	padding-left: 45px;
	border-bottom-width: thin;
	border-bottom-style: solid;
	border-bottom-color: #3399ff;
	
}
#right_main #form1 table tr td #button {
	height: 40px;
	width: 150px;
	font-family: "微软雅黑";
	font-size: 18px;
	color: #000;
	background-color: #FFF;
	border: thin solid #3399ff;
	border-radius:10px;
}
#right_main #form1 table tr #person {
	font-family: "微软雅黑";
	font-size: 18px;
	font-weight: bold;
	color: #000;
	padding-top: 30px;
	padding-bottom: 30px;
}
#right {
	width: 70px;
	height: 1080px;
	float: right;
}
#right a {
}
#middle {
	height: 70px;
	text-align: center;
	margin-right: 30%;
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
	border-bottom-color: #3399FF;
}
#nav table tr #d1 {
	color: #3399FF;
}
</style>
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
<script>
function deleteScuccess(){
	window.alert("删除成功");
}
</script>
  </head>
  
<body onload="MM_preloadImages('img/8.png')">
<div id="right">
<a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image1','','img/8.png',1)"><img src="img/7.png" width="70" height="70" id="Image1" /></a> </div>

  <table id="middle" border="0" cellpadding="0">
    <tr>
      <td width="36"><a href="#">论坛首页</a></td>
      <c:forEach items="${listManager}" var="m">
      <td width="36">管理员：${m.managerName}，您好</td>
      </c:forEach>
    </tr>
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
<c:forEach items="${managerDetail }" var="md">
  <form id="form1" name="form1" method="post" action="managerDelete.do?postId=${md[0].postId }">
    <table width="70%" border="0" cellpadding="0"> 
      <tr>
        <td width="11%" id="title">${md[0].postId}</td>
        <td colspan="2" id="title">${md[0].topic}</td>
      </tr>
      <tr>
        <td id="content" colspan="3">${md[0].matter}</td>
      </tr>
      <tr>
        <td id="person">${md[1].userName}</td>
        <td id="person" width="74%">${md[0].postTime}</td>
        <td id="delete" width="15%"><input type="submit" name="button" id="button" value="删除" onclick="deleteScuccess()" /></td>
      </tr>
    </table>
  </form>
</c:forEach>
</div>
<div id="main"></div>
</body>
</html>
