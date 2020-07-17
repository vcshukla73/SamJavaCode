package qa.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
	
	@Test
	public void doLogin() throws InterruptedException {
		Thread.sleep(5000);
				
		driver.findElement(By.id("Yahoo - login")).sendKeys("vcshukla@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		//(//span[text()='All contacts'])[2]
		
		
	}
	

}
