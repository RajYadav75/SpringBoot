<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 24-03-2025
  Time: 09:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${!empty empInfo}">
  <h1 style="text-align: center; color: red">${empInfo.id} ${empInfo.name} ${empInfo.salary} </h1>
</c:if>
</body>
</html>
