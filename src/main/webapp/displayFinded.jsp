<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%> 
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mj.project.userdb.entity.User"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% List<User> users=(List<User>)request.getAttribute("key1"); %>

<table border="2px" cellpadding="2px" cellspacing="0px">

<tr>
	
	<th>UserName</th>
	<th>Email</th>
	<th>FirstName</th>
	<th>LastName</th>
	
	
</tr>

<%for(User students: users) {%>

<tr align="center">
			<td><%=students.getUserName()%></td>
			<td><%=students.getEmail()%></td>
			<td><%=students.getFirstName()%></td>
			<td><%=students.getLastName()%></td>
			
		</tr>
		<%
		}
		%>

</table>

</body>
</html>