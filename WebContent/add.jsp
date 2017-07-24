<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="user_add.do" method="post">
		<input type="hidden" name="identity" value="1">
		<input type="text" name="account" placeholder="账号">
		<br>
		<input type="password" name="password" placeholder="密码">
		<br>
		<input type="submit" value="添加">
	</s:form>
</body>
</html>