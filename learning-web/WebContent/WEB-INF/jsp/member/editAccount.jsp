<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setAttribute("pageName", "アカウント編集");
%>
<!DOCTYPE html>
<html>
<head>

<jsp:include page="../commonMeta.jsp" />
<title>アカウント編集</title>
</head>
<body>
	<jsp:include page="./member_header.jsp" />
	<div class="edit-account-area">
		<div class="edit-account">

			<form class="login-form" action="EditAccountServlet" method="post">

				<h1 class="h3 mb-3 fw-normal">アカウントの編集</h1>

				<label> E-Mail<input type="email" name="id" value="${mail}" /></label>
				<label> Name<input type="text" name="name" value="${name}" />

				</label> Password<label> <input type="password" name="pass"
					placeholder="Password" /></label>

				<button class="form-button" type="submit">
					<i class="fas fa-user-edit"></i> 確認画面へ（準備中）
				</button>


			</form>

			<div class="account-config-area">
				<a href="DeleteAccountServlet">アカウントを削除する</a>
			</div>
		</div>
	</div>

</body>
</html>