<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="crud.nominas.model.Employee" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Find a Salary by DNI!</title>
    <link rel="stylesheet" href="css/styleSearchSalary.css"/>
</head>
<body>
<h1>Find any Salary bounded to DNI!</h1>
<form action="empresa" method="POST">
    <input type="hidden" name="option" value="searchSalary"/>
    <label for="dni">DNI:</label>
    <input type="text" name="dni" id="dni"/>
    <span><input type="submit" value="Buscar"/></span>

    <table>
        <tr>
            <td>DNI</td>
            <td>Salary</td>
        </tr>
        <%
            List<Employee> employeeList = (List<Employee>) session.getAttribute("Employee");
            if (employeeList != null) {
                for (Employee employee : employeeList) {
        %>
        <tr>
            <td><%= employee.getDni() %>
            </td>
            <td><%= employee.getSalary() %>€</td>
        </tr>
        <%
                }
            }
        %>
    </table>
    <% if (session.getAttribute("error2") != null) { %>
    <p style="color: #293242; border: 4px solid #293242; border-radius: 5px; padding:3px"><%=session.getAttribute("error2")%>
    </p>
    <% }
        session.removeAttribute("error");
        session.removeAttribute("error2"); %>
</form>
<p><a href="index.jsp">Back to index</a></p>
<p><a href="javascript:history.back()">Previous page</a></p>
</body>
</html>