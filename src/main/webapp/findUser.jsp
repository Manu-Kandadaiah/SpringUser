<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%> 
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mj.project.userdb.entity.User"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find User</title>
</head>
<body>
<h1>Add User</h1>
    <form id="find-user" method="post">
       
        <label>User name: <input type="text" name="username" required></label><br>
        
        <button type="submit">Find </button>
    </form>


</body>
</html>