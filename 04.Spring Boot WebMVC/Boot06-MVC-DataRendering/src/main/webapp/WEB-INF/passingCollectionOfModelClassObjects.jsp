<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 24-03-2025
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
  <c:when test="${!empty empListsInfo }">
    <table border="1" bgcolor="#00ffff" align="center">
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Salary</th>
      </tr>
      <c:forEach var="emp" items="${empListsInfo}">
        <tr>
          <td>${emp.id}</td>
          <td>${emp.name}</td>
          <td>${emp.salary}</td>
        </tr>
      </c:forEach>
    </table>

  </c:when>
  <c:otherwise>
    <h1 style="text-align: center; color: red">Employee Not Found</h1>
  </c:otherwise>
</c:choose>
</body>
</html>
