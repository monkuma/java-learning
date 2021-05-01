document.write("<script type='text/javascript' src='paiza-io.js'></script>");

//set button
const executeCodebtn = document.getElementById('exe');
const resetCodebtn = document.getElementById('reset');


//Setup Ace
let codeEditor = ace.edit("editor");
codeEditor.$blockScrolling = Infinity;

const defaultCode = "public class Main {\n\tpublic static void main(String[] args) {\n\t\tSystem.out.println(\"Default Code Hello!!\");\n\n\t} \n}";

let editorLib = {
	init(){

		//theme
		codeEditor.setTheme("ace/theme/monokai");


		//Set language
		codeEditor.getSession().setMode("ace/mode/java");

		//Set Options
		codeEditor.setOptions({
			fontFamily: 'Inconsolate',
			enableBasicAutocompletion: true,
			enableSnippets: true,
			enableLiveAutocompletion: true,
			fontSize: '15pt',
		});

	}
}

executeCodebtn.addEventListener('click', () =>{
	//Get input from the code editor
	const userCode = codeEditor.getValue();

	main(userCode);
});

resetCodebtn.addEventListener('click', () =>{
	//clear ace editor
	codeEditor.setValue(defaultCode);

	console.log(defaultCode);
});


editorLib.init();