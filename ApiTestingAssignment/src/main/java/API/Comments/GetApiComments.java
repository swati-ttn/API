package API.Comments;

import java.io.IOException;

import ProjectCommon.Comments.endPoints.CommentsEndPoints;
//import ProjectCommon.MediaPosts.endPoints.MediaPostsEndPoints;
import io.restassured.response.Response;
import utility.CommonUtils;
import utility.PropertyReader;

public class GetApiComments 
{

	static Response response;
	
	public static  Response GetReponseCommentOnSpecific_post_ID(String post_id) throws IOException 
	{
		response=CommonUtils.getRequest1(PropertyReader.getHost(), CommentsEndPoints.getCommentForSpecific_post_IDEndPoint(post_id));
		return response;
	}
}
