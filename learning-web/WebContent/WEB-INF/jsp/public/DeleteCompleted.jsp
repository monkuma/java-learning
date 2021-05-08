<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%
request.setAttribute("pageName","削除完了");
%>

<!DOCTYPE html>
<html>
<head>

<jsp:include page="../commonMeta.jsp" />
<title>アカウント削除完了</title>
</head>
<body>

	<jsp:include page="./public_header.jsp" />

	<div class="flex-card">
		<section class="card">
			<div class="card-content">
				<p class="card-text">アカウントの削除が完了しました。<br>またのご利用お待ちしております。</p>
			</div>
		</section>

	</div>


	<jsp:include page="./public_footer.jsp" />
</body>
</html>