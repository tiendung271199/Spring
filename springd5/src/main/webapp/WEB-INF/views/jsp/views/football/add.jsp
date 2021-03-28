<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý Bóng đá | Thêm</title>
</head>
<body style="margin:0 auto; width:1024px">
	<h1>Quản lý Bóng đá</h1>
	<p></p>
	<c:url value="/football/add/model" var="add" ></c:url>
	<c:url value="/admin/login?msg=Error&count=3" var="login" ></c:url>
	<a href="${login}" >Login</a> <br />
	<form action="${add}" method="post" enctype="multipart/form-data" >
		<form:errors path="fb.name" cssStyle="color:red" ></form:errors><br />
		Tên đội: <input name="name" value="" type="text" /><br />
		<form:errors path="fb.createDate" cssStyle="color:red" ></form:errors><br />
		Ngày thành lập: <input name="createDate" value="" type="text" /><br /><br />
		Description: <textarea name="description" rows="5" cols="60" ></textarea><br /><br />
		File: <input type="file" value="UploadFile" name="picture" /><br /><br />
		<input name="submit" value="Gửi" type="submit" />
	</form>
</body>
</html>