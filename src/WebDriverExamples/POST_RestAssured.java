package WebDriverExamples;

import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POST_RestAssured {
public static void main(String args[]) {
	JSONObject data = new JSONObject();
	data.put("empid", "101");
	data.put("empname", "Kareem");
	Response res = RestAssured.given().contentType(ContentType.JSON).body(data.toJSONString()).post("https://reqres.in/api/users");
	int statuscode = res.getStatusCode();
	System.out.println(statuscode);
	System.out.println(res.getTime());
	System.out.println("=========================================");
	System.out.println(res.asString());
}
}
