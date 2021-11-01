
package test.PutRequest;
import java.io.IOException;
import org.testng.annotations.Test;
//import API.MediaPosts.PostApiPosts;
import API.MediaPosts.PutApiPosts;
import io.restassured.response.Response;
import utility.AssertionsClass;

public class PutRequestTest 
{
	
	Response response;
	AssertionsClass assertionClassObj;

	// put the data into existing Object
	@Test
	public void verifyPatchEndPoint() throws IOException 
	{
		response=PutApiPosts.GetReponsePosts_for_Put_Req_of_Post_on_post_ID("1");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(200);
		assertionClassObj.AssertResponsebodyOfPost("TTN");

	}
	
}
