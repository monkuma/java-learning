<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
request.setAttribute("pageName","404 Error");
%>

<!DOCTYPE html>
<html>
<head>

<jsp:include page="../commonMeta.jsp" /><title>404 Error</title>
</head>
<body>
<jsp:include page="../public/public_header.jsp" />
	<div class="flex-card">
		<section class="card">
			<div class="card-content">

				<p class="card-text">すみません、、エラーです。。。</p>
			</div>
			<div class="card-link">
				<a href="Main">トップへ</a>
			</div>
		</section>

	</div>




<jsp:include page="../public/public_footer.jsp" />
</body>
</html>