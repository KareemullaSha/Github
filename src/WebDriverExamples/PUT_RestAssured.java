package WebDriverExamples;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PUT_RestAssured {
public static void main(String args[]) {
	JSONObject data = new JSONObject();
	data.put("empid","101");
	data.put("empname", "Firoz");
	Response res = RestAssured.given().contentType(ContentType.JSON).body(data.toJSONString()).put("https://reqres.in/api/users/2");
	int statuscode = res.getStatusCode();
	System.out.println(statuscode);
	System.out.println(res.getTime());
	System.out.println("------------------------------------------");
	System.out.println(res.asString());
}
}
