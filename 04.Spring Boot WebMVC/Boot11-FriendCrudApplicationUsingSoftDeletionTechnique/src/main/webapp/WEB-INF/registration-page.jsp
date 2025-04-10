<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 10-04-2025
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
  <style>
  </style>
</head>
<body>
<h1>This is Friend Registration-Page</h1>
<form:form modelAttribute="frd" >
  <label for="fn">First Name ::</label>
  <form:input path="${frd.firstName}" id="fn"/><br><br><br>
  <label for="ln">Last Name ::</label>
  <form:input path="${frd.lastName}" id="ln"/><br><br><br>
  <label for="mail">Email ::</label>
  <form:input path="${frd.email}" id="mail"/><br><br><br>
  <label for="fone">phone ::</label>
  <form:input path="${frd.phone}" id="fone"/><br><br><br>
  <label for="add">Address ::</label>
  <form:textarea path="${frd.address}" id="add"/><br><br><br>
  <input type="submit" value="Register"/>
</form:form>
</body>
</html>
