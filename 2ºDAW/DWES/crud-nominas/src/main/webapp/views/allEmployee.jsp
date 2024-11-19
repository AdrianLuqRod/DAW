<%@ page import="crud.nominas.model.Employee" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees</title>
    <link rel="stylesheet" href="css/styleAllEmployee.css"/>
</head>
<body>
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
</body>
</html>