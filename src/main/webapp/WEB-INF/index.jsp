<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Employees and Managers</title>
	</head>
	<body>
		<h3>Michael Scott's employees</h3>
		<ul>
			<c:forEach items="${michaelsEmployees}" var="row">
				<li>${row.firstName} ${row.lastName}</li>
			</c:forEach>
		</ul>
		
		<h3>Dwight Schrute's employees</h3>
		<ul>
			<c:forEach items="${dwightsEmployees}" var="row">
				<li>${row.firstName} ${row.lastName}</li>
			</c:forEach>
		</ul>
		
		<h3>Dwight Schrute's managers</h3>
		<ul>
			<c:forEach items="${dwightsManagers}" var="row">
				<li>${row.firstName} ${row.lastName}</li>
			</c:forEach>
		</ul>
		
		<h3>Jim Halpert's managers</h3>
		<ul>
			<c:forEach items="${jimsManagers}" var="row">
				<li>${row.firstName} ${row.lastName}</li>
			</c:forEach>
		</ul>
	</body>
</html>