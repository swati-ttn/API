package test.PatchRequests;

import java.io.IOException;

import org.testng.annotations.Test;

import API.MediaPosts.PatchApiPosts;
//import API.MediaPosts.PutApiPosts;
import io.restassured.response.Response;
import utility.AssertionsClass;

public class PatchRequestTest 
{
	
	Response response;
	AssertionsClass assertionClassObj;

	// patch the data into existing Object
	@Test
	public void verifyPutEndPoint() throws IOException 
	{
		response=PatchApiPosts.GetReponsePosts_for_Patch_Req_of_Post_on_post_ID("1");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(200);
		assertionClassObj.AssertResponsebodyOfPost("TTN_Noida");
	}

}
