import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotEx {
       	
		WebDriver driver = new FirefoxDriver();
		String CONFIG = "Y";
		
		public void captureScreenShot(String filename) throws IOException
		{
			driver.get("file:///C:/Users/SUNIL/Desktop/Selenium%20Software/Offline%20Website/index.html");
			if(CONFIG.equals("Y"))
			{
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile,new File(System.getProperty("user.dir")+"//screenshots//"+filename+".jpg"));
			}
			
			
		}
		
		public static void main(String[] args) {
			 ScreenShotEx ex = new  ScreenShotEx();
			 try{
				 ex.captureScreenShot("abc");
			 }catch(IOException e)
			 {
				 e.printStackTrace();
			 }
			

	}

}
