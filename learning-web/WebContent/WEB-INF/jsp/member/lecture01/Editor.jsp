<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<h1>エディター画面です</h1>


    <div class="editor">
        <div class="editor__wrapper">
            <div class="editor__body">
                <div id="editorCode" class="editor__code"></div>
            </div>
            <div class="editor__footer">
                <div class="editor__footer--left">
                    <button class="editor__btn editor__run">Run ></button>
                    <button class="editor__btn editor__reset">Reset ></button>
                </div>
                <div class="editor__footer--right">
                    <div class="editor__console">
                        <ul class="editor__console-logs"></ul>
                    </div>
                </div>
            </div>
        </div>
    </div>



<script src="js/src-min/ace.js"></script>
<script src="js/src-min/mode–javascript.js"></script>
<script src="js/src-min/theme–chrome.js"></script>
<script src="js/src-min/editor.js"></script>
<script src="js/src-min/ext-language_tools.js"></script>
<script>
    var editor = ace.edit("editor");
    editor.setTheme("ace/theme/Xcode");
    editor.getSession().setMode("ace/mode/java");
</script>