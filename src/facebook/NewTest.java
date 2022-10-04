package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
  }
  @Test
  public void facebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\GANESH JAVA\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login l=new login(driver);
		l.Username();
		l.password();
		l.submit();
		
  }
}
