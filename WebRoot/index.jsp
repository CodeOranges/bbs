<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	border-bottom-width: thin;
	border-bottom-style: solid;
	border-bottom-color: #CCC;
	width: 100%;
}
#nav table {
	width: 120px;
	height: 70px;
	font-family: "Arial Black";
	font-size: 36px;
	color: #000;
	position: fixed;
	top: 0px;
}
#main {
	height: 900px;
	width: 40%;
	position: fixed;
	left: 0px;
	top: 70px;
	right: 40%;
}
#main form {
	margin-top: 200px;
}
#main form table {
	height: 400px;
	margin-right: auto;
	margin-left: auto;
	text-align: center;
	font-family: "微软雅黑";
	font-size: 20px;
	font-weight: normal;
	color: #999;
}
#main form table tr td #textfield {
	width: 300px;
	height: 50px;
	font-family: "微软雅黑";
	font-size: 18px;
	color: #333;
	padding-left: 10px;
	box-shadow: 10px 10px 20px 5px #666;

}
#main form table tr td #button {
	height: 50px;
	width: 400px;
	font-family: "幼圆";
	font-size: 24px;
	font-weight: normal;
	color: #FFF;
	word-spacing: 200px;
	border-radius:15px;
}
#main form table tr #btn {
	vertical-align: top;
	border-top-width: thin;
	border-top-style: solid;
	border-top-color: #933;
	padding-top: 3px;
}
#register {
	height: 900px;
	width: 40%;
	position: fixed;
	left: 0px;
	top: 70px;
	right: 40%;
	background-color: #FFF;
	border-top-width: thin;
	border-top-style: solid;
	border-top-color: #CCC;
}
#register #form1 {
	margin-top: 150px;
}
#register #form1 table {
	margin-right: auto;
	margin-left: auto;
	text-align: center;
}
#register #form1 table tr td {
	font-family: "微软雅黑";
	font-size: 18px;
	color: #333;
	font-weight: lighter;
	padding: 15px;
}
#register #form1 table tr #rtd {
	width: 250px;
	text-align: left;
}
#register #form1 table tr #rtd #textfield2 {
	height: 35px;
	width: 250px;
	font-family: "微软雅黑";
	font-size: 14px;
	font-weight: normal;
	color: #333;
	padding-left: 10px;
	box-shadow: 5px 5px 10px 5px #666;
}
#register #form1 table tr td #button2 {
	width: 200px;
	height: 40px;
	font-family: "幼圆";
	font-size: 18px;
	font-weight: normal;
	color: #FFF;
}
#manager {
	height: 900px;
	width: 40%;
	position: fixed;
	left: 0px;
	top: 70px;
	right: 40%;
	background-color: #FFF;
	border-top-width: thin;
	border-top-style: solid;
	border-top-color: #CCC;
	border-right-color: #CCC;
	border-bottom-color: #CCC;
	border-left-color: #CCC;
}
#manager form {
	margin-top: 200px;
}
#manager form table {
	height: 400px;
	margin-right: auto;
	margin-left: auto;
	text-align: center;
	font-family: "微软雅黑";
	font-size: 20px;
	font-weight: normal;
	color: #999;
}
#manager form table tr td #textfield {
	width: 300px;
	height: 50px;
	font-family: "微软雅黑";
	font-size: 18px;
	color: #333;
	padding-left: 10px;
	box-shadow: 10px 10px 20px 5px #666;

}
#manager form table tr td #button {
	height: 50px;
	width: 400px;
	font-family: "幼圆";
	font-size: 24px;
	font-weight: normal;
	color: #FFF;
	word-spacing: 200px;
	border-radius:15px;
}
#manager form table tr #btn {
	vertical-align: top;
	border-top-width: thin;
	border-top-style: solid;
	border-top-color: #933;
	padding-top: 3px;
}
#right {
	width: 70px;
	height: 1100px;
	float: right;
	border-left-width: thin;
	border-left-style: solid;
	border-left-color: #CCC;
}
#right a {
}
#right_main {
	float: right;
	width: 990px;
	height: 1200px;
	background-color: #900;
}
#right_main #welcome   {
	font-family: "Arial Unicode MS";
	font-size: 60px;
	font-weight: bolder;
	color: #FFF;
	text-align: right;
	border-bottom-width: thin;
	border-bottom-style: solid;
	border-bottom-color: #966;
	text-decoration: none;
}
#right_main table tr td {
	height: 50px;
	border-bottom-width: thin;
	border-bottom-style: solid;
	border-bottom-color: #966;
	font-family: "Arial Unicode MS";
	font-size: 18px;
	font-weight: normal;
	color: #C66;
	text-align: right;
}
#middle {
	height: 70px;
	text-align: center;
	margin-right: 27%;
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
	border-bottom-color: #900;
}
#nav table tr #d1 {
	color: #900;
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
<script type="text/javascript">
function Href() {
var divDisp = document.getElementById("main").style.display;
if (divDisp == "block") {
document.getElementById("main").style.display = "none";
} else {
document.getElementById("main").style.display = "block";
}
}
</script>
<script type="text/javascript">
function register() {
var divDisp = document.getElementById("register").style.display;
if (divDisp == "block") {
document.getElementById("register").style.display = "none";
} else {
document.getElementById("register").style.display = "block";
}
}
</script>
<script type="text/javascript">
function manager() {
var divDisp = document.getElementById("manager").style.display;
if (divDisp == "block") {
document.getElementById("manager").style.display = "none";
} else {
document.getElementById("manager").style.display = "block";
}
}
</script>
<script>
        function checkpassword(){
            var passwordEle = document.getElementById('password');
            var repasswordEle = document.getElementById('repassword');          
            if(passwordEle.value!=repasswordEle.value){
                repasswordEle.setCustomValidity('两次输入密码不一致!');
            }else{
                repasswordEle.setCustomValidity('');
            }
        }
    </script>
    <script>
