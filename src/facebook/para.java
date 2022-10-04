package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class para {
  @Test
  @Parameters ({"uname","pword"})
  public void f(String un,String ps) {
	  System.setProperty("webdriver.chrome.driver", "C:\\GANESH JAVA\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement un1=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement ps1=driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement smit=driver.findElement(By.xpath("//button[@name='login']"));
		un1.sendKeys(un);
		ps1.sendKeys(ps);
		smit.click();
				
  }
}
