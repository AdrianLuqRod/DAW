<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Listar Productos</title>
</head>
<body>
<h1>Listar Productos</h1>
<table border="1">
    <tr>
        <td>Nombre</td>
        <td>Cantidad</td>
        <td>Precio</td>
        <td>Fecha Creacion</td>
        <td>Fecha Actualizacion</td>
        <td>Accion</td>
    </tr>
    <c:forEach var="producto" items="${lista}">
        <tr>
            <td><c:out value="${ producto.nombre}"></c:out></td>
            <td><c:out value="${ producto.cantidad}"></c:out></td>
            <td><c:out value="${ producto.precio}"></c:out></td>
            <td><c:out value="${ producto.fechaCrear}"></c:out></td>
            <td><c:out value="${ producto.fechaFormateada}"></c:out></td>
            <td>
                <a href="productos?opcion=eliminar&id=<c:out value="${ producto.id}"></c:out>">
                    Eliminar
                </a>
            </td>
            <td>
                <a href="productos?opcion=meditar&id=<c:out value="${ producto.id}"></c:out>">
                    Editar
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
<h1>Crear Producto</h1>
<form action="productos" method="post">
    <input type="hidden" name="opcion" value="guardar">
    <table border="1">
        <tr>
            <td>Nombre:</td>
            <td><input type="text" name="nombre" size="50"></td>
        </tr>
        <tr>
            <td>Cantidad:</td>
            <td><input type="text" name="cantidad" size="50" pattern="\d+" title="Solo números enteros"></td>
        </tr>
        <tr>
            <td>Precio:</td>
            <td><input type="text" name="precio" size="50" pattern="\d+(\.\d{1,2})?"
                       title="Solo números con 2 decimales máximo"></td>
        </tr>
    </table>
    <input type="submit" value="Guardar">
    <%
        if(session.getAttribute("error") != null) {
    %>
    <p>
        <%=session.getAttribute("error")%>

    </p>
    <%
        session.removeAttribute("error");
    } else if(session.getAttribute("exito") != null) {
    %>
    <p>
        <%=session.getAttribute("exito")%>
    </p>
    <%
            session.removeAttribute("exito");
        }
    %>

    <p><a href="index.jsp">
        Volver al inicio
    </a></p>
</form>
</body>
</html>