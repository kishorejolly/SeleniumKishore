package genericutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtility extends BaseClass {
	public void takingScreenshot() {
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorshot/name.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}




}
