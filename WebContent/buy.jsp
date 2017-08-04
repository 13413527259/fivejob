<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
a{color: #ccc;}
.have{color: red;}
</style>
</head>
<body>
	<s:iterator value="all" status="i" id="a">
		<a class="
		<s:iterator value="seats" id="b">
			<s:if test="#a.name==#b.name">
				have
			</s:if>
		</s:iterator>
		" href=""><s:property value="#a.name"/></a>
		<s:if test="#i.index%4==3">
			<br>
		</s:if>
	</s:iterator>
</body>
</html>