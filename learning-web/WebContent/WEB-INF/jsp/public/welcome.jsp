<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="jp">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>トップページです</title>
</head>
<body>

<h1>トップページです</h1>

<form action="LoginServlet" method="post">
ユーザーID：<input type="text" name="id"><br>
パスワード：<input type="password" name="pass">
<input type="submit" value="Login">
</form>

</body>
</html>