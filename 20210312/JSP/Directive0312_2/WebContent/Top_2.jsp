<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.Timestamp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Top</title>
</head>
<body>
    <%
       Timestamp now = new Timestamp(System.currentTimeMillis());
    %>
    <h1>Top 파일입니다.</h1>
    <h1><%=now.toString() %></h1>
</body>
</html>