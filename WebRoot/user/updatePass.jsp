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
	background-color: #FFD0B5;
}
#right {
	width: 70px;
	height: 1080px;
	float: right;
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
	border-bottom-color: #FFD0B5;
}
#middle tr #userLogo {
	width: 10px;
}
#middle tr #username {
	text-align: left;
	padding-left: 5px;
}
#nav table tr #d1 {
	color: #FFD0B5;
}

#password {
	float: right;
	width: 92%;
	height: 900px;
	background-color:#fff;
}
#password #form1 {
	width: 50%;
	margin-right: auto;
	margin-left: auto;
	margin-top: 50px;
}
#password #form1 table tr #update {
	font-family: "幼圆";
	font-size: 48px;
	font-weight: normal;
	color: #000;
	border-bottom-width: thin;
	border-bottom-style: solid;
	border-bottom-color: #FFD0B5;
}
#password #form1 table tr #biaoshi {
	font-family: "微软雅黑";
	font-size: 24px;
	font-weight: normal;
	color: #333;
	text-align: right;
	padding-right: 8px;
	padding-top: 10px;
	padding-bottom: 10px;
}
#password #form1 table tr td #textfield {
	width: 250px;
	height: 40px;
	border: thin solid #ffd0b5;
	font-family: "幼圆";
	font-size: 18px;
	font-weight: bold;
	color: #666;
	border-radius: 5px;
	padding-left: 15px;
}
#password #form1 table tr #sex {
	font-family: "微软雅黑";
	font-size: 18px;
	font-weight: normal;
	color: #666;
}
#password #form1 table tr #input {
	padding-top: 8px;
	padding-bottom: 8px;
}
#password #form1 table tr #biaoshi #button {
	width: 80px;
	height: 40px;
	background-color: #FFF;
	border: thin solid #ffd0b5;
	font-family: "幼圆";
	font-size: 18px;
	font-weight: normal;
	color: #333;
	border-radius:5px;
}
#password #form1 table tr #input #button {
	width: 80px;
	height: 40px;
	background-color: #FFF;
	border: thin solid #ffd0b5;
	font-family: "微软雅黑";
	font-size: 18px;
	font-weight: lighter;
	color: #F99;
	border-radius: 5px;
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
function b(){
	window.alert("修改信息成功");
	}
</script>
<script>
function a(){
	window.alert("密码修改成功，请重新登录");
	}
</script>
<script type="text/javascript">
function info() {
var divDisp = document.getElementById("right_main").style.display;
if (divDisp == "block") {
document.getElementById("right_main").style.display = "none";
} else {
document.getElementById("right_main").style.display = "block";
}
}
</script>
<script type="text/javascript">
function pass() {
var divDisp = document.getElementById("password").style.display;
if (divDisp == "block") {
document.getElementById("password").style.display = "none";
} else {
document.getElementById("password").style.display = "block";
}
}
</script>
  </head>
  
<body onload="MM_preloadImages('img/10.png')">
<div id="right">
<a href="findcondition2.jsp" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image2','','img/10.png',1)"><img src="img/9.png" width="70" height="70" id="Image2" /></a> </div>

  <table id="middle" border="0" cellpadding="0">
  <c:forEach items="${listLogin }" var="user">
    <tr>
      <td width="36"><a href="listAll.do">主界面</a></td>
      <td width="36"><a href="loginPost.do?userId=${user.userId }">发表帖子</a></td>
      <td width="36"><a href="listPostSelf.do?userId=${user.userId }">我的帖子</a></td>
      <td width="36"><a href="listComment.do?userId=${user.userId }">我的评论</a></td>
      <td width="36"><a href="pCount.do?userId=${user.userId }">我的积分</a></td>
      <td id="userLogo"><img src="img/User-Login-32-1.png" width="32" height="32" /></td>    
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
<div id="password" style="display: block">
<c:forEach items="${listOne }" var="u">
<form id="form1" name="form1" method="post" action="updatePass.do?userId=${u.userId}">
    <input type="hidden" name="userName" value="${u.userName }"/>
    <input type="hidden" name="userEmail" value="${u.userEmail }"/>
    <input type="hidden" name="userNickName" value="${u.userNickName }"/>
    <input type="hidden" name="userBirthday" value="${u.userBirthday }"/>
    <input type="hidden" name="sex" value="${u.sex }"/>
    <table width="100%" border="0" cellpadding="0">
      <tr>
        <td colspan="2" id="update">修改密码</td>
      </tr>
      <tr>
        <td width="29%" id="biaoshi">原密码</td>
        <td width="71%" id="input"><label for="textfield"></label>
        <input type="text" name="textfield" id="textfield" value="${u.userPass}" /></td>
      </tr>
      <tr>
        <td id="biaoshi">新密码</td>
        <td id="input"><label for="textfield2"></label>
        <input type="text" name="textfield2" id="textfield" /></td>
      </tr>
      <tr>
        <td id="biaoshi">确认新密码</td>
        <td id="input"><label for="textfield3"></label>
        <input type="text" name="userPass" id="textfield" /></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td id="input"><input onclick="a()" type="submit" name="button" id="button" value="修改" /> 
        &nbsp;           <input type="reset" name="button2" id="button" value="重置" /></td>
      </tr>
    </table>
  </form>
  </c:forEach>
</div>
<div id="main"></div>
</body>
</html>
