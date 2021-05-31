package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import org.json.JSONObject;

public class CompileLogic {

	public String execute(String targetScript) {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String clientId = rb.getString("clientId");
		String clientSecret = rb.getString("clientSecret");

		String script = targetScript;
		String language = "java";
		String versionIndex = "0";

		try {
			URL url = new URL("https://api.jdoodle.com/v1/execute");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");

			String input = "{\"clientId\": \"" + clientId + "\",\"clientSecret\":\"" + clientSecret + "\",\"script\":\"" + script +
					"\",\"language\":\"" + language + "\",\"versionIndex\":\"" + versionIndex + "\"} ";

			OutputStream outputStream = connection.getOutputStream();
			outputStream.write(input.getBytes());
			outputStream.flush();

			if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
				throw new RuntimeException("Please check your inputs : HTTP error code : "+ connection.getResponseCode());
			}

			BufferedReader bufferedReader;
			bufferedReader = new BufferedReader(new InputStreamReader(
					(connection.getInputStream())));

			String output;

			while ((output = bufferedReader.readLine()) != null) {

				JSONObject json = new JSONObject(output);
				String resultScript = json.getString("output");
				return resultScript;

			}

			connection.disconnect();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
