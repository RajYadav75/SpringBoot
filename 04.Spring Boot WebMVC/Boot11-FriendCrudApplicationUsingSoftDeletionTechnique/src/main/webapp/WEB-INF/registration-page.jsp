<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 10-04-2025
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
  <style>
  </style>
</head>
<body>
<h1 style="text-align: center;color: deeppink">This is Friend Registration-Page</h1>
<frm:form modelAttribute="frd" >
  <label for="fn">First Name ::</label>
  <frm:input path="firstName" id="fn"/><br><br><br>
  <label for="ln">Last Name ::</label>
  <frm:input path="lastName" id="ln"/><br><br><br>
  <label for="mail">Email ::</label>
  <frm:input path="email" id="mail"/><br><br><br>
  <label for="fone">phone ::</label>
  <frm:input path="phone" id="fone"/><br><br><br>
  <label for="add">Address ::</label>
  <frm:textarea path="address" id="add"/><br><br><br>
  <input type="submit" value="Register"/>
</frm:form>
</body>
</html>
