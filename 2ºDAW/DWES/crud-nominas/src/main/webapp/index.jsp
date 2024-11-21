<%@ page import="crud.nominas.model.Employee" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>BUSINESS CRUD</title>
</head>
<body>
<%
    String action = request.getParameter("option");
    if(action == null) {
    %>
    <link rel="stylesheet" href="css/styleIndex.css"/>
<h1>BUSINESS MENU
</h1>
<br/>
<a href="empresa?option=create">Create Employee</a>
<a href="empresa?option=listing">List Employees</a>
<a href="empresa?option=salary">Search Salary</a>
<a href="empresa?option=search">Search Employee</a>
<%
    }
%>
<%
    if("create".equals(action)) {
%>
<jsp:include page="views/addEmployee.jsp"/>
<%
} else if("listing".equals(action)) {
%>
<jsp:include page="views/allEmployee.jsp"/>
<%
} else if("salary".equals(action)) {
%>
<jsp:include page="views/searchSalary.jsp"/>
<%
} else if("search".equals(action)) {
%>
<jsp:include page="views/searchEmployee.jsp"/>
<%
    } else if("editEmployee".equals(action)) {
%>
<jsp:include page="views/editEmployee.jsp"/>
<%
    }
%>

</body>

</html>