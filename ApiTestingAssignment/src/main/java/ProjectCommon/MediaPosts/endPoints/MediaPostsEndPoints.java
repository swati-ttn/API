package ProjectCommon.MediaPosts.endPoints;

public class MediaPostsEndPoints 
{
	public static String posts_end_point;
	public static String comments_Inside_post_end_point;

	public static String getAllPostEndPoint()
	{
	   posts_end_point = "/posts";
		return posts_end_point;
	}
	
	public static String getCommentForIDEndPoint(String post_id)
	{
	   posts_end_point = "/posts/"+post_id;
		return posts_end_point;
	}
	
	public static String getCommentsInsideSpecific_Id_EndPoint(String post_id)
	{
		comments_Inside_post_end_point = "/posts/"+post_id+"/comments";
		return comments_Inside_post_end_point;
	}
	
	public static String getCommentOnPostIDAsQueryParamEndPoint(String post_id)
	{
		comments_Inside_post_end_point = "/comments"+post_id;
		return comments_Inside_post_end_point;
	}
	
}
