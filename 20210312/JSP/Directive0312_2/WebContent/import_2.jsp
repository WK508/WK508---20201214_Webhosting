<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.Timestamp" %>
    <%@ page import = "java.util.Date" %>
    <%@ page import = "java.text.SimpleDateFormat" %>
    <%@ page info = "Copyright by Si Bel Homme" %>
    <%@ page session ="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜와 실시간</title>
</head>
<body>
   <h1>날짜와 실시간</h1>
   
   <%
      Timestamp now = new Timestamp(System.currentTimeMillis());
      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
      String strDate = format.format(now);
      
      Date nowTime = new Date();
      SimpleDateFormat date = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
   %>
   
   <h1>오늘은 <%=strDate %> 입니다.</h1>
   <h1>현재 날짜와 시간은 <%=date.format(nowTime) %> 입니다.</h1>
   <h1>저작자 : <%=getServletInfo() %></h1>
</body>
</html>