package test.DeleteRequests;

import java.io.IOException;

import org.testng.annotations.Test;

import API.MediaPosts.DeleteApiPosts;
import io.restassured.response.Response;
import utility.AssertionsClass;

public class DeleteRequestTest 
{

	Response response;
	AssertionsClass assertionClassObj;

	// Delete the data into existing Object
	@Test
	public void verifyDeleteEndPoint() throws IOException 
	{
		response=DeleteApiPosts.GetReponsePostsOnDeletePost_on_post_ID("1");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(200);
	}
}
