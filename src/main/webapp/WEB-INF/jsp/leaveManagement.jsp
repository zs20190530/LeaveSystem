<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/common.css"/>" >
<script>
    var selectItem = "${selectItem}";
</script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.pjax.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/common.js"/>"></script>
<title>休假管理</title>
</head>
<body>
<div class="main-container">
    <div class="sidebar">
	    <div class="toggle-button">休假管理</div>
	    <div data-pjax class="toggle-box">
            <div id="applyLeave"><a data-pjax href="applyLeaveForm">休假申请</a></div>
            <div id="queryLeave"><a data-pjax href="queryLeaveList">查看休假历史</a></div>
        </div>
	</div>
	<div id="main-content">
	    
	</div>
</div>
</body>
</html>