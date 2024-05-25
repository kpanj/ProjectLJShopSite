package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(id="pass")
	private WebElement passwordTextField;
	
	@FindBy(id="send2")
	private WebElement signInBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void emailTF() {
		emailTextField.sendKeys("meenakshimahajan@sourcemash.com");
	}
	public void passwordTF() {
		passwordTextField.sendKeys("Test@123");
	}
	public void signIn() {
		signInBtn.click();
	}
}
