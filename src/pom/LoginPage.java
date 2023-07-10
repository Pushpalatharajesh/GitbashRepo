package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="username")
	private WebElement UserTextField;
	
	@FindBy(name="pwd")
	private WebElement PasswordTextField;
	
	@FindBy(id="loginButton")
	private WebElement Loginbutton;
	
	//getter method

	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}
public void login(String username, String password)
{
	UserTextField.sendKeys(username);
	PasswordTextField.sendKeys(password);
	Loginbutton.click();
	
	
}
	
	
}
