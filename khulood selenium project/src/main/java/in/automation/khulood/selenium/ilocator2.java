package in.automation.khulood.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilocator2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kalha\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("http://www.protrainingtech.com");
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement Password=driver.findElement (By.id("pass"));
		Password .click();
		
	}

}
