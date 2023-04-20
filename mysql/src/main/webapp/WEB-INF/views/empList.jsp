<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><th>이름</th><th>성</th><th>월급</th></tr>
<c:forEach items="${list }" var="emp">
<tr><td>
${emp.firstName}</td>
<td>${emp.lastName }</td>
<td>${emp.salary }</td>
</tr>

</c:forEach>
</table>
</body>
</html>