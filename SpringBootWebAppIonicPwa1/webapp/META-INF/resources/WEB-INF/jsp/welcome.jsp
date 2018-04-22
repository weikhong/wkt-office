<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
	<c:set var="appContext" value="${pageContext.request.contextPath}" />
	<c:set var="jsPath" value="${appContext}/web/js" />
	<c:set var="cssPath" value="${appContext}/web/css" />
	<c:set var="imagesPath" value="${appContext}/web/images" />
	<c:set var="webJarsPath" value="${appContext}/webjars" />

	<link href="${webJarsPath}/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
	<link href="${cssPath}/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Spring Boot</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">

		<div class="starter-template">
			<h1>Spring Boot Web JSP Example</h1>
			<h2>Message: ${message}</h2>
			<img alt="SpringBoot Icon" src="${imagesPath}/springboot.png">
		</div>

	</div>
	
	<script type="text/javascript" src="${webJarsPath}/jquery/3.3.1-1/jquery.min.js"></script>
	<script type="text/javascript" src="${webJarsPath}/bootstrap/4.1.0/js/bootstrap.min.js"></script>

</body>

</html>