package qa.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	
	
	
	
	
	


@Test
public void getPageTitle() {
		System.out.println("Page Title "+driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "HubSpot Login");
}

	
	
	
}

	

}
