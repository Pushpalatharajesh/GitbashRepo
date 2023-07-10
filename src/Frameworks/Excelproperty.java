package Frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Excelproperty {

	public static void main(String[] args) throws Throwable {
		
			WebDriver driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			FileInputStream fis=new FileInputStream("./commondata.properties.txt");
			Properties pro=new Properties();
			pro.load(fis);
			String URL = pro.getProperty("url1");
			driver.get(URL);
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			FileInputStream fes=new FileInputStream("./excelsheet.xlsx");
			
			Workbook book = WorkbookFactory.create(fes);
			Sheet s1 = book.getSheet("Flipkart");
			
			Row r = s1.getRow(0);
			Cell cel = r.getCell(0);
			
		String ExcelData = cel.getStringCellValue();
		driver.findElement(By.name("q")).sendKeys(ExcelData);

	}

}
