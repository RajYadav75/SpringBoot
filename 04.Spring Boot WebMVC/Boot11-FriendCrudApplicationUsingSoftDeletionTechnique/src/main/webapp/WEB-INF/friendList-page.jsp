<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 13-04-2025
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
    table{
        border-collapse: collapse;
        font-size: large;
        color: blue;
        font-family: "Times New Roman", serif;
    }
    th{
        color: red;
        padding: 5px;
        border: 1px solid blue;
    }
    td{
        color: blue;
        padding: 5px;
        border: 1px solid blue;
    }
</style>
<h1 style="text-align: center;color: darkred">Here Are All Friends List</h1>
<c:choose>
    <c:when test="${!empty frdList}">
        <table >
            <thead>
                <tr>
                    <th>Friend Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Address</th>
                    <th>Operations</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dost" items="${frdList}">
                    <tr>
                        <td>${dost.id}</td>
                        <td>${dost.firstName}</td>
                        <td>${dost.lastName}</td>
                        <td>${dost.email}</td>
                        <td>${dost.phone}</td>
                        <td>${dost.address}</td>
                        <td>
                            <a href="edit?id=${dost.id}">Edit</a>
                            <a href="delete-friend?id=${dost.id}" onclick="return confirm('are sure to delete the record?')">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            <tr>
                <td>
                    <a href="./">Home Page</a>
                    <a href="register">Add Friend</a>
                </td>
            </tr>
            </tbody>
        </table>
    </c:when>
    <c:otherwise>
        <h4>You are very bad Person Because You have not any Friend </h4>
    </c:otherwise>

</c:choose>