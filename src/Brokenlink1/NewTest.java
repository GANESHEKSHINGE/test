package Brokenlink1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws MalformedURLException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\GANESH JAVA\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int brokenlinks=0;
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext()) 
		{
			String url=it.next().getAttribute("href");
			//oprn conection with server
			HttpsURLConnection http=(HttpsURLConnection)(new URL(url).openConnection());
			http.setRequestMethod("HEAD");
			http.connect();
			//fetch the response code
			int responde=http.getResponseCode();
			if (responde>400){
				System.out.println(url + "	is broken");
				brokenlinks++;
			}
			else {
				System.out.println(url+"	is active");
			}
			System.out.println("total broken links are"+brokenlinks );

			/*
			HttpsURLConnection http=(HttpsURLConnection)(new URL(url).openConnection());
			https.setRequestMethod("HEAD");
			https.connect();
			*/
		}
  }
}
