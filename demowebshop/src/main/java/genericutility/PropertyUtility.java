package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	public String readingDataFromPPT(String Key) throws IOException  {
		FileInputStream fis=null;

		try {
			fis = new FileInputStream("./src/test/resources/TestData.properties");
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		Properties ppt = new Properties();
		ppt.load(fis);
		return ppt.getProperty(Key);
		
	}
}
