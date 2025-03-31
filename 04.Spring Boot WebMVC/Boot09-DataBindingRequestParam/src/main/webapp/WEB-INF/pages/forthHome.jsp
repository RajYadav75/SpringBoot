<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 31-03-2025
  Time: 00:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RequestparamNameEqualToHandlermethodParamName</title>
    <style>
        h1{
            text-align: center;
            color: red;
        }
    </style>
</head>
<body>
<h1>Taking Default Value for  @RequestParam annotation</h1>

<div>
    <h1>http://localhost:8080/forth?sid=12</h1>
</div>
<h1 style="color: red; border: 2px solid black; position: absolute">Data is  ::  ${param.no} , ${param.name}</h1>

</body>
</html>
