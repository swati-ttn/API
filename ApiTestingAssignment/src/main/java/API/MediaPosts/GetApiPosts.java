package API.MediaPosts;

import java.io.IOException;
//import ProjectCommon.Comments.endPoints.CommentsEndPoints;
import ProjectCommon.MediaPosts.endPoints.MediaPostsEndPoints;
import io.restassured.response.Response;
import utility.CommonUtils;
import utility.PropertyReader;

public class GetApiPosts 
{
	static Response response;
	
	public static Response GetReponseAllPosts() throws IOException 
	{
		response = CommonUtils.getRequest1(PropertyReader.getHost(), MediaPostsEndPoints.getAllPostEndPoint());
		return response;
	}
	
	public static Response GetReponsePostsOnPost_ID(String post_id) throws IOException 
	{
		response=CommonUtils.getRequest1(PropertyReader.getHost(), MediaPostsEndPoints.getCommentForIDEndPoint(post_id));
		return response;
	}
	
	public static Response GetReponseCommentOfPostsOnPost_ID(String id) throws IOException 
	{
		response=CommonUtils.getRequest1(PropertyReader.getHost(), MediaPostsEndPoints.getCommentsInsideSpecific_Id_EndPoint(id));
		return response;
	}
	
	public static Response GetReponseCommentOfPostsOnPost_ID_QueryParam(String post_id) throws IOException 
	{
		response=CommonUtils.getRequest1(PropertyReader.getHost(), MediaPostsEndPoints.getCommentOnPostIDAsQueryParamEndPoint(post_id));
		return response;
	}
	
	
	
}