function a(){
	window.alert("注册成功,请登录后再操作");
	}
</script>
  </head>
  
<body onload="MM_preloadImages('img/a2.png')">
<div id="right">
<a href="findcondition.jsp" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image2','','img/a2.png',1)"><img src="img/a1.png" width="70" height="70" id="Image2" /></a></div>

  <table id="middle" border="0" cellpadding="0">
    <tr>
      <td width="36"><a href="TouristAll.do">进入论坛</a></td>
      <td width="36"><a onclick="javacript:Href()" href="#">用户登录</a></td>
      <td width="36"><a onclick="javacript:register()" href="#">新用户注册</a></td>
      <td width="36"><a onclick="javacript:manager()" href="#">管理员登录</a></td>
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
<img src="img/person-using-macbook-pro-on-person-s-lap-1181298.jpg" width="990" height="700" />
<table width="100%" border="0" cellpadding="0">
  <tr>
    <td id="welcome">Welcome to CSDN</td>
  </tr>
  <tr>
    <td>COPYRIGHT©31704 LIHAN</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>
</div>

<div id="main" style="display:block">
<form action="loginUser.do" method="post">
<table width="400px" height="416" border="0" cellpadding="0">
  <tr>
    <td width="64" height="110">用户名</td>
    <td width="334"><label for="textfield"></label>
      <input type="text" name="userName" id="textfield" placeholder="请输入用户名" required="required"/></td>
  </tr>
  <tr>
    <td height="114" id="pass">密&nbsp;&nbsp; 码</td>
    <td><label for="textfield2"></label>
      <input type="password" name="userPass" id="textfield" pattern="^[a-zA-Z0-9]\w{5,19}$" placeholder="请输入密码" required="required" oninput="this.setCustomValidity('')" oninvalid="this.setCustomValidity('请输5-19位入正确密码')" onchange="checkpassword()" /></td>
  </tr>
  <tr>
    <td colspan="2" id="btn"><input type="submit" name="button" id="button" value="登录" style="background-color: #933" /></td>
    </tr>
</table>
</form>
</div>
<div id="register" style="display:none">
  <form id="form1" name="form1" method="post" action="nameRepeat.do">
    <table border="0" cellpadding="0">
      <tr>
        <td>用户名</td>
        <td id="rtd"><label for="textfield2"></label>
        <input type="text" name="userName" id="textfield2" placeholder="请输入用户名" required="required"/></td>
      </tr>
      <tr>
        <td>密 码</td>
        <td id="rtd"><label for="textfield3"></label>
        <input type="password" name="userPass" id="textfield2" placeholder="请输入5-19位密码" required="required"/></td>
      </tr>
      <tr>
        <td>重复密码</td>
        <td id="rtd"><input type="password" name="repassward" id="textfield2" placeholder="请确认密码" required="required"/></td>
      </tr>
      <tr>
        <td>昵 称</td>
        <td id="rtd"><label for="textfield4"></label>
        <input type="text" name="userNickName" id="textfield2" required="required"/></td>
      </tr>
      <tr>
        <td>性 别</td>
        <td id="rtd"><input type="radio" name="sex" id="radio" value="男" checked="checked" />
        <label for="radio">男
          <input type="radio" name="sex" id="radio2" value="女" />
        女</label></td>
      </tr>
      <tr>
        <td>生 日</td>
        <td id="rtd"><input type="date" name="userBirthday" id="textfield2" value="请选择" /></td>
      </tr>
      <tr>
        <td>邮 箱</td>
        <td id="rtd"><input type="email" name="userEmail" id="textfield2" placeholder="请输入有效邮件地址" /></td>
      </tr>
      <tr>
        <td colspan="2"><input type="submit" name="button2" id="button2" value="注册" style="background-color:#933" />
        <input type="reset" name="button3" id="button2" value="重置" style="background-color:#933" /></td>
      </tr>
    </table>
  </form>
</div>
<div id="manager" style="display:none">
<form action="loginManager.do" method="post">
<table width="400px" height="416" border="0" cellpadding="0">
  <tr>
    <td width="64" height="110">管理员</td>
    <td width="334"><label for="textfield"></label>
      <input type="text" name="managerName" id="textfield" placeholder="请输入管理员名" required="required"/></td>
  </tr>
  <tr>
    <td height="114" id="pass">密&nbsp;&nbsp; 码</td>
    <td><label for="textfield2"></label>
      <input type="password" name="managerPass" id="textfield" pattern="^[a-zA-Z0-9]\w{5,19}$" placeholder="请输入密码" required="required" oninput="this.setCustomValidity('')" oninvalid="this.setCustomValidity('请输5-19位入正确密码')" onchange="checkpassword()" /></td>
  </tr>
  <tr>
    <td colspan="2" id="btn"><input type="submit" name="button" id="button" value="登录" style="background-color: #933" /></td>
    </tr>
</table>
</form>
</div>
</body>
</html>
