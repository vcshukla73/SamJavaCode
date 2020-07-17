package SeleniumProject.SeleniumProject;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProject {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://app.hubspot.com//");
			
		//System.out.println(doGetPageTitleWithContains(driver,10,"Amazon"));
		
		By email=By.id("username");
		By password=By.id("password");
		By loginButton=By.id("loginBtn");
		
		
//		driver.findElement(email).sendKeys("vcshkla");
//		driver.findElement(password).sendKeys("shukla");
//		driver.findElement(loginButton).click();
		
		waitForElement(driver,10,email,"vcshukla");
	
		}
	
	public static void waitForElement(WebDriver driver,int timeOut,By locator,String value) {
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(value);
		
	}

	
	
	
	
	public static String doGetPageTitleWithContains(WebDriver driver,int timeOut,String title) {
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
		
				
		
		
		
	}

}
