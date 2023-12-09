package in.automation.khulood.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browesers2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\kalha\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
driver=new ChromeDriver();
//driver.get("http://www.protrainingtech.com");
driver.navigate().to("http://www.protrainingtech.com");
driver.manage().window().maximize();
Thread.sleep(6000);
driver.navigate().back();
Thread.sleep(6000);
driver.navigate().forward();
System.out.println(driver.getCurrentUrl());
String windowhandle=driver.getWindowHandle();
System.out.println(windowhandle);
	}

}
