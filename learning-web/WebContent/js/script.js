'use strict'

//the button of lecture video
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


//lecture video & editor Area
var isResizing = false,
lastDownX = 0;

$(function () {
	var container = $('.contents'),
	left = $('.lecture-video-area'),
	right = $('.editor-area'),
	handle = $('.handle');

	handle.on('mousedown', function (e) {
		isResizing = true;
		lastDownX = e.clientX;
	});

	$(document).on('mousemove', function (e) {
		// we don't want to do anything if we aren't resizing.
		if (!isResizing)
			return;

		var offsetRight = container.width() - (e.clientX - container.offset().left);

		left.css('right', offsetRight);
		right.css('width', offsetRight);
	}).on('mouseup', function (e) {
		// stop resizing
		isResizing = false;
	});
});