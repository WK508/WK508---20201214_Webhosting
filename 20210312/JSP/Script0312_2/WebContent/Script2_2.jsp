<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
        int num = 1988;
        public int sum(int n1, int n2) {
        	return n1 + n2;
        }
        
        public int mul(int n1, int n2) {
        	return n1 * n2;
        }
    %>
    
    <% int num = 2020; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>덧셈, 곱셈</title>
</head>
<body>
    <div><h1>덧셈 결과 : <%=sum(1988, 2020) %></h1></div>
    <div><h1>곱셈 결과 : <%=mul(1988, 2020) %></h1></div>
    <div>this.num : <%=this.num %></div>
    <div>num : <%=num %></div>
</body>
</html>