<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Admin Dashboard</title>
  <style>
    table {
      border-collapse: collapse;
    }

    th, td {
      border: 1px solid black;
      padding: 5px;
    }

    th {
      background-color: lightgray;
    }
  </style>
</head>
<body>
  <h1>Admin Dashboard</h1>
  <table>
    <tr>
      <th>Name</th>
      <th>Email</th>
    </tr>
    <c:forEach var="librarian" items="${librarians}">
      <tr>
        <td>${librarian.name}</td>
        <td>${librarian.email}</td>
      </tr>
    </c:forEach>
  </table>
  <br>
  <form action="AdminDashboardServlet" method="post">
    <input type="hidden" name="action" value="addLibrarian">
    <button type="submit">Add Librarian</button>
  </form>
  <br>
  <form action="AdminDashboardServlet" method="post">
    <input type="hidden" name="action" value="logout">
    <button type="submit">Logout</button>
  </form>
</body>
</html>
