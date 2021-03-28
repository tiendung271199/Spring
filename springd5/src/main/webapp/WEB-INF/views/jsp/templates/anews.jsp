<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>VinaENTER EDU - Đã học là làm được</title>
	<meta name="description" content="VinaENTER EDU đào tạo lập trình viên chuyên nghiệp - Đã học là làm được">
	<meta name="keywords" content="dao tao chuyên sâu lap trinh php, java">
	<link href="<c:url value='/resources/anews/css/style.css' />" rel="stylesheet">
</head>
<body>
	<div class="wrapper">
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
		<div id="content">
			<tiles:insertAttribute name="leftbar"></tiles:insertAttribute>
			<div class="content-right fr">
				<tiles:insertAttribute name="body"></tiles:insertAttribute>
			</div>
			<div class="clr"></div>
		</div>
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	</div>
</body>
</html>