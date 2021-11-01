package ProjectCommon.Comments.endPoints;

public class CommentsEndPoints 
{
	public static String comments_end_point;
	
	
	public static String getCommentForSpecific_post_IDEndPoint(String post_id)
	{
		comments_end_point = "/comments/"+post_id;
		return comments_end_point;
	}
	
}
