<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	request.setAttribute("pageName", "アカウント削除");
%>
<!DOCTYPE html>
<html>
<head>

<jsp:include page="../commonMeta.jsp" />
<title>アカウント削除</title>
</head>
<body>
	<jsp:include page="./member_header.jsp" />

		<div class="edit-account-area">
		<div class="edit-account">

			<form class="login-form" action="DeleteAccountServlet" method="post">

				<h1 class="h3 mb-3 fw-normal">こちらのアカウントを削除します</h1>

				<label> E-Mail<input type="email" name="id" value="${mail}" readonly/></label>
				<label> Name<input type="text" name="name" value="${name}" readonly/></label>

				<button class="form-button" type="submit"><i class="fas fa-user-edit"></i> 削除する</button>

			</form>

		</div>
	</div>
</body>
</html>