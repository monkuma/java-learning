<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
request.setAttribute("pageName","About");
%>

<!DOCTYPE html>
<html lang="jp">
<head>
<jsp:include page="../commonMeta.jsp" />

	<title>トップページ</title>
</head>
<body>

<jsp:include page="./public_header.jsp" />


	<div class="flex-card">
		<section class="card">
			<div class="card-content">

				<p class="card-text">このサイトではJava Silver試験対策の講座と問題集を提供しています。<br>ぜひ、会員登録して利用してください。</p>
			</div>
			<div class="card-link">
				<a href="RegisterServlet">会員登録する</a>
			</div>
		</section>

	</div>



<jsp:include page="./public_footer.jsp" />


</body>
</html>