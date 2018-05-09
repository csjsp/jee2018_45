<%@ page language="java" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjr" uri="/struts-jquery-richtext-tags"%>
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
<sj:head/>
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
       <sj:datepicker name="test_date_jquery" label="Select a Date"
            displayFormat="%{getText('format.date.input')}"
            changeMonth="true" changeYear="true" />
       <s:textfield name="stu.username" label="username"/>     
            <sjr:ckeditor
					id="richtextEditor"
					name="echo"
					rows="10"
					cols="80"
					width="730"
					height="250"/>
       <s:submit/>
    </s:form>
    
  </body>
</html>

