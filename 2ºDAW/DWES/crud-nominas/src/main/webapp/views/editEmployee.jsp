<%--
  Created by IntelliJ IDEA.
  User: laray
  Date: 19/10/2024
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Employee</title>
    <link rel="stylesheet" type="text/css" href="css/styleEditEmployee.css"/>
</head>
<body>
<h1>Edit an Employee!</h1>
<form action="empresa" method="POST">
    <c:set var="employee" value="${Employee}"></c:set>
    <input type="hidden" name="option" value="edit"/>
    <input type="hidden" name="dni" value="${employee.dni}"/>
    <table>
        <tr>
            <td>Name:</td>
            <td>
                <input
                        value="${employee.name}"
                        type="text"
                        name="name"
                        pattern="[A-Za-z\s]+"
                        title="Only letters are allowed"
                />
            </td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td>
                <select name="gender" id="gender">
                    <option value="M" ${employee.gender == 'M' ? 'selected' : ''}>M</option>
                    <option value="F" ${employee.gender == 'F' ? 'selected' : ''}>F</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Category:</td>
            <td>
                <input
                        value="${employee.category}"
                        type="number"
                        name="category"
                        min="1"
                        max="10"
                        title="Only numbers between 1 and 10 are allowed"
                />
            </td>
        </tr>
        <tr>
            <td>Working Years:</td>
            <td>
                <input
                        value="${employee.workYears}"
                        type="number"
                        name="workingYears"
                        min="0"
                        title="Only numbers are allowed"
                />
            </td>
        </tr>

    </table>
    <span><input type="submit" value="Save"/></span>
    <% if(session.getAttribute("error") != null) { %>
    <p><%=session.getAttribute("error") %>
    </p>
    <% session.removeAttribute("error");
    }%>
    <p><a href="index.jsp"> Cancelar modificacion </a></p>
</form>
</body>
</html>