<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<c:url value="/exception" var="exceptionUrl" />

	<h1>Exception Handling and @ControllerAdvice</h1>
	<p><a href="${exceptionUrl}/specific">Generate specific exception</a></p>
	<p><a href="${exceptionUrl}/generic">Generate generic exception</a></p>
	<p><a href="${exceptionUrl}">No exception</a></p>
</body>
</html>
