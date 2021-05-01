<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
request.setAttribute("pageName","Sorry...");
%>

<!DOCTYPE html>
<html lang="ja">
<head>
<jsp:include page="../commonMeta.jsp" />
<title>Insert title here</title>
</head>
<body>

		<jsp:include page="./public_header.jsp" />
		<div class="flex-card">
			<section class="card" style="width: 35%">
				<div class="card-content">
					<h1>すみません...エラーです...。</h1>
					<p class="card-text">もう一度最初からお願いします...</p>
				</div>
				<div class="card-link">
					<a href="Main">TOP</a>
				</div>
			</section>

		</div>

		<jsp:include page="./public_footer.jsp" />
</body>
</html>