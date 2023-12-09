package in.automation.khulood.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homedepotassignment {
	 static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kalha\\eclipse-workspace\\khulood selenium project\\drivers2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https:www.homedepot.com");
		
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		WebElement account= driver.findElement(By.xpath("(//*[contains(text(),'My Account')])[1]"));
		account.click();
		Thread.sleep(6000);
		
		WebElement signin= driver.findElement(By.xpath("//*[contains(text(),' Sign in ')]"));
	signin.click();
	Thread.sleep(6000);
		
		
		
		
		
	}

}
