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
 <div class="container">
   <h1>Create a New TV Show</h1>
   <hr />
   
   <form:form action="/shows/new" method="post" modelAttribute="show">
   <form:errors class="text-danger" path="*"/>
    <p>
        <form:label path="showname">Show</form:label>
        <form:errors path="showname"/>
        <form:input path="showname"/>
    </p>
    <p>
        <form:label path="network">Network</form:label>
           <form:errors path="network"/>
        <form:input  path="network"/>
    </p>
     <p>
        <form:label path="description">Description</form:label>
           <form:errors path="description"/>
        <form:textarea  path="description"/>
    </p>
    
 <button class="btn btn-primary">Submit</button>
 
  </form:form> 
   </hr>   
 <a href="/shows"> <button class="btn btn-primary">Cancel</button> </a>
   </div>
   
                       
 
  
       
    

</body>
</html>