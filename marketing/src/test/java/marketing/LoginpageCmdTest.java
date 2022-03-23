package marketing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginpageCmdTest {
	
	
		@Test
		
	 public void vtigercmd() {
			
		
	
			String browser = System.getProperty("browser");
			String url = System.getProperty("url");
			String username = System.getProperty("username");
			String password = System.getProperty("password");
			
			
	   WebDriver driver = null;
	   if (browser.equalsIgnoreCase("chrome")) {
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   
	   }else if (browser.equalsIgnoreCase("firefox")) {
		   WebDriverManager.firefoxdriver().setup();
		   driver = new FirefoxDriver();
		  
	   }
		  
		   
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(url);
	
	driver.findElement(By.name("user_name")).sendKeys(username);
	driver.findElement(By.name("user_password")).sendKeys(password);
	driver.findElement(By.id("submitButton")).click();
	   
	driver.findElement(By.linkText("Contacts")).click();
	
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();	
	

	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.linkText("Sign Out")).click();
	
	driver.close();
	

		}
		
}
