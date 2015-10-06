<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url value="/resources/styles/main.css" var="urlCssMain"/>    
<html>
	<head>
		<meta charset="utf-8">
		<title>Generic Error</title>
	</head> 
	<body>
		<p>
		Generic exception occured with the message: ${exception.message}. Please contant administrator.
		</p>
	</body>
</html>
