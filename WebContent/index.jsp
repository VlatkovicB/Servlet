<%@ page language="java" contentType="text/html"%>
<%@ page import="com.data.Item"%>
<%@ page import="com.data.Data"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
<meta charset="utf-8">
<title>Home Page</title>
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
				<%
					for (Item item : Data.getList()) {
				%>
				<tr>
					<td><%=item.getId()%></td>
					<td><%=item.getName()%></td>
					<td><%=item.getDesc()%></td>
					<td><%=item.isAvailable()%></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
		<br>
		<hr>
		<br> <select name="choice">
			<option value="add">Add entry</option>
			<option value="delete">Delete</option>
			<option value="list">List all</option>
		</select> <input type="submit" name="submit" value="Submit">


	</form>
</body>

</html>