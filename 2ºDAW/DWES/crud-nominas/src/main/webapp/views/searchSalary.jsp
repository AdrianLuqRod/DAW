<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Find a Salary by ID!</title>
</head>
<body>
<form action="empresa" method="POST">
  <input type="hidden" name="option" value="searchSalary"/>
  <label for="dni">DNI:</label>
  <input type="text" name="dni" id="dni"/>
  <span><input type="submit" value="Buscar"/></span>

  <table>
    <tr>
      <td>DNI</td>
      <td>Name</td>
      <td>Gender</td>
      <td>Category</td>
      <td>Working Years</td>
      <td>Salary</td>
    </tr>
    <c:forEach var="employee" items="${Employee}">
      <tr>
        <td><c:out value="${employee.dni}"></c:out></td>
        <td><c:out value="${employee.name}"></c:out></td>
        <td><c:out value="${employee.gender}"></c:out></td>
        <td><c:out value="${employee.category}"></c:out></td>
        <td><c:out value="${employee.workYears}"></c:out></td>
        <td><c:out value="${employee.salary}"></c:out></td>
      </tr>
    </c:forEach>
  </table>
  <% if(session.getAttribute("error2") != null) { %>
  <p><%=session.getAttribute("error2")%>
  </p>
  <% }
    session.removeAttribute("error2"); %>
</form>
<p><a href="index.jsp">Back to index</a></p>
</body>
</html>