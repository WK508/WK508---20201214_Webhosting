<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include 처리</title>
</head>
<body>
    <%@ include file = "Top_2.jsp" %>
    <h1>메인 영역 : Top, Bottom 영역 불러오기</h1>
    <%@ include file = "Bottom_2.jsp" %>
</body>
</html>