<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Entry</title>
<%
	session.setAttribute("choice", "updateChoice");
%>
</head>
<body>
	<form action="TestServlet" method="post">

		<label for="id"> Enter an ID of an Item you'd like to update:</label><input
			type="number" name="id"> <input type="submit" name="submit">

	</form>
</body>
</html>