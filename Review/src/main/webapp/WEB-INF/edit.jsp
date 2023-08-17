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
<title>Cars</title>
 <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<div class="container">
   <h1>Edit Car 📖</h1>
   <hr />
   
   <form:form action="/cars/${car.id }/edit" method="post" modelAttribute="car">
   <input type="hidden" name="_method" value="put">
   <form:errors class="text-danger" path="*"/>
    <p>
        <form:label path="model">Model</form:label>
         <form:errors path="model"/>
        <form:input path="model"/>
    </p>
    <p>
        <form:label path="color">Color</form:label>
        <form:errors path="color"/>
        <form:input type="color" path="color"/>
    </p>

   
    <button>UPDATE</button>
</form:form>    
   
   </div>
</body>
</html>