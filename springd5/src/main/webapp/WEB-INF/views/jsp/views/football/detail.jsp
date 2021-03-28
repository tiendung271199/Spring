<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail Football</title>
<style type="text/css">
.detail {
	margin: 50px auto;
	width: 500px;
	padding: 50px;
	background-color: #CCC;
}
</style>
</head>
<body>
	<div class="detail">
		<c:choose>
			<c:when test="${not empty football}">
				<h2>${football.name}</h2>
				<p>${football.description}</p>
			</c:when>
			<c:otherwise>
				<p>Chưa có dữ liệu</p>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>