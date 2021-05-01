<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
request.setAttribute("pageName","Java入門講座");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="lecture-list-area">

		<ul class="lecture-lists">
			<li><a class="sink-button lecture-item" href="LectureServlet?pageNo=1&lecNo=lecture01">変数</a></li>
			<li><a class="sink-button lecture-item" href="#">式と演算子</a></li>
			<li><a class="sink-button lecture-item" href="#">条件式</a></li>
			<li><a class="sink-button lecture-item" href="#">繰返し</a></li>
			<li><a class="sink-button lecture-item" href="#">配列</a></li>
			<li><a class="sink-button lecture-item" href="#">式と演算子</a></li>
			<li><a class="sink-button lecture-item" href="#">条件式</a></li>
			<li><a class="sink-button lecture-item" href="#">繰返し</a></li>
			<li><a class="sink-button lecture-item" href="#">配列</a></li>
		</ul>
	</div>



</body>
</html>