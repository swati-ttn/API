package API.MediaPosts;

import java.io.IOException;
import java.util.HashMap;

import com.google.gson.Gson;
import ProjectCommon.MediaPosts.endPoints.MediaPostsEndPoints;
import io.restassured.response.Response;
import utility.CommonUtils;
import utility.PropertyReader;

public class PostApiPosts 
{
	static Response response;
	
	public static Response GetReponsePostsPostReq_of_Post_on_post_ID() throws IOException 
	{
		response=CommonUtils.postRequest(PropertyReader.read().getProperty("api.base.uri")+MediaPostsEndPoints.getAllPostEndPoint(), creatrePostPayload());
		return response;
	}
	
	// creating the Post Payload
		public  static String creatrePostPayload() throws IOException 
		{
		HashMap<String, String> post = new HashMap<String, String>();
		post.put("user_id", PropertyReader.read().getProperty("UsetID"));
		post.put("title", PropertyReader.read().getProperty("Tittle"));
		post.put("body", PropertyReader.read().getProperty("Body"));
		return new Gson().toJson(post);
	    }
}
