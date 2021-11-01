package utility;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AssertionsClass 
{
		Response response;
		JsonPath jsonPathEvaluator;
	
	public AssertionsClass(Response response)
	{
		this.response = response;
	}

	public void verifyJsonObject(String jsonObject)
	{
		Assert.assertEquals(response.asString(), jsonObject);
	}
	
	public void AssertResponseStatusCode(int responseCode) 
	{
		Assert.assertEquals(response.getStatusCode(), responseCode);
    }
	
	
	public void AssertResponseTittleForarrayDataGet(String response_tittle_array) 
	{
		jsonPathEvaluator = response.jsonPath();
		String actualtittleOfPost = jsonPathEvaluator.get("title[0]");
		System.out.println("****************************************************");
		System.out.println(actualtittleOfPost);
		Assert.assertEquals(actualtittleOfPost, response_tittle_array);
    }
	
	public void AssertResponseNameForarrayDataGet(String name) 
	{
		jsonPathEvaluator = response.jsonPath();
		String actualNameOfPost = jsonPathEvaluator.get("name[0]");
		System.out.println("****************************************************");
		System.out.println(actualNameOfPost);
		Assert.assertEquals(actualNameOfPost, name);
    }
	
	
	public void AssertResponseTittle(String response_tittle) 
	{
		jsonPathEvaluator = response.jsonPath();
		String actualtittleOfPost = jsonPathEvaluator.get("title");
		System.out.println("****************************************************");
		System.out.println(actualtittleOfPost);
		Assert.assertEquals(actualtittleOfPost, response_tittle);
    }
	
	
	public void AssertResponsebodyOfPost(String post_body) 
	{
		jsonPathEvaluator = response.jsonPath();
		String actualBodyOfPost = jsonPathEvaluator.get("body");
		System.out.println("***************************************	*************");
		System.out.println(actualBodyOfPost);
		Assert.assertEquals(actualBodyOfPost, post_body);
    }
	
	
	public void AssertEmailOfComment(String email_ID) 
	{
		jsonPathEvaluator = response.jsonPath();
		String actualemail = jsonPathEvaluator.get("email");
		System.out.println("****************************************************");
		System.out.println(actualemail);
		Assert.assertEquals(actualemail, email_ID);
    }
}
