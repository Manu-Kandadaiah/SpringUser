<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%> 
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mj.project.userdb.entity.User"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List User</title>
</head>
<body>

<% List<User> users=(List<User>)request.getAttribute("key"); %>

<table border="2px" cellpadding="2px" cellspacing="0px">

<tr>
	
	<th>UserName</th>
	<th>Email</th>
	<th>FirstName</th>
	<th>LastName</th>
	
	
</tr>

<%for(User user: users) {%>

<tr align="center">
			<td><%=user.getUserName()%></td>
			<td><%=user.getEmail()%></td>
			<td><%=user.getFirstName()%></td>
			<td><%=user.getLastName()%></td>
			
		</tr>
		<%
		}
		%>

</table>

<h3><a href="findUser.jsp"> Find  User</a></h3>
</body>
</html>