package facebook;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\GANESH JAVA\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FbAut f=new FbAut(driver);
		f.username();
		Actions a=new Actions(driver);
		a.sendKeys(Keys.TAB).build().perform();
		a.sendKeys("9762115656");
		a.sendKeys(Keys.TAB).build().perform();
		a.sendKeys(Keys.TAB).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		//a.click();
		}
}
