package WebDriverExamples;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_RestAssured {
public static void main(String args[]) {
	Response res = RestAssured.get("https://reqres.in/api/users/2");
	int statuscode = res.getStatusCode();
	System.out.println(statuscode);
	System.out.println(res.getTime());
	System.out.println("------------------------------");
	System.out.println(res.asString());
}
}
