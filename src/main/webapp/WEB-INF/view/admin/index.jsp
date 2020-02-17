<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CMS后台管理系统</title>
<!-- 引入样式 -->
<link href="/resource/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
</head>
<body style="background: url(/resource/images/back_login.jpg)">
	<div class="container">
		<!-- header -->
		<div class="row" style="height: 80px; margin-top: 8px">
			<div class="col-md-12" style="background-color: #0073B7">
				<img alt="" src="/resource/images/logo.png" height="80px"
					class="rounded-circle"><font color="white" size="40px"
					style="margin-top: 10px">CMS后台管理</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span><font color="white">
						登录人:${sessionScope.admin.username }</font>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
					href="/passport/logout">
						<button type="button" class="btn btn-secondary">注销</button>
				</a> </span>
			</div>
		</div>
		<hr style="height: 1px; border: none; border-top: 1px dotted #185598;" />

		<div class="row" style="height: 550px">
			<!-- 菜单 -->
			<div class="col-md-3" style="background-color: #ccc">

				<div style="margin-top: 30px">
					<nav class="navbar navbar-light bg-light">
						<a class="navbar-brand" href="#" data="/admin/user/selects">用户管理</a>
					</nav>

					<!-- As a heading -->
					<nav class="navbar navbar-light bg-light">
						<span class="navbar-brand mb-0 h1"> <a class="navbar-brand"
							href="#" data="/admin/article/selects">文章管理</a>
						</span>
					</nav>

					<nav class="navbar navbar-light bg-light">
						<span class="navbar-brand mb-0 h1"> <a class="navbar-brand"
							href="#" data="/admin/article/complains">举报管理</a>
						</span>
					</nav>
					<!-- As a heading -->
					<nav class="navbar navbar-light bg-light">
						<span class="navbar-brand mb-0 h1">栏目管理</span>
					</nav>
					<!-- As a heading -->
					<nav class="navbar navbar-light bg-light">
						<span class="navbar-brand mb-0 h1">分类管理</span>
					</nav>
					<!-- As a heading -->
					<nav class="navbar navbar-light bg-light">
						<span class="navbar-brand mb-0 h1">系统管理</span>
					</nav>
				</div>

			</div>
			<!-- 中间内容区域 -->
			<div class="col-md-9" id="center"></div>


		</div>


	</div>


</body>
<script type="text/javascript">
	$(function() {

		//中间区域默认显示用户列表
		$("#center").load("/admin/user/selects");

		//为a标签添加点击事件
		$("a").click(function() {
			var url = $(this).attr("data");
			//先删除已有的选中样式
			$("a").removeClass("list-group-item-warning");
			//再为点击的a标签添加点击样式
			$(this).addClass("list-group-item-warning");
			//在中间区域加载url
			$("#center").load(url);
		})
	})
</script>
</html>