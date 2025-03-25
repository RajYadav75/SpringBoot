<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 25-03-2025
  Time: 08:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center; color: red">Student Registration Form</h1>
<form action="register" method="post">
   <%--<table align="center" bgcolor="#008b8b">
     <tr>
       <td>First Name</td>
       <td></td>
     </tr>

   </table>--%>
  <label for="sno">Student Number :: </label>
  <input type="number" id="sno" name="id"><br>


  <label for="sname">Student Name :: </label>
  <input type="text" id="sname" name="name"><br>

  <label for="saddr">Student Address :: </label>
  <input type="text" id="saddr" name="address"><br>

  <label for="sage">Student Age :: </label>
  <input type="number" id="sage" name="age"><br>

  <label for="sgen">Student Gender :: </label>
  <input type="text" id="sgen" name="gender"><br>

  <button type="submit">Register</button>
</form>

</body>
</html>
