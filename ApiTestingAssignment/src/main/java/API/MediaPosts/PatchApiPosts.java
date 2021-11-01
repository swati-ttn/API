package API.MediaPosts;

import java.io.IOException;
import java.util.HashMap;

import com.google.gson.Gson;

import ProjectCommon.MediaPosts.endPoints.MediaPostsEndPoints;
import io.restassured.response.Response;
import utility.CommonUtils;
import utility.PropertyReader;

public class PatchApiPosts 
{
	
	static Response response;
	
	public static Response GetReponsePosts_for_Patch_Req_of_Post_on_post_ID(String post_id) throws IOException 
	{
		
		response= CommonUtils.patchRequest(PropertyReader.read().getProperty("api.base.uri")+MediaPostsEndPoints.getCommentForIDEndPoint(post_id), creatrePatchPayload());
		return response;
	}
	
	// creating the Payload
			public static String creatrePatchPayload() throws IOException 
			{
			HashMap<String, String> patch = new HashMap<String, String>();
			patch.put("body", PropertyReader.read().getProperty("Patch_Updated_Body"));
			return new Gson().toJson(patch);
		    }

}
