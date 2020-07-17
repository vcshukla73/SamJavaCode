package SeleniumProject.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {
	//WebDriver driver;
	
	
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		//WebDriver driver=new ChromeDriver();
		
		WebDriverManager.iedriver().setup();
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://www.Google.com");
		
	  System.out.println(driver.getTitle());
	  
	  driver.quit();
	  
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
