<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 29-03-2025
  Time: 23:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<frm:form action="register" method="post" modelAttribute="stud">
    <table border="0" bgcolor="#00ffff" align="center">
        <tr>
            <td>Student ID: </td>
            <td><frm:input path="id"/></td>
        </tr>
        <tr>
            <td>Student Name: </td>
            <td><frm:input path="name"/></td>
        </tr>
        <tr>
            <td>Student Email: </td>
            <td><frm:input path="email"/></td>
        </tr>
        <tr>
            <td>Student Gender: </td>
            <td><frm:input path="gender"/></td>
        </tr>
        <tr>
            <td>Student Addresh: </td>
            <td><frm:textarea path="address" placeholder="Enter Full Address"/></td>
        </tr>
        <tr>
            <td>Student Average: </td>
            <td><frm:input path="average"/></td>
        </tr>

        <td>
            <input type="submit" value="Register"/>
        </td>
        <td>
            <input type="reset" value="Cancel"/>
        </td>

    </table>
</frm:form>
</body>
</html>
