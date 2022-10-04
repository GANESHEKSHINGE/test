package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterDemo {
  @Test
 // @Parameters({"uname,pword"})
  @Parameters({"uname","pword"})
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\GANESH JAVA\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']"));
		
  }
}
