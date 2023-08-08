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
<h1>Send an Omikuji !</h1>
<form action='/processForm' method='POST'>
 <label for="numberInput">Pick any number from 5 to 25</label>
        <input type="number" id="numberInput" name="number"><br><br>
        
        <label for="textInput">Enter the name of any city</label>
        <input type="text" id="textInput" name="input1"><br><br>
        
        <label for="textInput">Enter the name of any real person</label>
        <input type="text" id="textInput" name="input2"><br><br>
       
        <label for="textInput">Enter professional endeavor or hoppy</label>
        <input type="text" id="textInput" name="input3"><br><br>
        
        <label for="textInput">Enter any type of living thing</label>
        <input type="text" id="textInput" name="input4"><br><br>
        
        <label for="textAreaInput">Say some thing nice to someone</label><br>
        <textarea id="textAreaInput" name="textinput" rows="4" cols="50"></textarea><br><br>
        <p> Send and show a friend </p>
        <button>Send</button>
          </form>
</body>
</html>