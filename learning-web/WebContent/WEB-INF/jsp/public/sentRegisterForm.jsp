<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setAttribute("pageName", "送信完了");
%>

<!DOCTYPE html>
<html>
<head>
<jsp:include page="../commonMeta.jsp" />
<title>登録フォームの送信完了</title>
</head>
<body>

	<jsp:include page="./public_header.jsp" />
	<div class="flex-card">
	<section class="card">
		<div class="card-content">
			<h1 class="card-title">登録フォームを送信しました！</h1>
			<p class="card-text">
				ご入力いただいたメールアドレス宛に、会員登録フォームを送信させていただきました。ご確認ください。
			</p>
		</div>
		<div class="card-link">

		</div>
	</section>

	</div>


	<jsp:include page="./public_footer.jsp" />
</body>
</html>