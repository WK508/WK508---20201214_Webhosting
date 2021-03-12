<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import = "java.sql.Timestamp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Top</title>
</head>
<body>
   <%
      Timestamp now = new Timestamp(System.currentTimeMillis());
   %>
   <h1>Top 파일입니다.</h1>
   <h2><%= now.toString() %></h2>
</body>
</html>