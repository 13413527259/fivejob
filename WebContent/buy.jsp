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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.1.1.js" ></script>
<script type="text/javascript">
	$(function(){
		$("input[type=checkbox]").not(".have").attr("disabled",true); 
	});
</script>
</head>
<body>
<form action="ticket_save.action" method="post">
	<input type="hidden" name="train.id" value="<%=request.getAttribute("train.id")%>">
	<s:iterator value="all" status="i" id="a">
		<!-- 
		
		<a class="
		<s:iterator value="seats" id="b">
			<s:if test="#a.name==#b.name">
				have
			</s:if>
		</s:iterator>
		" href=""><s:property value="#a.name"/></a>
		
		 -->
		 
		<input type="checkbox" class="
		<s:iterator value="seats" id="b">
			<s:if test="#a.name==#b.name">
				 have
			</s:if>
		</s:iterator>
		" name="ids" Value="<s:property value="#a.id"/>"><s:property value="#a.name"/></input>
		 
		<s:if test="#i.index%4==3">
			<br><br>
		</s:if>
	</s:iterator>
	<input type="submit" value="购票">
</form>
</body>
</html>