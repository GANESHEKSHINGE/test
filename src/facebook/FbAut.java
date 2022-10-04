package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbAut {
	@FindBy (xpath="//input[@id='email']") private WebElement uname;
public FbAut(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void username() {
	uname.sendKeys("9762115656");
}



}
