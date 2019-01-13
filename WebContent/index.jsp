<%@ page language="java" contentType="text/html"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page import="com.data.Item"%>
<%@ page import="com.data.Data"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
<meta charset="utf-8">
<title>Home Page</title>
<%
	request.setAttribute("list", Data.getList());
%>
</head>

<body>
	<form action="TestServlet" method="get">
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Description</th>
					<th>Available</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="item">
					<tr>
						<td>${item.id}</td>
						<td>${item.name}</td>
						<td>${item.desc}</td>
						<td>${item.available}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
		<br>
		<p>${param.message}</p>
		<hr>
		<br> <select name="choice">
			<option value="add">Add entry</option>
			<option value="delete">Delete</option>
		</select> <input type="submit" name="submit" value="Submit">


	</form>
</body>

</html>