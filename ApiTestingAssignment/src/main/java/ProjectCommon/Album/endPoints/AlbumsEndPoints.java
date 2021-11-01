package ProjectCommon.Album.endPoints;

public class AlbumsEndPoints 
{

public static String albums_end_point;
	
	
	public static String getAlbumForSpecificIDEndPoint(String id)
	{
		albums_end_point = "/albums/"+id;
		return albums_end_point;
	}
}
