package RestApi;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
public class Testing {
	RequestSpecification reqspec;
	String title;
	int id;
	@BeforeClass
	public void setUp() {
		reqspec = new RequestSpecBuilder()
				// Set content type
				.addHeader("Content-Type", "application/json")
				.addHeader("Authorization", "token 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")
				// Set base URL
				.setBaseUri("https://api.github.com")
				// Build request specification
				.build();
	}
  @Test(priority=1)
  public void postMethod() {
	  
	  String reqBody= """
	  		{
	  		"title" :"test",
	  "key": "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIGlK/p+lSehyxfD1BIQOa8n86+YdWxEsYJhA0R5iAHPY"
			  }
			  """;
	 	 Response response= given().spec(reqspec) // Use requestSpec
		.body(reqBody) // Send request body
	.when()
		.post("/user/keys");
	 	 response.then().log().all();
	 	 response.then().statusCode(201);	  
		  id = response.getBody().path("id");
		 System.out.println("id : "+id);
	 	 
  }
  @Test(priority=2)
public void getMethod() {
	  System.out.println("id " + id);
	  Response response= given().spec(reqspec) // Use requestSpec
			  .pathParam("keyId", id)
			.when()
				.get("/user/keys/{keyId}");
			 	 response.then().log().all();
			 	 response.then().statusCode(200);
			 	 
  }
  @Test(priority=3)
public void deleteMethod() {
	  System.out.println("id " + id);
	  Response response = given().spec(reqspec)
			  .pathParam("keyId", id)
			  .when()
			  .delete("/user/keys/{keyId}");

	  response.then().statusCode(204)
	  .log().all();
	  
}
}
