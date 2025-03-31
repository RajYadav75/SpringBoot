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
<h1>If Request Param Names are not  matching with Handler Method Param Name then We have to of giving special attribute in @RequestParam(required=false) annotation</h1>
<h1 style="color: red; border: 2px solid black; position: absolute">Data is  ::  ${param.sid} , ${param.sname}</h1>

<div>
    <h1>http://localhost:8080/tisra?sid=12&name=RajYadav</h1>
</div>
</body>
</html>
