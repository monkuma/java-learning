'use strict'

async function postData(url = "", data = {}) {
	const response = await fetch(url, {
		method: "POST",
		mode: "cors",
		cache: "no-cache",
		credentials: "same-origin",
		headers: {
			"Content-Type": "application/json",
		},
		redirect: "follow",
		referrerPolicy: "no-referrer",
		body: JSON.stringify(data),
	});
	return response.json();
}

async function getData(url) {

	const response = await fetch(url);

	return response.json();
}


async function main(input_code) {
	const url = "http://api.paiza.io:80/runners/create";
	const data = {
			source_code: input_code,
			language: "java",
			input: "",
			api_key: "guest",
			longpoll: true,
	};
	const res = await postData(url, data);


	const status_url = `http://api.paiza.io/runners/get_status?id=${res.id}&api_key=guest`;
	const status_response = await getData(status_url);
	console.log(status_url);



	const details_url = `http://api.paiza.io/runners/get_details?id=${res.id}&api_key=guest`;



	const details_response = await getData(details_url);

	var result = document.getElementById("result-area");
	if(details_response.stdout == null){
		console.log("異常終了結果：　" + details_response.build_stderr);

		result.innerHTML = details_response.build_stderr;
	}else{
		console.log("出力結果：　" + details_response.stdout);
		result.innerHTML = details_response.stdout;

	}


}


