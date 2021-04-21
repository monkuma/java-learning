<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="jp">
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/style.css">
<title>ログイン画面</title>

</head>
<body>

	<div class="container">

		<jsp:include page="./public_header.jsp" />

		<div class="text-center">
			<main class="form-signin">
				<form action="LoginServlet" method="post">
					<img class="mb-4" src="img/coffee_black_24dp.svg" alt="" width="72"
						height="57">
					<h1 class="h3 mb-3 fw-normal">Please sign in</h1>

					<div class="form-floating">
						<input type="email" name="id" class="form-control"
							id="floatingInput" placeholder="name@example.com"> <label
							for="floatingInput">Email address</label>
					</div>
					<div class="form-floating">
						<input type="password" name="pass" class="form-control"
							id="floatingPassword" placeholder="Password"> <label
							for="floatingPassword">Password</label>
					</div>

					<div class="checkbox mb-3">
						<label> <input type="checkbox" value="remember-me">
							Remember me
						</label>
					</div>
					<button class="w-100 btn btn-lg btn-primary" type="submit">Sign
						in</button>
				</form>
			</main>
		</div>
	</div>



	<jsp:include page="./public_footer.jsp" />
</body>
</html>