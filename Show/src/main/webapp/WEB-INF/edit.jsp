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
<title>Edit My Task</title>
 <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
 <c:forEach items="${showsList }" var="oneShow" >
   <form action="/shows/${oneShow.id }" method="post">
   	<input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
   	</form> </p>
   </c:forEach>
  <div class="container">
   <h1>${show.showname}</h1>
   <hr />
   
   <form:form action="/shows/${show.id}/edit" method="post" modelAttribute="show">
   <input type="hidden" name="_method" value="put">
   <form:errors class="text-danger" path="*"/>
    <p>
        <form:label path="showname">Show</form:label>
        <form:input path="showname"/>
    </p>
    <p>
        <form:label path="network">Network</form:label>
        <form:input path="network"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:textarea path="description"/>
    </p>

    
   <a href="/shows"> <button class="btn btn-primary">Cancel</button> </a>        <button class="btn btn-primary">Submit</button>
</form:form>    
   <form action="/shows/${show.id }" method="post">
   	<input type="hidden" name="_method" value="delete">
    <input type="submit" class="btn btn-danger" value="Delete">
   	</form>
   </div>
  
</body>
</html>