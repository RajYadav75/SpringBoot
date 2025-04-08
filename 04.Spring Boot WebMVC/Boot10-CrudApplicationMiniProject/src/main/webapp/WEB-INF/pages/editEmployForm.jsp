<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 07-04-2025
  Time: 09:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <style>
        form{
            text-align:center;
            border:1px solid black;
            box-shadow: 5px 5px black ;
            color:black;
            background-color:deeppink;
            height: 200px;
            width: 200px;
            margin-top: 40px;
            margin-left: 500px;
        }
    </style>
</head>
<body>
<h1>Edit Employee Form</h1>
<form:form modelAttribute="emp">
    <label for="number">Employee No:: </label>
    <form:input path="empno"  id="number" readonly="true"/>
    <br>
    <label for="name">Employee Name:: </label>
    <form:input path="ename"  id="name" />
    <br>
    <label for="job">Employee Job:: </label>
    <form:input path="job"  id="job" />
    <br>
    <label for="salary">Salary:: </label>
    <form:input path="sal"  id="salary" />
    <input type="submit" value="Edit Employee" />
</form:form>
</body>
</html>
