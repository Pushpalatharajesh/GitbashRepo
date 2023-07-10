package Frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import pom.HomePage;
import pom.LoginPage;




public class Properties_file {

	public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new EdgeDriver();
	//driver.get("https://demo.actitime.com/login.do");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fis=new FileInputStream("./commondata.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		
		String URL=pro.getProperty("url");
		String USERNAME=pro.getProperty("username");
		String PASSWORD=pro.getProperty("password");
		
		driver.get(URL);
		LoginPage log=new LoginPage(driver);
		log.login(USERNAME, PASSWORD);
		
		HomePage home=new HomePage(driver);
		home.view();
		
	/*	driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys( PASSWORD);
		driver.findElement(By.id("loginButton")).click();			*/
		
		
		  
		
		
 	

	}

}
