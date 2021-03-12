<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--
         선언문(declaration) : <%! %> - 전역변수 선언, 메소드 선언
         표현식(expression) : <%= %> - 화면출력(변수, 메소드 호출)
         스크립틀릿(scriptlet) : <% %> - 지역변수, 일반 루틴
     --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언문, 표현식, 스크립틀릿</title>
</head>
<body>
    <%
       String str2 = "LA 다저스 vs 탬파베이 레이스";
    %>
    
    <%!
       String str = "116번째 월드시리즈";
    %>
    
    <%!
        public String getStr() {
    	   return str;
    }
    %>
    
    <h1>월드시리즈 : <%=str %></h1>
    <h1>몇 번째 월드시리즈인가? : <%=getStr() %></h1>
    <h1><%=str2 %></h1>
</body>
</html>