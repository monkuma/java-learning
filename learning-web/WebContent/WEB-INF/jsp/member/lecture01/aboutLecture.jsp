<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%
request.setAttribute("pageName","MyPage");
%>
	<div class="lecture-list-area">

		<ul class="lecture-lists">
			<li><a class="sink-button lecture-item" href="LectureServlet?pageNo=1&lecNo=lecture01">変数とデータ型</a></li>
			<li><a class="sink-button lecture-item" href="#">式と演算子</a></li>
			<li><a class="sink-button lecture-item" href="#">条件式</a></li>
			<li><a class="sink-button lecture-item" href="#">繰返し</a></li>
			<li><a class="sink-button lecture-item" href="#">配列</a></li>
			<li><a class="sink-button lecture-item" href="#">クラス</a></li>
			<li><a class="sink-button lecture-item" href="#">クラスの継承</a></li>
			<li><a class="sink-button lecture-item" href="#">クラスライブラリ</a></li>
			<li><a class="sink-button lecture-item" href="#">インターフェース</a></li>
			<li><a class="sink-button lecture-item" href="#">ジェネリクス</a></li>
		</ul>
	</div>


