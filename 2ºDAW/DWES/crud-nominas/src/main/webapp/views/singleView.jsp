<%@ page import="crud.nominas.model.Employee" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: laray
  Date: 19/11/2024
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EmployeeDashboard</title>
</head>
<body>
<%
    String action = (String) request.getAttribute("option");
    if ("create".equals(action)) {
%>
<link rel="stylesheet" href="css/styleAddEmployee.css"/>
<h1>Make an Employee!</h1>
<form action="empresa" method="POST">
    <input type="hidden" name="option" value="save"/>
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
    <span><input type="submit" value="Save"/></span>
    <% if (session.getAttribute("error") != null) { %>
    <p style="color: #293242; border: 4px solid #293242; border-radius: 5px; padding:3px"><%=session.getAttribute("error")%>
    </p>
    <% }
        session.removeAttribute("error"); %>
</form>
<p><a href="index.jsp">Back to index</a></p>
<p><a href="javascript:history.back()">Previous page</a></p>
<%
}
else if ("listing".equals(action)) {
%>
<link rel="stylesheet" href="css/styleAllEmployee.css"/>
<h1>All employees in DataBase</h1>
<table border="1">
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
    <%
        List<Employee> employeeList = (List<Employee>) request.getAttribute("EmployeeList");
        if (employeeList != null) {
            for (Employee employee : employeeList) {
    %>
    <tr>
        <td>
            <button><a href="empresa?option=editEmployee&dni=<%= employee.getDni() %>">
                Customize
            </a>
            </button>
        </td>
        <td><%= employee.getDni() %>
        </td>
        <td><%= employee.getName() %>
        </td>
        <td><%= employee.getGender() %>
        </td>
        <td><%= employee.getCategory() %>
        </td>
        <td><%= employee.getWorkYears() %>
        </td>
        <td><%= employee.getSalary() %>€</td>
        <td>
            <button><a href="empresa?option=deleteEmployee&dni=<%= employee.getDni() %>">
                Delete
            </a>
            </button>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>
<% if (session.getAttribute("error") != null) { %>
<p style="color: #293242; border: 4px solid #293242; border-radius: 5px; padding:3px"><%= session.getAttribute("error") %>
</p>
<%
        session.removeAttribute("error");
    }
    if (session.getAttribute("error4") != null) { %>
<p style="color: #293242; border: 4px solid #293242; border-radius: 5px; padding:3px"><%= session.getAttribute("error4") %>
</p>
<%
        session.removeAttribute("error4");
    }
%>
<p><a href="index.jsp">Back to index</a></p>
<p><a href="javascript:history.back()">Previous page</a></p>
<%
}
else if ("salary".equals(action)) {
%>
<link rel="stylesheet" href="css/styleSearchSalary.css"/>
<%--Aqui va lo del jsp--%>
<%
}
else if ("search".equals(action)) {
%>
<link rel="stylesheet" href="css/styleSearchEmployee.css"/>
<%--Aqui va lo del jsp--%>
<%
    }
%>
</body>
</html>