<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 23-03-2025
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Model Attribute is :: </h1>
<p>fav Colors are :: </p>
<c:forEach var="color" items="${favColor}">
    ${color}
</c:forEach>
<c:forEach var="name" items="${nickNames}">
    ${name}
</c:forEach>

<c:forEach var="phno" items="${phoneNo}">
    ${phno}
</c:forEach>


<c:forEach var="id" items="${idDetails}">
    ${idDetails}
</c:forEach>