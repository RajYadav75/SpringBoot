<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color:blue;text-align:center">Employee registration Form </h1>

<form:form modelAttribute="emp">
  <table border="0" bgcolor="cyan" align="center">
    <tr>
      <td>Employee Name :: </td>
      <td><form:input path="ename"/></td>
    </tr>
    <tr>
      <td>Employee Job :: </td>
      <td><form:input path="job"/></td>
    </tr>
    <tr>
      <td>Employee Salary :: </td>
      <td><form:input path="sal"/></td>
    </tr>
    <tr>
      <td><input type="submit"  value="Register"></td>
    </tr>
  </table>
</form:form>