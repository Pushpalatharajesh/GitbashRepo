package Frameworks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AuthenticationPopups {
@Test
	public void m2() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
