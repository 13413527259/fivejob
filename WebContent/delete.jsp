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
	<s:form action="user_delete.do" method="post">
		<input type="hidden" name="id" value="${id }" /> 
		账号：<s:property value="%{model.account}"/>
		<br>
		<input type="submit" value="确认删除">
	</s:form>
</body>
</html>