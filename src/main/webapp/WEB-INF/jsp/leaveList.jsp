<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="leavelist">
    <tr>
<!--         <td>选择</td> -->
        <td>提出日</td>
        <td>休假种别</td>
        <td>休假期间</td>
        <td>日数</td>
        <td>状态</td>
    </tr>
    <c:forEach items="${leaveList}" var="leave">
    <tr>
<!--         <td><input type="radio" name="selectItem"></td> -->
        <td>${leave.apply_date}</td>
        <td>${leave.leave_type}</td>
        <td>${leave.begin_time}~${leave.end_time}</td>
        <td>${leave.days}</td>
        <td>${leave.status}</td>
    </tr>
    </c:forEach>
</table>