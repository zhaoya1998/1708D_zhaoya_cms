<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/index_work.css" />
<link href="<%=request.getContextPath()%>/css/index_work.css"
	rel="stylesheet">
<!-- 引入样式 -->
<link href="/resource/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>

<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
</head>
<body>
	<table class="table table-bordered table-hover">
		<tr align="center">
			<td>序号</td>
			<td>标题</td>
			<td>文章url</td>
			<td>举报类型</td>
			<td>举报内容</td>
			<td>举报人</td>
			<td><a href="javascript:myOrder('created')">举报时间</a></td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="u" varStatus="i">
			<tr align="center">
				<td>${i.count}</td>
				<td>${u.article.title }</td>
				<td>${u.url }</td>
				<td>${u.typename }</td>
				<td>${u.content }</td>
				<td>${u.user.username }</td>
				<td>${u.created }</td>
				<!-- status:0:待審核，1：已審核 -1 駁回， 2 禁止 -->
				<td>
				   <button type="button" class="btn btn-info"  onclick="window.close()">关闭</button>
				</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>