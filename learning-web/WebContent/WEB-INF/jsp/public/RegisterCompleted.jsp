<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setAttribute("pageName","ご登録ありがとうございます！");
%>

<!DOCTYPE html>
<html>
<head>
<jsp:include page="../commonMeta.jsp" />
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="./public_header.jsp" />
<div class="flex-card">
		<section class="card"  style="width:35%">
			<div class="card-content">
				<h1>ご登録ありがとうございます！</h1>
				<p class="card-text">会員登録完了しましたので下記のボタンをクリックして<br>ログインしましょう♪</p>
			</div>
			<div class="card-link">
				<a href="LoginServlet">LOGIN</a>
			</div>
		</section>

	</div>



	<jsp:include page="./public_footer.jsp" />
</body>
</html>