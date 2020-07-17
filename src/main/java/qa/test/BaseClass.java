package qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public WebDriver driver;
	
	
	
	
	
	@BeforeMethod
    public void setup() throws InterruptedException {
    	
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	
    	driver.get("https://app.hubspot.com/getting-started");
    	Thread.sleep(4000);
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	
    	
    	
    }
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
