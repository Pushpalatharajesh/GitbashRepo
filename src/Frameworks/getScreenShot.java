package Frameworks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getScreenShot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("Failed.png");
		FileUtils.copyFile(src, dest);

	}

}
