<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<header>

	<nav class="pc-nav">
		<ul>
			<li><a href="#" class="page-title">${pageName}</a></li>
			<li class="click-menubtn"><a class="myPage-icon"
				href="MenuServlet?action=myPage"><i class="fa fa-home"
					aria-hidden="true"></i></a></li>
			<li class="click-menubtn"><a class="myPage-icon"
				href="MenuServlet?action=myPage"><i class="far fa-laugh-beam"></i></a></li>
			<li class="click-menubtn"><a class="myPage-icon"
				href="MenuServlet?action=myPage"><i class="fas fa-envelope"></i></a></li>
			<li class="click-menubtn"><a class="myPage-icon"
				href="LogoutServlet"><i class="fas fa-sign-out-alt"
					style="color: firebrick;"></i></a></li>
		</ul>
	</nav>

</header>