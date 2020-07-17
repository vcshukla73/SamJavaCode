package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConceptForTitle {

	public static void main(String[] args) {

		
		
		
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("vcshukla@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("mcamca");
		driver.findElement(By.id("u_0_b")).click();
		
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		//wait.until(ExpectedConditions.urlContains("facebook.com"));
			
		doGetPageTittleWithContains(driver, 10, "facebook.com");
		
	}	
	
	
public static String doGetPageTittleWithContains(WebDriver driver,int timeOut,String title){
	
	WebDriverWait wait=new WebDriverWait(driver, timeOut);
	wait.until(ExpectedConditions.urlContains(title));
	return driver.getTitle();
	
	
	
}
	
public static String doGetPageCurrentUrl(WebDriver driver,int timeOut,String title){
	
	WebDriverWait wait=new WebDriverWait(driver, timeOut);
	wait.until(ExpectedConditions.urlContains(title));
	return driver.getCurrentUrl();
	
	
	
	
	
	
}




	
	
	
	

}
