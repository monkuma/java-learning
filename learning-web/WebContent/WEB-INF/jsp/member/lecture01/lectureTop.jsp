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
	<jsp:include page="../member_header.jsp" />


	<div class="contents">


		<div class="lecture-video-area ">

		<div class="video-outer">
		<div class="video-inner">
			<video class="lecture-video" src="video/sample-video.mp4" controls preload="metadata"
				controls controlslist="nodownload" preload="metadata" disablePictureInPicture
				style="width: 100%;"></video>


			<button id="btn_slow">スロー</button>
			<button id="btn_normal">通常</button>
			<button id="btn_fast">早送り</button>
			<button id="btn_veryfast">もっと早送り</button>
		</div>
		</div>
		</div>

		<div class="editor-area">
		<div class="handle"></div>


		エディターエリアです。。。


		</div>


	</div>
	<a href="LectureServlet?pageNo=1">講座1へ</a>
</body>
</html>