<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<div class="editor-area">
		<div class="handle"></div>

<div class="editor-outer">
<div class="editor-inner">

  <div id="editor" style="height: 300px">
  class Main{
      public static void main(String[] args){
        System.out.println("Hello world!!");

      }
  }
  </div>
  <button id="exe">Execute</button>

  <button id="reset">Reset</button>
  </div>
  <div class="result-outer">
  <p>実行結果</p>
  <div id="result-area">

  </div>
  </div>

</div>


	</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/ace/1.2.0/ace.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/ace/1.2.0/ext-language_tools.js"></script>
<script src="js/editor.js"></script>
<script src="js/paiza-io.js"></script>