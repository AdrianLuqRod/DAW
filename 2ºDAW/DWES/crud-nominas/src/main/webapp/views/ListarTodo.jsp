<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listar todo</title>
</head>
<body>
<h1>Lista de Empleados</h1>
<table>
    <tr>
        <th>DNI</th>
        <th>Nombre</th>
        <th>Edad</th>
        <th>Sexo</th>
        <th>Categoria</th>
        <th>Años Trabajados</th>
    </tr>
    <c:forEach var="empleado" items="${lista}">
        <tr>
            <td><c:out value="${empleado.dni}"></c:out></td>
            <td><c:out value="${empleado.nombre}"></c:out></td>
            <td><c:out value="${empleado.edad}"></c:out></td>
            <td><c:out value="${empleado.sexo}"></c:out></td>
            <td><c:out value="${empleado.categoria}"></c:out></td>
            <td><c:out value="${empleado.anyos}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>