package test.PostRequests;

import java.io.IOException;

import org.testng.annotations.Test;
import API.MediaPosts.PostApiPosts;
import io.restassured.response.Response;
import utility.AssertionsClass;

public class PostRequestTest 
{

	Response response;
	AssertionsClass assertionClassObj;
	
	// verify Post end point to Posts a Story
	
			@Test
			public void verifyPostEndPoint() throws IOException 
			{
				response = PostApiPosts.GetReponsePostsPostReq_of_Post_on_post_ID();
				assertionClassObj = new AssertionsClass(response);
				assertionClassObj.AssertResponseStatusCode(201);
				assertionClassObj.AssertResponseTittle("Company");
				
			}

}
