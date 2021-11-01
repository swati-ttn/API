package API.MediaPosts;

import java.io.IOException;
import java.util.HashMap;

import com.google.gson.Gson;

import ProjectCommon.MediaPosts.endPoints.MediaPostsEndPoints;
import io.restassured.response.Response;
import utility.CommonUtils;
import utility.PropertyReader;

public class PutApiPosts 
{

	static Response response;
	
	public static Response GetReponsePosts_for_Put_Req_of_Post_on_post_ID(String post_id) throws IOException 
	{
		response= CommonUtils.putRequest(PropertyReader.read().getProperty("api.base.uri")+MediaPostsEndPoints.getCommentForIDEndPoint(post_id), creatrePutPayload());
		return response;
	}
	
	
	
	// creating put request the Payload
			public static String creatrePutPayload() throws IOException 
			{
			HashMap<String, String> put = new HashMap<String, String>();
			put.put("id", PropertyReader.read().getProperty("ID"));
			put.put("userId", PropertyReader.read().getProperty("UsetID"));
			put.put("title", PropertyReader.read().getProperty("Tittle"));
			put.put("body", PropertyReader.read().getProperty("Updated_Body"));
			return new Gson().toJson(put);
		    }
}
