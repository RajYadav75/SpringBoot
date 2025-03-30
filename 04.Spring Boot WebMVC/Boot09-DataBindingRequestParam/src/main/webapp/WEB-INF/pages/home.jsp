<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 30-03-2025
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 style="text-align: center; color: blue">You Have To Search Like This :: </h1>
<h1 style="text-align: center; color: green">http://localhost:8080/data?sno=1&sname=RajYadav</h1>
<h1 style="color: red; border: 2px solid black; position: absolute">Data is  ::  ${param.sno} , ${param.sname}</h1>
</body>
</html>
