<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete an item</title>
<%
	session.setAttribute("choice", "delete");
%>
</head>
<body>
	<form action="TestServlet" method="post">

		<label for="id"> Enter an ID of an Item you'd like to remove:</label><input
			type="number" name="id"> <input type="submit" name="submit">


	</form>
</body>
</html>