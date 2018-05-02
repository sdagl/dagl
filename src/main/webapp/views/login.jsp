<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>

<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Login</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">

<link href="css/animate.css" rel="stylesheet">
<link href="css/style.min.css" rel="stylesheet">

</head>

<body class="gray-bg">

	<div class="middle-box text-center loginscreen animated fadeInDown">
		<div>
			<p></p>
			<p>Login in.</p>
			<form class="m-t" role="form" action="/login" method="post">
				<div class="form-group">
					<input type="text" name="userName" class="form-control"
						placeholder="Username" required="">
				</div>
				<div class="form-group">
					<input type="password" name="password" class="form-control"
						placeholder="Password" required="">
				</div>
				<button type="submit" class="btn btn-primary block full-width m-b">Login</button>
				<br> <a href="#"><small>Forgot password?</small></a>
				<p class="text-muted text-center">
					<small></small>
				</p>
				<a class="btn btn-sm btn-white btn-block" href="#">Create an
					account</a>
			</form>
			<p class="m-t">
				<small>某某所有 &copy; 2018</small>
			</p>
		</div>
	</div>

	<!-- Mainly scripts -->
	<script src="js/jquery-2.2.3.js"></script>
	<script src="js/bootstrap.min.js"></script>

</body>

</html>
