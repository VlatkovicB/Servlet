<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.data.Item"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="refresh" content="5;URL=index.jsp;"
	content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
	<jsp:useBean id="item" class="com.data.Item" scope="session"></jsp:useBean>


	Added <jsp:getProperty property="name" name="item"/>
	<%=item.getName()%>, with an ID=<%=item.getId()%>
	which is<%=item.available()%>.
</body>
</html>