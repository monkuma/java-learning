<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="jp">
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
	<title>登録ページです</title>
</head>
<body>
<div class="container">
<jsp:include page="./public_header.jsp" />
<h1>トップページです</h1>

		<div class="text-center">
			<main class="form-signin">
				<form action="RegisterServlet" method="post">
					<img class="mb-4" src="img/coffee_black_24dp.svg" alt="" width="72"
						height="57">
					<h1 class="h3 mb-3 fw-normal">Please register</h1>

					<div class="form-floating">
						<input type="email" name="id" class="form-control"
							id="floatingInput" placeholder="name@example.com"> <label
							for="floatingInput">Email address</label>
					</div>
					<div class="form-floating">
						<input type="text" name="name" class="form-control"
							id="floatingInput" placeholder="name"> <label
							for="floatingInput">name</label>
					</div>
					<div class="form-floating">
						<input type="password" name="pass" class="form-control"
							id="floatingPassword" placeholder="Password"> <label
							for="floatingPassword">Password</label>
					</div>

					<button class="w-100 btn btn-lg btn-primary" type="submit">Register</button>
				</form>
			</main>
		</div>
	</div>



<jsp:include page="./public_footer.jsp" />


</body>
</html>