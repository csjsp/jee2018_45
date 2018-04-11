<%@page import="java.sql.*"%>
<%@ page language="java" pageEncoding="utf-8"
	contentType="text/html;charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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

</head>

<body>
	<%
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		out.println("姓名：" + username + ",pass=" + password);

		String url = "jdbc:hsqldb:hsql://localhost";
		String driver = "org.hsqldb.jdbcDriver";
		String user = "sa";
		String pass = "";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		String sql = "select * from stu where username = '" + username + "'";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		boolean isHave=rs.next();
		rs.close();stmt.close();con.close();		
		//boolean =dao.check(username)
		//StuDAO dao=new StuDAOImp();
		//boolean isHave=dao.check(username);
		
		if (isHave){
		 response.sendRedirect("login_suc.jsp");
		}			
		else
			response.sendRedirect("login_fail.jsp");		
	%>
</body>
</html>

