<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Librarian Dashboard</title>
</head>
<body>
    <h1>Librarian Dashboard</h1>
    <table>
        <thead>
            <tr>
                <th>Title</th>
                <th>Author</th>
                <th>ISBN</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td>${book.isbn}</td>
                    <td>
                        <form action="LibrarianDashboardServlet" method="post">
                            <input type="hidden" name="isbn" value="${book.isbn}">
                            <button name="action" value="edit">Edit</button>
                            <button name="action" value="delete">Delete</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <form action="add-book.jsp">
        <button>Add Book</button>
    </form>
    <br>
    <form action="issue-book.jsp">
        <button>Issue Book</button>
    </form>
    <br>
    <form action="return-book.jsp">
        <button>Return Book</button>
    </form>
    <br>
    <form action="LogoutServlet">
        <button>Logout</button>
    </form>
</body>
</html>
