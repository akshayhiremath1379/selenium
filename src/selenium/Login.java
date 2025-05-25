package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends InterfaceLogin {
        
	WebDriver driver;
	String destDir = "C:\\Users\\IT POINT\\Documents\\selnium\\selenium\\reports";
	String destFile = destDir + "\\screenshot.png";

		// TODO Auto-generated method stub
        @BeforeTest
        public void webDriverIntialize() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

        }
        
		@Test
		public void test() throws IOException{
			Login lo = new Login();

			lo.green();
			String abc = driver.findElement(lo.buttonLogin).getAttribute("value");

			driver.findElement(lo.buttonLogin).click();
			System.out.println(abc);					
          File fis = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(fis, new File(destFile));
		}
		@Test (timeOut = 6000)

		public void test2() {	
			Login lo = new Login();

			WebElement  abcd = driver.findElement(lo.buttonLogin);

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",abcd );
			System.out.println("hello test2");		

		}
		
		@AfterTest
		public void closetest() {
			driver.quit();

		}
		
	

}
