<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Account" %>
<%
String name = (String)session.getAttribute("name");
%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../commonMeta.jsp" />
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>登録が完了しました！</h1>
<h2><%= name %>さん</h2>

</div>




</body>
</html>