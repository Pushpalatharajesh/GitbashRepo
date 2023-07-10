package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='View Time-Track']")
	private WebElement ViewTime;

	public WebElement getViewTime() {
		return ViewTime;
	} 
			
public void view()
{
	ViewTime.click();
}
}