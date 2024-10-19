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
      <input type="text" name="name" id="name" pattern="[A-Za-z\s]+" title="Only letters are allowed"/>
    </tr>
    <tr>
      <label for="gender">Gender:</label>
      <select name="gender" id="gender">
        <option value="M">M</option>
        <option value="F">F</option>
      </select>
    </tr>
    <tr>
      <label for="category">Category:</label>
      <input type="number" name="category" id="category" min="1" max="10" title="Only numbers between 1 and 10 are allowed"/>
    </tr>
    <tr>
      <label for="workingYears">Working Years:</label>
      <input type="number" name="workingYears" id="workingYears" min="0" title="Only numbers are allowed"/>
    </tr>

  </table>
  <span><input type="submit" value="Save"/></span>
  <% if(session.getAttribute("error") != null) { %>
  <p><%=session.getAttribute("error")%>
  </p>
  <% }
    session.removeAttribute("error"); %>
</form>
<p><a href="index.jsp">Back to index</a></p>
</body>
</html>