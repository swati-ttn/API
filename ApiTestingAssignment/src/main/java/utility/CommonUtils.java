package utility;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import java.util.Random;

import Reporting.Base;


public class CommonUtils extends Base
{
	static Random rand = new Random();

	public static Response getRequest(String uri,String basePath) 
	{

		RequestSpecification requestSpec = new RequestSpecBuilder().build();
		requestSpec.baseUri(uri);
		requestSpec.basePath(basePath);
		Response response = given().header("Content-Type", "application/json").spec(requestSpec).log().all().get();
		return response;
	}

	
	// post Request
	
	public static Response postRequest(String uri, String body) {

		Response response = 
				given().header("Content-Type", "application/json").body(body)
				.when().log().all().body(body).post(uri)
				.then().log().all().using().extract().response();

		return response;
	}
	
	
	// get Request
	
	public static Response getRequest1(String uri, String basePath) {
		String path = uri+basePath;
		System.out.println("*********************************");
		System.out.println(path);
		Response response = 
				given().header("Content-Type", "application/json")
				.when().log().all().get(path)
				.then().log().all().using().extract().response();

		return response;
	}
	
	
	// put Request
	
	public static Response putRequest(String uri, String body) {

		Response response = 
				given().header("Content-Type", "application/json").body(body)
				.when().log().all().body(body).put(uri)
				.then().log().all().using().extract().response();

		return response;
	}
	
// patch Request
	public static Response patchRequest(String uri, String body) {

		Response response = 
				given().header("Content-Type", "application/json").body(body)
				.when().log().all().body(body).patch(uri)
				.then().log().all().using().extract().response();

		return response;
	}
	
	public static Response deleteRequest(String uri,String basePath) 
	{

		RequestSpecification requestSpec = new RequestSpecBuilder().build();
		requestSpec.baseUri(uri);
		requestSpec.basePath(basePath);
		Response response = given().header("Content-Type", "application/json").spec(requestSpec).log().all().delete();
		return response;
	}

	public static String randomNumber() {
		return String.valueOf(rand.nextInt(98989898));
	}
}
