<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Entering new item</title>
<%
	session.setAttribute("choice", "insert");
%>
</head>
<body>
	<form action="TestServlet" method="post">
		<label for="name">Name:</label> <input type="text" name="name">
		<br> <label for="desc">Description:</label> <br>
		<textarea name="desc" rows="4" cols="50"
			placeholder="Enter description"></textarea>
		<br> <label for="yesorno">Availability:</label><br> Yes <input
			type="radio" name="yesorno" value="true"> No <input
			type="radio" name="yesorno" value="false"> <br> <input
			type="submit" name="submit" value="Submit">
	</form>
</body>
</html>