<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Fruits List</h1>
    <ul>
        <c:forEach var="fruit" items="${fruits}">
            <li>${fruit.name} - $${fruit.price}</li>
        </c:forEach>
    </ul>
</body>
</html>