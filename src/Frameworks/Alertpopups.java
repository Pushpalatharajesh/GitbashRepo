package Frameworks;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Alertpopups {
@Test
	public void m1 ()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		 driver.findElement(By.id("name")).sendKeys("Pushpa");
		 driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		 Alert alt = driver.switchTo().alert();
		System.out.println( alt.getText());
		alt.accept();
		// alt.dismiss();
		 
	}
}
