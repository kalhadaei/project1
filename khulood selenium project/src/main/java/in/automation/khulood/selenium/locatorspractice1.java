package in.automation.khulood.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorspractice1 {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kalha\\eclipse-workspace\\khulood selenium project\\drivers2\\chromedriver.exe");
		driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	WebElement email= driver.findElement(By.id("email"));
	email.sendKeys("koki@gmail");
	WebElement pass= driver.findElement(By.id("pass"));
	pass.sendKeys("koki");
	Thread.sleep(6000);
	driver.close();
	
	
	}

}
