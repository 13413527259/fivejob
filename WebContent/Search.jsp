<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		
		<form action="train_findByParma.action" method="post">
			目的地<input type="text" name="to.name" placeholder="目的地">
			 出发日期<input type="date" name="time" value="2017-08-03" placeholder="出发日期"> 
			<input type="submit" value="立即查询">
		</form>
		<form action="train_find.action" method="post">
			<input type="submit" value="显示所有">
		</form>
	</div>
	<table border="1">
		<tr><td>出发时间/路程</td><td>出发/到达</td><td>车型/车次</td><td>票价</td><td>余票</td><td>操作</td></tr>
		<s:iterator value="trains" id="item">
			<tr>
				<td><s:property value="time"/>/<s:property value="km"/>KM</td>
				<td><s:property value="from.name"/>/<s:property value="to.name"/></td>
				<td><s:property value="type.name"/>/<s:property value="name"/></td>
				<td>￥<s:property value="price"/></td>
				<td>有票</td>
				<td>
					<form action="seat_findSeat.action" method="post">
						<input type="hidden" name="id" value="<s:property value="id"/>">
						<input type="submit" value="购票">
					</form>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>