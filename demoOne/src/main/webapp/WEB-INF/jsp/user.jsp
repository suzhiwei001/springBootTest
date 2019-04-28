<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table style="border: 1px">
		<tr>
			<td>id</td>
			<td>姓名</td>
			<td>手机</td>
			<td>邮箱</td>
			<td>创建时间</td>
			<td>年龄</td>
			<td>性别</td>
		</tr>
		<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.phone}</td>
			<td>${user.email}</td>
			<td>timestampToTime(${user.creation_time})</td>
			<td>${user.age}</td>
			<td>${user.sexual}</td>
		</tr>
	</table>
	
	<script type="text/javascript">
	
	
	function timestampToTime(timestamp) {
        var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
        var Y = date.getFullYear() + '-';
        var M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
        var D = date.getDate() + ' ';
        var h = date.getHours() + ':';
        var m = date.getMinutes() + ':';
        var s = date.getSeconds();
        return Y+M+D+h+m+s;
    }
	
	console.info(timestampToTime("${user.creation_time}"))
	</script>
</body>
</html>