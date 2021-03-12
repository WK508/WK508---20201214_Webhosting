<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--
         선언문(declaration) : <%! %> - 전역변수 선언, 메소드 선언
         스크립틀릿(scriptlet) : <% %> - 지역변수, 일반 루틴
         표현식(expression) : <%= %> - 화면출력(변수, 메소드 호출)
     --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
       String str2 = "니취팔러마";
    %>
    <%!
       String str = "전역 변수";
    %>
    
    <%!
       public String getStr() {
    	 return str;
    }
    %>
    <!--<h1>전역변수 : <%=str %></h1>-->
    <%--<h1>메소드 호출 : <%=getStr() %></h1>--%>
    <h1><%=str2 %></h1>
</body>
</html>