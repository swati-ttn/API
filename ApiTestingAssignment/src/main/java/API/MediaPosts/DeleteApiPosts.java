package API.MediaPosts;

import java.io.IOException;

import ProjectCommon.MediaPosts.endPoints.MediaPostsEndPoints;
import io.restassured.response.Response;
import utility.CommonUtils;
import utility.PropertyReader;

public class DeleteApiPosts 
{

	static Response response;
	
	public static Response GetReponsePostsOnDeletePost_on_post_ID(String post_id) throws IOException 
	{
		response=CommonUtils.deleteRequest(PropertyReader.getHost(), MediaPostsEndPoints.getCommentForIDEndPoint(post_id));
		return response;
	}
}
