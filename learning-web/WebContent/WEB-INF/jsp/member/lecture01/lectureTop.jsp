<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../../commonMeta.jsp" />
<title>Insert title here</title>
</head>

<script type="text/javascript">


</script>


<body>
	<h1>Javaの学習ページトップ</h1>

	<div class="contents">


		<div class="lecture-video-area ">
			一定の範囲内で伸縮可！
			<video src="video/sample-video.mp4" controls preload="none"
				controls controlslist="nodownload" preload="metadata" disablePictureInPicture
				style="width: 100%;"></video>
				<p id="speed">aiueo</p>
			<button id="btn_slow">スロー</button>
			<button id="btn_normal">通常</button>
			<button id="btn_fast">早送り</button>
			<button id="btn_veryfast">もっと早送り</button>
		</div>

		<div class="editor-area">
		<div class="handle"></div>


		エディターエリアです。。。


		</div>


	</div>
	<a href="LectureServlet?pageNo=1">講座1へ</a>
</body>
</html>