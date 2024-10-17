<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Añadir Empleado</title>
</head>
<body>
<form action="empresa" method="post">
    <input type="hidden" name="opcion" value="guardar">
    <table>
        <tr>
            <label for="dni">DNI:</label>
            <input type="text" name="dni" id="dni"/>
        </tr>
        <tr>
            <label for="name">Nombre:</label>
            <input type="text" name="name" id="name"/>
        </tr>
        <tr>
            <label for="categoria">Categoria:</label>
            <input type="text" name="categoria" id="categoria"/>
        </tr>
        <tr>
            <label for="anyos">Años Trabajados:</label>
            <input type="text" name="anyos" id="anyos"/>
        </tr>
        <tr>
            <label for="edad">Edad:</label>
            <input type="text" name="edad" id="edad"/>
        </tr>
        <tr>
            <label for="sexo">Sexo:</label>
            <input type="text" name="sexo" id="sexo"/>
        </tr>
    </table>
    <span><input type="submit" value="Guardar"/></span>
</form>
</body>
</html>