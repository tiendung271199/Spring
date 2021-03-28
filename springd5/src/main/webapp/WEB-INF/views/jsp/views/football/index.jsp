<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Quản lý Bóng đá</title>
	<style type="text/css">
		.msg{
			text-align: center;
			background: #CCC;
			padding: 5px;
		}
	</style>
</head>
<body style="margin:0 auto; width:1024px">
	<h1>Quản lý Bóng đá</h1>
	<c:url value="/football/add" var="add" ></c:url>
	<p><a href="${add}" title="Thực hiện thêm">Thêm</a></p>
	<p></p>
	<p style="color: blue; font-style: italic">${msgSuccess}</p>
	<c:choose>
		<c:when test="${not empty footballList}">
			<table width="80%" border="1" cellpadding="1" cellspacing="1">
				<tr>
					<th width="10%">ID</th>
					<th width="50%">Tên đội</th>
					<th width="20%">Ngày thành lập</th>
					<th>Chức năng</th>
				</tr>
				<c:forEach items="${footballList}" var="football">
					<c:url value="/football/detail/${football.id}" var="detail" ></c:url>
					<fmt:formatDate value="${football.createDate}" pattern="yyyy-MM-dd" var="fmtDate" />
					<tr>
						<td>${football.id}</td>
						<td>${football.name}</td>
						<td>${fmtDate}</td>
						<td>
							<a href="" title="Thực hiện sửa">Sửa</a> ||
							<a href="" title="Thực hiện xóa">Xóa</a> ||
							<a href="${detail}" title="Chi tiết">Xem</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<p class="msg">Không có dữ liệu</p>
		</c:otherwise>
	</c:choose>
	<p style="color: red">${msg}</p>
</body>
</html>