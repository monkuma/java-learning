<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<div class="editor-area">
		<div class="handle"></div>

<div class="editor-outer">
<div class="editor-inner">

<div id="editor" style="height: 300px">public class Main{
    public static void main(String[] args){
      System.out.println("Hello world!!");

    }
}
</div>
  <div class="editor-button-area">
  <button id="exe" class="editor-button"><i class="fas fa-rocket"></i> Execute</button>
  <button id="reset" class="editor-button"><i class="fas fa-trash-alt"></i> Reset</button>
  </div>
  </div>
  <div class="result-outer">
  <p class="bold">実行結果</p>
  <div id="result-area">
  </div>
  </div>

</div>
	</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/ace/1.2.0/ace.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/ace/1.2.0/ext-language_tools.js"></script>
<script src="js/editor.js"></script>
<script src="js/jdoodle-api.js"></script>

<script type='text/javascript' src='js/paiza-io.js'></script>