<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
<h1>Here's Your Omikuji !!</h1>
<div class="box"><p> In ${number}years,you will <br/>live in ${input1} with <br/>${input2} as your <br/> roommate, ${input3}for a living.The next time you see a ${input4},you will have good luck.Also,${inputtext}</div>
<p><a href="/omikuji">Go Back</a>
</body>
</html>