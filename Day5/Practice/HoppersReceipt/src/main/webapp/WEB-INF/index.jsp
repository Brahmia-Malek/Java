<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Receipt</h1>
    <p><strong>Name:</strong> ${name}</p>
    <p><strong>Item:</strong> ${itemName}</p>
    <p><strong>Price:</strong> $${price}</p>
    <p><strong>Description:</strong> ${description}</p>
    <p><strong>Vendor:</strong> ${vendor}</p>
</body>
</html>