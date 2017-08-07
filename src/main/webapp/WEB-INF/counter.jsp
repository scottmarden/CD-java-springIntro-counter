<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Counter</title>
	</head>
	<body>
		<h1>Counter</h1>
		<p>You've visited our site <c:out value="${visits}"/> times</p> 
		
		<a href="/">Want to visit again?</a>
	</body>
</html>