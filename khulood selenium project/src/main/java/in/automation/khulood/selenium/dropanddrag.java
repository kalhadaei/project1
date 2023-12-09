package in.automation.khulood.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropanddrag {
      public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kalha\\eclipse-workspace\\khulood selenium project\\drivers2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.switchTo().frame(0);
		
		WebElement dragable= driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dropable= driver.findElement(By.xpath("//*[@id='droppable']"));
		Thread.sleep(6000);
		
		Actions ob=new Actions(driver);
		
		ob.dragAndDrop(dragable, dropable).build().perform();
		Thread.sleep(6000);
		
	}
}
