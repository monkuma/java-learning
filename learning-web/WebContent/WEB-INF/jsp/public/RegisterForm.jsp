<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<jsp:include page="../commonMeta.jsp" />
<title>登録ページです</title>
</head>
<body>

	<jsp:include page="./public_header.jsp" />

	<form class="login-form" action="RegisterServlet" method="post">
		<img class="mb-4" src="img/coffee_black_24dp.svg" alt="" width="72"
			height="57">
		<h1 class="h3 mb-3 fw-normal">Please Register</h1>

		<label> E-Mail<input type="email" name="id"
			placeholder="Mail@example.com" /></label>

		<label> Name<input type="text"
			name="name" placeholder="name" />

		</label> Password<label> <input type="password" name="pass"
			placeholder="Password" />
		</label>
		<button  class="form-button" type="submit"><i class="fas fa-user-circle"></i> Register</button>
	</form>




	<jsp:include page="./public_footer.jsp" />
</body>
</html>