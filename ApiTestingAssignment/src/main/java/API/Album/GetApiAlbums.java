package API.Album;

import java.io.IOException;

import ProjectCommon.Album.endPoints.AlbumsEndPoints;
//import ProjectCommon.Comments.endPoints.CommentsEndPoints;
import io.restassured.response.Response;
import utility.CommonUtils;
import utility.PropertyReader;

public class GetApiAlbums 
{
	
	static Response response;
	
	public static Response GetReponseOfAlbumOfSpecific_id(String album_id) throws IOException 
	{
		response = CommonUtils.getRequest1(PropertyReader.getHost(), AlbumsEndPoints.getAlbumForSpecificIDEndPoint(album_id));
		return response;
	}

}
