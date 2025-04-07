<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 04-04-2025
  Time: 09:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<h2 style="text-align: center;color: deeppink">${resultMsg}</h2>--%>
<c:choose>
    <c:when test="${!empty empInfo}">
        <table bgcolor="#00ffff" border="1"  align="center">
            <tr bgcolor="#ff69b4">
                <th>Employ No</th>
                <th>Employ Name</th>
                <th>Employ Job</th>
                <th>Employ Salary</th>
                <th>Operations</th>
            </tr>
            <c:forEach var="emp" items="${empInfo}">
                <tr bgcolor="#ffc0cb">
                    <td>${emp.empno}</td>
                    <td>${emp.ename}</td>
                    <td>${emp.job}</td>
                    <td>${emp.sal}</td>
                    <td>
                        <a href="edit?no=${emp.empno}">Edit</a>
                        <a href="delete?no=${emp.empno}" onclick="return confirm('Are you sure to delete this record?')">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h1 style="color: red;text-align: center">Record Not Found</h1>
    </c:otherwise>
</c:choose>
<div style="text-align: center;color: deeppink">
    <h2>${resultMsg}</h2>
    <h1>
        &nbsp;&nbsp;
        <button><a href="register">Add Employee</a></button>
        <button><a href="./">Home</a></button>
    </h1>
</div>