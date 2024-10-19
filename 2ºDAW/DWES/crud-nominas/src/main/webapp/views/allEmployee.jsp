<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employees</title>
    <link rel="stylesheet" href="css/styleAllEmployee.css"/>
</head>
<body>
<h1>All employees in DataBase</h1>
<table border="1">
    <tr>

        <td>Accion1</td>
        <td>DNI</td>
        <td>Name</td>
        <td>Gender</td>
        <td>Category</td>
        <td>Working Years</td>
        <td>Salary</td>
        <td>Accion2</td>
    </tr>

    <c:forEach var="employee" items="${EmployeeList}">
        <tr>
            <td>
                <button><a href="empresa?option=editEmployee&dni=<c:out value="${ employee.dni}"></c:out>">
                    Customize
                </a>
                </button>
            </td>
            <td><c:out value="${employee.dni}"></c:out></td>
            <td><c:out value="${employee.name}"></c:out></td>
            <td><c:out value="${employee.gender}"></c:out></td>
            <td><c:out value="${employee.category}"></c:out></td>
            <td><c:out value="${employee.workYears}"></c:out></td>
            <td><c:out value="${employee.salary}"></c:out></td>
            <td>
                <button><a href="empresa?option=deleteEmployee&dni=<c:out value="${ employee.dni}"></c:out>">
                    Delete
                </a>
                </button>
            </td>
        </tr>
    </c:forEach>
</table>
<% if(session.getAttribute("error4") != null) { %>
<p><%=session.getAttribute("error4")%>
</p>
<% }
    session.removeAttribute("error4"); %>
<p><a href="index.jsp">Back to index</a></p>
</body>
</html>