package test.GetRequests;

import java.io.IOException;

import org.testng.annotations.Test;
import API.Album.GetApiAlbums;
import API.Comments.GetApiComments;
import API.MediaPosts.GetApiPosts;
import io.restassured.response.Response;
import utility.AssertionsClass;

public class GetResuestTests {

	Response response;
	AssertionsClass assertionClassObj;

	// get all the Posts
	@Test
	public void getAllPost() throws IOException {
		response = GetApiPosts.GetReponseAllPosts();
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(200);
		assertionClassObj.AssertResponseTittleForarrayDataGet(
				"sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
	}

	// get First Post
	@Test
	public void getFirstPost() throws IOException {
		response = GetApiPosts.GetReponsePostsOnPost_ID("1");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(200);
		assertionClassObj
				.AssertResponseTittle("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
		assertionClassObj.AssertResponsebodyOfPost(
				"quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
	}

	// get the comments inside first post
	@Test
	public void getCommentsUnderFirstPost() throws IOException {
		response = GetApiPosts.GetReponseCommentOfPostsOnPost_ID("1");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(200);
		assertionClassObj.AssertResponseNameForarrayDataGet("id labore ex et quam laborum");
	}

	// get the comments inside first post by Query paramater
	@Test
	public void getFirstPostComment() throws IOException {
		response = GetApiPosts.GetReponseCommentOfPostsOnPost_ID_QueryParam("?postId=1");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(200);
		assertionClassObj.AssertResponseNameForarrayDataGet("id labore ex et quam laborum");
	}

	// get the 10th Album tittle
	@Test
	public void getAlbumTen() throws IOException {
		response = GetApiAlbums.GetReponseOfAlbumOfSpecific_id("10");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(200);
		assertionClassObj.AssertResponseTittle("distinctio laborum qui");
	}

	// get verify email for ID Five inside comments
	@Test
	public void getVeriFyEmailForFifthID() throws IOException {
		response = GetApiComments.GetReponseCommentOnSpecific_post_ID("5");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(200);
		assertionClassObj.AssertEmailOfComment("Hayden@althea.biz");
	}

	// get verify ID 100 exist or not inside Posts
	@Test
	public void getVeriFyIDHundrade() throws IOException {
		response = GetApiPosts.GetReponsePostsOnPost_ID("100");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(200);
		assertionClassObj.AssertResponseTittle("at nam consequatur ea labore ea harum");
		assertionClassObj.AssertResponsebodyOfPost(
				"cupiditate quo est a modi nesciunt soluta\nipsa voluptas error itaque dicta in\nautem qui minus magnam et distinctio eum\naccusamus ratione error aut");
	}

	
	
	
/**   
 * 
 * Negative test cases for get Requests------------------------------------
 * 
 */

	// get 1000 Post (doesn't exist)
	@Test
	public void getInvalidPost() throws IOException {
		response = GetApiPosts.GetReponsePostsOnPost_ID("1000");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(404);
	}

	// get 1000 Comments (doesn't exist)
	@Test
	public void getInvalidComment() throws IOException {
		response = GetApiComments.GetReponseCommentOnSpecific_post_ID("1000");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(404);
		assertionClassObj.verifyJsonObject("{}");
	}

	// get the 100th Album tittle
	@Test
	public void getAlbumInvalid() throws IOException {
		response = GetApiAlbums.GetReponseOfAlbumOfSpecific_id("1000");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.AssertResponseStatusCode(404);
		assertionClassObj.verifyJsonObject("{}");
	}

	// get the comments inside first post by Query param (Invalid UeryParams)
	@Test
	public void getFirstPostCommentInvalid() throws IOException
	{
		response = GetApiPosts.GetReponseCommentOfPostsOnPost_ID_QueryParam("?postId=1000");
		assertionClassObj = new AssertionsClass(response);
		assertionClassObj.verifyJsonObject("[]");
	}

}
