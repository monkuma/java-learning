package model;

public class FormingScriptLogic {
	public String execute(String script) {
		String result = script.replace("\n", "\\n")
				.replace("\"", "\\\"")
				.replace("\t", "");

		return result;
	}

}
