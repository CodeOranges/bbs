<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add3points.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script>
function autoSubmit(){
 document.getElementById("myForm").submit();
}
</script>
  </head>
  
  <body onload="autoSubmit();">
  		<c:forEach items="${listLogin }" var="u">
			<form id="myForm" action="addDetail.do">
     			<input type="hidden" name="userId" value="${u.userId }">
     			<input type="hidden" name="postCounts" value="${sessionScope.pCount }">
     			<input type="hidden" name="postComments" value="${sessionScope.pComment }">
     			<input type="hidden" name="sumPoints" value="${sessionScope.sum }">
    		</form>
     	</c:forEach>
  
  
     
  </body>
</html>
