<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ListarSalario</title>
</head>
<body>
<form action="empleados" method="post" class="tablaCrear">
    <input type="hidden" name="opcion" value="buscarSalario">
    <table border="0">
        <tr>
            <td>DNI:</td>
            <td><input type="text" name="dni" size="50"></td>
        </tr>
    </table>
    <span><input type="submit" value="Guardar"></span>
    <%
        if(session.getAttribute("error") != null) {
    %>
    <p>
        <%=session.getAttribute("error")%>

    </p>
    <%
        session.removeAttribute("error");
    }%>

    <p><a href="index.jsp">
        Volver al inicio
    </a></p>
</form>
</body>
</html>