package test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredApiTest {
  @Test
  public void getUsers() {
	  RestAssured.baseURI="https://gorest.co.in/public/v2/users/";
	  RequestSpecification httpRequest = RestAssured.given().relaxedHTTPSValidation();
	  Response res = httpRequest.request(Method.GET,"");
	 //To print whole line of status
	  System.out.println(res.getStatusLine());
	 //To print just the code
	  System.out.println(res.getStatusCode());
	  System.out.println(res.prettyPrint());
	  
	  int StatCode = res.getStatusCode();
	  assertEquals(200, StatCode);
  }
}
