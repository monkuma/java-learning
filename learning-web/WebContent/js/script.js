'use strict'

window.addEventListener('DOMContentLoaded', function(){

	  const videoElement = document.querySelector("video");
	  const btn_slow = document.getElementById("btn_slow");
	  const btn_fast = document.getElementById("btn_fast");

	  btn_slow.addEventListener("click", (e) => {
	    videoElement.playbackRate -= 0.15;
		  if(videoElement.playbackRate == 0){
			  videoElement.playbackRate = 0.1;
		  }
	  });



	  btn_fast.addEventListener("click", (e) => {
	    videoElement.playbackRate += 0.25;
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