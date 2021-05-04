<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
request.setAttribute("pageName","MyPage");
%>

<!DOCTYPE html>
<html>
<head>

<jsp:include page="../commonMeta.jsp" />
<title>MyPage</title>
</head>
<body>
	<jsp:include page="./member_header.jsp" />


	<div class="flex-card">
		<section class="card">
			<h1 class="card-title">Java 入門講座</h1>
						<div class="card-img">
				<img class="mb-4" src="img/smart_display_black_24dp.svg">
				</div>
			<div class="card-content">

				<p class="card-text">Java Silver 対策講座です。</p>
			</div>
			<div class="card-link">
				<a href="LectureServlet?lecNo=lecture01">About</a>
			</div>
		</section>

		<section class="card">
			<h1 class="card-title">Java 問題集</h1>

			<div class="card-img">
				<img class="mb-4" src="img/sticky_note_2_black_24dp.svg">
			</div>
			<div class="card-content">

				<p class="card-text">Java Silver 対策問題集です。</p>
			</div>
			<div class="card-link">
				<a href="#">About</a>
			</div>
		</section>

	</div>

</body>
</html>