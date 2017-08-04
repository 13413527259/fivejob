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
	<s:form action="user_update.do" method="post">
		<input type="hidden" name="id" value="${id }" /> 
		<input type="hidden" name="identity" value='<s:property value="%{model.identity}"/>'/>
	<!--	账号：<s:textfield name="account" value="%{model.account}"></s:textfield> -->
		账号：<input type="text" name="account" value='<s:property value="%{model.account}"/>'>
		<br>
		密码：<input type="password" name="password" value='<s:property value="%{model.password}"/>'>
		<br>
		<input type="submit" value="修改">
	</s:form>
</body>
</html>