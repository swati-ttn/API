package utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static Properties read() throws IOException {
		FileReader reader=new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\config\\local.properties");  
     
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    return p;
	}
	
	public static String getHost() throws IOException {
		return PropertyReader.read().getProperty("api.base.uri");
	}
}
