package in.automation.khulood.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitimplict {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kalha\\eclipse-workspace\\khulood selenium project\\drivers2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https:www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement searchfield=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']y"));
		searchfield.sendKeys("laptop");
		
		Thread.sleep(10000);
		
		
	}

}
