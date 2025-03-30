<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 30-03-2025
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<frm:form modelAttribute="empl" method="post" action="emp">
  <table>
    <tr>
      <td>Employee Id:</td>
      <td><frm:input path="id"/></td>
    </tr>
    <tr>
      <td>Employee Name:</td>
      <td><frm:input path="name"/></td>
    </tr>
    <tr>
      <td>Employee age:</td>
      <td><frm:input path="age"/></td>
    </tr>
    <tr>
      <td>Employee salary:</td>
      <td><frm:input path="salary"/></td>
    </tr>
    <tr>
      <td>Employee gender:</td>
      <td><frm:input path="gender"/></td>
    </tr>

  </table>
  <tr>
    <input type="submit" value="Submit"/>
  </tr>
  <tr>
    <input type="reset" value="Reset"/>
  </tr>
</frm:form>
</body>
</html>
