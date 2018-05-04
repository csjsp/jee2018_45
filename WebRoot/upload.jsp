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
   <s:form name="uploadForm" action="fileUpload"
   enctype="multipart/form-data" method="post">
     <s:file name="upload"/>
     <s:submit/>
   </s:form>
   限制文件类型 image/*
   <s:form name="uploadForm2" action="fileUploadLimitType"
   enctype="multipart/form-data" method="post">
     <s:file name="upload"/>
     <s:submit/>
   </s:form>
   限制文件扩展名.txt,.xml
   <s:form name="uploadForm2" action="fileUploadLimitExt"
   enctype="multipart/form-data" method="post">
     <s:file name="upload"/>
     <s:submit/>
   </s:form>   
    多文件
   <s:form name="uploadsForm" action="filesUpload"
   enctype="multipart/form-data">
     <s:file name="uploads"/>
     <s:file name="uploads"/>
     <s:file name="uploads"/>
     <s:submit/>
   </s:form>
  </body>
</html>
