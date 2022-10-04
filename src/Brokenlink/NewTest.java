package Brokenlink;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\GANESH JAVA\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
	  searchbox.sendKeys("selnium");
	  List<WebElement> li=driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
	  System.out.println("total option-"+ li.size());
	  for(int i=0;i<li.size();i++) {
		  if(li.get(i).getText().equalsIgnoreCase("selenium ide"))
		  {
			  li.get(i).click();
			  break;
		  }
	  }
  }
}
