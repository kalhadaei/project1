package in.automation.khulood.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ilocatorsassignment {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kalha\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement Password=driver.findElement (By.id("pass"));
		Password .click();
		//WebElement Alreadyhaveanaccount=driver.findElement(By.linkText("Alreadyhaveanaccount"));
		//Alreadyhaveanaccount.click();
		WebElement CreatelkAccount=driver.findElement(By.partialLinkText("Create new"));
		CreatelkAccount.click();
		Thread.sleep(6000);
		
		WebElement names= driver.findElement(By.name("firstname"));
		names.sendKeys("Koki");
		
		WebElement lastnames= driver.findElement(By.name("lastname"));
		lastnames.sendKeys("Hadaei");
		Thread.sleep(6000);
		
		WebElement email= driver.findElement(By.name("reg_email__"));
		 email.sendKeys("koki@gmail.com");
		 Thread.sleep(6000);

		 WebElement month=driver.findElement(By.name("birthday_month"));
		 Select ob1=new Select(month);
		 ob1.selectByVisibleText("Dec");
		 Thread.sleep(6000);
		 
		 WebElement day=driver.findElement(By.name("birthday_day"));
		 Select ob2=new Select(day);
		 ob2.selectByVisibleText("10");
		 Thread.sleep(6000);
		 
		 WebElement year=driver.findElement(By.name("birthday_year"));
		 Select ob3=new Select(year);
		 ob3.selectByVisibleText("2000");
		 Thread.sleep(6000);

		driver.close();
		
	}

}
