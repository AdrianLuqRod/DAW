<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <title>Crear Producto</title>
    <link rel="stylesheet" href="css/styleCrear.css"/>
</head>
<body>
<h1>Crear Producto</h1>
<form action="productos" method="post">
    <input type="hidden" name="opcion" value="guardar"/>
    <table border="0">
        <tr>
            <td>Nombre:</td>
            <td><input type="text" name="nombre" size="50"/></td>
        </tr>
        <tr>
            <td>Cantidad:</td>
            <td>
                <input
                        type="text"
                        name="cantidad"
                        size="50"
                        pattern="\d+"
                        title="Solo numeros enteros"
                />
            </td>
        </tr>
        <tr>
            <td>Precio:</td>
            <td>
                <input
                        type="text"
                        name="precio"
                        size="50"
                        pattern="\d+(\.\d{1,2})?"
                        title="Solo numeros con 2 decimales maximo"
                />
            </td>
        </tr>
    </table>
    <span><input type="submit" value="Guardar"/></span>
    <% if(session.getAttribute("error") != null) { %>
    <p><%=session.getAttribute("error")%>
    </p>
    <% }
        session.removeAttribute("error"); %>

    <p><a href="index.jsp"> Volver al inicio </a></p>
</form>
</body>
</html>