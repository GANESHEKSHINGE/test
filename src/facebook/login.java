package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
@FindBy (xpath="//input[@id='email']") private WebElement uname;
@FindBy (xpath="//input[@id='pass']") private WebElement pass;
@FindBy (xpath="//button[@name='login']") private WebElement click1;
//button[@]id='u_0_9_fR'
//button[@id='u_0_9_X5']
public login(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void Username() {
		uname.sendKeys("9762115656");

}
	public void password() {
		pass.sendKeys("9762115656");
}
	public void submit() {
		click1.click();
}
}