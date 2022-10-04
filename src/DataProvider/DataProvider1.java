package DataProvider;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProvider1 {

	@Test 
	@ DataProvider(name="login")
	public void login(String un,String pwd
			) {
		System.setProperty("webdriver.chrome.driver","C:\\GANESH JAVA\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
