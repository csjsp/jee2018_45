<%@ page language="java" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login_suc.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <s:debug/>
  myActionNoParams
   <s:form name="input" action="myActionNoParams">
   <s:textfield key="username"/>
   <s:submit/>
   </s:form>
   myActionWithParams
   <s:form name="input" action="myActionWithParams">
   <s:textfield key="username"/>
   <s:submit/>
   </s:form>
   myActionWithStack
   <s:form name="input" action="myActionWithStack">
   <s:textfield key="username"/>
   <s:submit/>
   </s:form>
  </body>
</html>
