<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="contents">
	<div class="lecture-video-area ">


		<div class="video-outer">
			<div class="video-inner">
				<video class="lecture-video" src="video/sample-video.mp4" controls
					preload="metadata" controls controlslist="nodownload"
					preload="metadata" disablePictureInPicture style="width: 100%;">
				</video>

				<div class="video-button-area">
					<button class="lecture-button" onclick="location.href='#'">
						<i class="fas fa-step-backward"></i>
					</button>
					<button class="lecture-button" id="btn_slow">
						<i class="fas fa-fast-backward"></i>
					</button>
					<button class="lecture-button" id="btn_fast">
						<i class="fas fa-fast-forward"></i>
					</button>
					<button class="lecture-button" onclick="location.href='#'">
						<i class="fas fa-step-forward"></i>
					</button>
				</div>

			</div>


		</div>

		<div class="result-outer">
			<h2>変数とデータ型 ミニ問題集</h2>
<pre><code onCopy="alert('コピペせずに頑張ろう♪'); return false;">
//1.以下のコードの出力結果を求めよう！
int num1 = 5;
System.out.println(num1 + num2);
int num2 = 5;

//2.以下のコードの出力結果を求めよう！
int a, b, c, d, e;
a = b = c = d = e = 100;
System.out.println(c);
</code>
</pre>
		</div>
	</div>




</div>
