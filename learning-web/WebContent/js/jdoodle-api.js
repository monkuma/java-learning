
function sampleAjax(script) {
	//リクエストJSON
	var request = {
			script : script,
	};
	//ajaxでservletにリクエストを送信
	$.ajax({
		type    : "POST",          //GET / POST
		url     : "http://localhost:8080/learning-web/CompileServlet",
		data    : request,        //リクエストJSON
		async   : true,           //true:非同期(デフォルト), false:同期
		success : function(data) {
			var midashi = document.getElementById("result-area");
			console.log("Success");
			midashi.innerText = data;
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("リクエスト時になんらかのエラーが発生しました：" + textStatus +":\n" + errorThrown);
		}
	});
}
