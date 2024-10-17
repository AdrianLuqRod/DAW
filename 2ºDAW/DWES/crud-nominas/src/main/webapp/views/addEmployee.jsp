<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EmployeeMaker</title>
</head>
<body>
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
            <input type="text" name="name" id="name"/>
        </tr>
        <tr>
            <label for="gender">Gender:</label>
            <input type="text" name="gender" id="gender"/>
        </tr>
        <tr>
            <label for="category">Category:</label>
            <input type="text" name="category" id="category"/>
        </tr>
        <tr>
            <label for="workingYears">Working Years:</label>
            <input type="text" name="workingYears" id="workingYears"/>
        </tr>

    </table>
    <span><input type="submit" value="Save"/></span>
    <% if(session.getAttribute("error") != null) { %>
    <p><%=session.getAttribute("error")%>
    </p>
    <% }
        session.removeAttribute("error"); %>
</form>
<p><a href="index.jsp">Volver al inicio</a></p>
</body>
</html>