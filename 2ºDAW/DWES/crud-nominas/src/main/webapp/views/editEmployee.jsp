<%@ page import="crud.nominas.model.Employee" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Employee</title>
    <link rel="stylesheet" type="text/css" href="css/styleEditEmployee.css"/>
</head>
<body>
<h1>Edit an Employee!</h1>
<form action="empresa" method="POST">
    <%
        Employee employee = (Employee) request.getAttribute("Employee");
    %>
    <input type="hidden" name="option" value="edit"/>
    <input type="hidden" name="dni" value="<%= employee.getDni() %>"/>
    <table>
        <tr>
            <td>Name:</td>
            <td>
                <input
                        value="<%= employee.getName() %>"
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
                    <option value="M" <%= "M".equals(employee.getGender()) ? "selected" : "" %>>M</option>
                    <option value="F" <%= "F".equals(employee.getGender()) ? "selected" : "" %>>F</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Category:</td>
            <td>
                <input
                        value="<%= employee.getCategory() %>"
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
                        value="<%= employee.getWorkYears() %>"
                        type="number"
                        name="workingYears"
                        min="0"
                        title="Only numbers are allowed"
                />
            </td>
        </tr>
    </table>
    <span><input type="submit" value="Save"/></span>
    <% if (session.getAttribute("error") != null) { %>
    <p style="color: #293242; border: 4px solid #293242; border-radius: 5px; padding:3px"><%=session.getAttribute("error") %>
    </p>
    <% session.removeAttribute("error");
    }%>
    <p><a href="index.jsp"> Cancel modification </a></p>
    <p><a href="javascript:history.back()">Previous page</a></p>
</form>
</body>
</html>