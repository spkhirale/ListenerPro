import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;//driver;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {
	static WebDriver driver;
	private static Logger log = Logger.getLogger("GmailLogin");
	public static void main(String[] args) throws InterruptedException {
		 BasicConfigurator.configure();
		 PropertyConfigurator.configure("log4j.properties");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		log.info("opening the firefox browser");
		driver.get("file:///C:/Users/SUNIL/Desktop/Selenium%20Software/Offline%20Website/index.html");
		log.info("navigation to offline website");
		
		driver.findElement(By.id("email")).clear();
		log.info("clearing the email textbox");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		log.info("username typed");
		log.warn("not typed correctly");
		driver.findElement(By.id("password")).clear();
		log.info("clearing the password textbox");
		driver.findElement(By.id("password")).sendKeys("123456");
		log.info("password typed");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[3]/div/button")).click();
		log.info("clicking on submit button");
		Thread.sleep(500);
		driver.quit();
		log.info("browser closed");

	}

}
