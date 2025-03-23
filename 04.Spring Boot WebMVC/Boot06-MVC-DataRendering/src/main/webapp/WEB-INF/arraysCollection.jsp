<%--
  Created by IntelliJ IDEA.
  User: Raj Yadav
  Date: 23-03-2025
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" import="java.util.*" %>
<html>
<head>
    <title>Title</title>
  <style>
    h3{
      color: red;
      text-align: center;
    }
    h1{
      text-align: center;
      color: blue;
    }
  </style>
</head>
<body>
<h3 >Passing Arrays, Set, Map, List in View Component</h3>
<h2>
  Model Attributes data is :
</h2>
<p>favorite color is :: <%=Arrays.toString(((String[])request.getAttribute("favColors")))%></p>
<p>nicks Name are :: ${nickNames}</p>
<p>phono Number are :: ${phoneNo}</p>
<p>Id Details are :: ${idDetails}</p>

<h1 >But this technique is not good for view component</h1>

<h3>Writing Java Code in JSP Pages is not Good Practice So Use JSTL tags and EL together to avoid or minimize the java code.</h3>
<br>

<h1>Add JSTL dependency in POM.XML And import JSTL core library in JSP page and Use it tags</h1>
<pre>
  <<depedency>>
    <<groupId>javax.servlet</groupId>>
    <<artifactId>jstl</artifactId>>
    <<version>1.2</version>>
  <</depedency>>
</pre>
</body>
</html>
