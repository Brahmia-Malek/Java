<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project Manager Dashboard</title>
 <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>

<div class="container">
<h1>Welcome,<c:forEach items="${showsList }" var="oneShow" > ${oneShow.watcher.userName}</c:forEach></h1> | <a href="/logout">LOGOUT</a>
   <h1>TV Shows</h1>
  
   <hr />
   <table class="table table-striped">
   <thead>
   <tr>
   <th>Show</th>
   <th>Network</th>
   
   </tr>
   </thead>
   <tbody>
   <c:forEach items="${showsList }" var="oneShow" >
   <tr>
   <td><a href="/shows/${oneShow.id}">${oneShow.showname}</a></td>
   <td>${oneShow.network}</td>
  
   </tr>
   </c:forEach>
   </tbody>
   </table>
 <a href="/shows/new">  <button class="btn btn-primary">Add a Show</button> </a>
</div>
</body>
</html>