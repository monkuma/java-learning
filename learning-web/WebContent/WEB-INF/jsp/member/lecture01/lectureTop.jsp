<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../../commonMeta.jsp" />
<title>Insert title here</title>
</head>

<script type="text/javascript">
$(function(){
  $(".lecture-video-area").resizable({
    minHeight:50,
    minWidth:50,
    maxHeight:500,
    maxWidth:900,
    animateEasing: 'easeOutBounce'


  });
});

window.addEventListener('DOMContentLoaded', function(){

	  const videoElement = document.querySelector("video");
	  const btn_slow = document.getElementById("btn_slow");
	  const btn_normal = document.getElementById("btn_normal");
	  const btn_fast = document.getElementById("btn_fast");
	  const btn_veryfast = document.getElementById("btn_veryfast");

	  btn_slow.addEventListener("click", (e) => {
	    videoElement.playbackRate = 0.5;
	  });

	  btn_normal.addEventListener("click", (e) => {
	    videoElement.playbackRate = 1.0;
	  });

	  btn_fast.addEventListener("click", (e) => {
	    videoElement.playbackRate = 2.0;
	  });

	  btn_veryfast.addEventListener("click", (e) => {
	    videoElement.playbackRate = 3.0;
	  });
	});
</script>


<body>
<h1>Javaの学習ページトップ</h1>

<div class="lecture-video-area" >
一定の範囲内で伸縮可！
<video src="video/sample-video.mp4" controls loop  preload="none" controls disablepictureinpicture controlslist="nodownload" style="width: 100%; height: 100%;"></video>
  <button id="btn_slow">スロー</button>
  <button id="btn_normal">通常</button>
  <button id="btn_fast">早送り</button>
  <button id="btn_veryfast">もっと早送り</button>
</div>


<a href="LectureServlet?pageNo=1">講座1へ</a>
</body>
</html>