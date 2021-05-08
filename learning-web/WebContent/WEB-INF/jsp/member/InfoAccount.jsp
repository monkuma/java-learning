<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    		<%
request.setAttribute("pageName","アカウント情報");
%>
<!DOCTYPE html>
<html>
<head>

<jsp:include page="../commonMeta.jsp" />
<title>アカウント情報</title>
</head>
<body>

	<jsp:include page="./member_header.jsp" />

<div class="account-table-area">
<table class="account-table">
<tr><th>ユーザーネーム</th><td>${name}</td></tr>
<tr><th>メールアドレス</th><td>${mail}</td></tr>
<tr><th>パスワード</th><td>*******</td></tr>
</table>
</div>

<div class="account-config-area">
<a href="EditAccountServlet">アカウントの編集(準備中)</a>

</div>


</body>
</html>