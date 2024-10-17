<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employees</title>
</head>
<body>
<h1>All employees in DataBase</h1>
<table border="1">
    <tr>
        <td>DNI</td>
        <td>Name</td>
        <td>Gender</td>
        <td>Category</td>
        <td>Working Years</td>
        <td>Salary</td>
    </tr>

    <c:forEach var="employee" items="${EmployeeList}">
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

<p><a href="index.jsp">Volver al inicio</a></p>
</body>
</html>