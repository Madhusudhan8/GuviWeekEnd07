<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Add Book</title>
</head>
<body>
	<h1>Add Book</h1>
	<form action="add-book" method="post">
		<label for="title">Title:</label>
		<input type="text" id="title" name="title"><br>
		
		<label for="author">Author:</label>
		<input type="text" id="author" name="author"><br>
		
		<label for="isbn">ISBN:</label>
		<input type="text" id="isbn" name="isbn"><br>
		
		<label for="publisher">Publisher:</label>
		<input type="text" id="publisher" name="publisher"><br>
		
		<input type="submit" value="Add Book">
	</form>
</body>
</html>
