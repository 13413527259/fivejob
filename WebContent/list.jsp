
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
	<h1>用户列表</h1>  
	<a href="user_addUI.do">添加</a>
	<table border="1">  
	    <tr><td>账号</td><td>密码</td><td>身份类别</td><td>编辑</td><td>删除</td></tr>
	    <s:iterator value="list">  
	        <tr> 
	            <td><s:property value="account"/></td>  
	            <td><s:property value="password"/></td>  
	            <td><s:property value="identity"/></td>  
	            <td>
	            	<s:form action="user_updateUI.do" method="post">
	            		<s:hidden value="%{id}" name="id"></s:hidden>
	            		<s:submit value="编辑"></s:submit>
	            	</s:form>
				</td>  
           		<td>
	            	<s:form action="user_deleteUI.do" method="post">
	            		<s:hidden value="%{id}" name="id"></s:hidden>
	            		<s:submit value="删除"></s:submit>
	            	</s:form>
				</td>  
	            </tr>  
	    </s:iterator>  
	</table> 
</body>
</html>