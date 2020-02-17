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
	<div>
		<dl>
			<c:forEach items="${info.list}" var="comment">
				<dt style="font-size: 20px">
					<a href="/article?id=${comment.articleId }" target="_blank">${comment.article.title }</a>
				</dt>
				<dt>${comment.user.username },<fmt:formatDate
						value="${comment.created }" pattern="yyyy-MM-dd HH:mm:ss" />
				</dt>

				<dd>${comment.content }</dd>
				<hr>
			</c:forEach>
		</dl>


	</div>
</body>
</html>