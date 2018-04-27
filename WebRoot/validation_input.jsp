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
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<s:head/>
  </head>
  
  <body>
  <s:debug/>  
  <s:actionerror/>
    <s:form action="xmlValidation" method ="post">
       <s:textfield name="test_int" label="test_int[20,50]"/>
       <s:textfield name="test_double" label="test_double[50,70]"/>
       <s:textfield name="test_stringlength" label="test_stringlength(>3)"/>
       <s:textfield name="pass" label="pass"/>
       <s:textfield name="repass" label="repass"/>
       <s:submit/>
    </s:form>
    
  </body>
</html>

