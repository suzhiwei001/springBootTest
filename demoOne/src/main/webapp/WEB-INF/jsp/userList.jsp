<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%><!-- 日期格式化使用 -->
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户展示</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<td>id</td>
			<td>姓名</td>
			<td>手机</td>
			<td>邮箱</td>
			<td>创建时间</td>
			<td>年龄</td>
			<td>性别</td>
			<td>操作</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${userList}" var = "user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.phone}</td>
				<td>${user.email}</td>
				<td><fmt:formatDate value="${user.creation_time}" /></td>
				<td>${user.age}</td>
				<td>${user.sexual}</td>
				<td><a href="<%=basePath%>/user/userName?name=${user.name}">查询</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>