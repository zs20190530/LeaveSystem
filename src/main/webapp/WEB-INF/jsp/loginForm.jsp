<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/common.css"/>" >
<title>Login Form</title>
</head>
<body>
<div class="login-container">
    <form action="login" method="post">
    <div class="login-box">
        <div class="title">Leave System</div>
        <div class="error-message">${message}</div>
        <div class="form-input">
            <label>Username:</label>
            <input type="text" name="username">
        </div>
        <div class="form-input">
            <label>Password:</label>
            <input type="password" name="password">
        </div>
        <button type="submit">Login</button>
    </div>
    </form>
</div>
</body>
</html>