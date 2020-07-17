package SeleniumProject.SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogout {

	public static void main(String[] args) throws InterruptedException {


		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("vcshukla@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("mcamca");
		driver.findElement(By.id("u_0_b")).click();
		
		////*[@id="mount_0_0"]/div/div/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/img
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/img"));
		
		
		driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div/div[1]/div[2]/div[4]/div[1]/span/div/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"jsc_c_5n\"]/div/div/span")).click();
		
		
		
		
		
		
		
		
	}

}
