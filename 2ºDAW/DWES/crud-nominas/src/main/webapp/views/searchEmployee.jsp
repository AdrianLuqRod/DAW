<%--
  Created by IntelliJ IDEA.
  User: laray
  Date: 17/10/2024
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search Employee</title>
    <link rel="stylesheet" href="css/styleSearchEmployee.css"/>
</head>
<body>
<h1>Search Employees with ANY information!</h1>
<form action="empresa" method="POST">
    <input type="hidden" name="option" value="searchEmployee"/>

    <table>
        <tr>
            <label for="dni">DNI:</label>
            <input type="text" name="dni" id="dni"/>
        </tr>
        <tr>
            <label for="name">Name:</label>
            <input type="text" name="name" id="name" pattern="[A-Za-z\s]+" title="Only letters are allowed"/>
        </tr>
        <tr>
            <label for="gender">Gender:</label>
            <select name="gender" id="gender">
                <option value="">M & F</option>
                <option value="M">M</option>
                <option value="F">F</option>
            </select>
        </tr>
        <tr>
            <label for="category">Category:</label>
            <input type="number" name="category" id="category" min="1" max="10"
                   title="Only numbers between 1 and 10 are allowed"/>
        </tr>
        <tr>
            <label for="workingYears">Working Years:</label>
            <input type="number" name="workingYears" id="workingYears" min="0" title="Only numbers are allowed"/>
        </tr>
    </table>
    <span><input type="submit" value="Search"/></span>
    <table>
        <tr>
            <td>EXTRA</td>
            <td>DNI</td>
            <td>Name</td>
            <td>Gender</td>
            <td>Category</td>
            <td>Working Years</td>
            <td>Salary</td>
            <td>EXTRA</td>
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
                <td><c:out value="${employee.salary}€"></c:out></td>
                <td>
                    <button><a href="empresa?option=deleteEmployee&dni=<c:out value="${ employee.dni}"></c:out>">
                        Delete
                    </a>
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>

<p><a href="index.jsp">Back to index</a></p>
<p><a href="javascript:history.back()">Previous page</a></p>
</body>
</html>