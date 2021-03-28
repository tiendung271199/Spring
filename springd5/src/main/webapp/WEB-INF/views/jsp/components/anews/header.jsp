<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- begin header -->
<div id="header">
	<div class="header-left fl">
		<c:url value="/resources/anews/images" var="img" ></c:url>
		<a href="index.php" title=""><img src="${img}/logo_edu.png" alt="" height="128px" /></a>
	</div>
	<div class="header-right fr">
		<a href="index.php" title=""><img src="${img}/banner.jpg" alt="" /></a>
	</div>
	<div class="clr"></div>
</div>
<!-- end header -->

<!-- begin menu -->
<div id="menu">
	<ul>
		<li class="active"><a href="index.php" title="">Trang chủ</a></li>
	</ul>
	<div class="clr"></div>
</div>
<!-- end menu -->