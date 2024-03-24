<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Librarian Login</title>
</head>
<body>
  <h1>Librarian Login</h1>
  <form action="LibrarianLoginServlet" method="post">
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required><br><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>

    <button type="submit">Log In</button>
  </form>
</body>
</html>
