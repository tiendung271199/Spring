<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>VinaEnter - Đã Học Là Làm Được</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link href="<c:url value='/resources/cnews/css/style.css' />" rel="stylesheet" />
<script src="<c:url value='/resources/cnews/js/cufon-yui.js' />"></script>
<script src="<c:url value='/resources/cnews/js/arial.js' />"></script>
<script src="<c:url value='/resources/cnews/js/cuf_run.js' />"></script>
</head>
<body>
<div class="main">
  <tiles:insertAttribute name="header"></tiles:insertAttribute>
  <div class="body">
    <div class="body_resize">
      <tiles:insertAttribute name="body"></tiles:insertAttribute>
      <tiles:insertAttribute name="sidebar"></tiles:insertAttribute>
      <div class="clr"></div>
    </div>
  </div>
  <tiles:insertAttribute name="footer"></tiles:insertAttribute>
</div>
</body>
</html>
