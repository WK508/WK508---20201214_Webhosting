<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Include 처리</title>
</head>
<body>
   <%@ include file = "Top.jsp" %>
   <h2>메인 영역 : Top, Bottom 영역 불러오기</h2>
   <%@ include file = "Bottom.jsp" %>
</body>
</html>