<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="jp">
<head>

<jsp:include page="../commonMeta.jsp" />
<title>登録ページです</title>
</head>
<body>

	<jsp:include page="./public_header.jsp" />

	<form class="login-form" action="LoginServlet" method="post">
		<img class="mb-4" src="img/coffee_black_24dp.svg" alt="" width="72"
			height="57">
		<h1 class="h3 mb-3 fw-normal">Please sign in</h1>
		<label> E-mail<input type="email" name="id"
			placeholder="maile@example.com" />
		</label> Password <label> <input type="password" name="pass"
			placeholder="Password" />
		</label>
		<button class="form-button" type="submit">Sign in</button>
	</form>





	<jsp:include page="./public_footer.jsp" />
</body>
</html>