package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends InterfaceLogin {
        
	WebDriver driver;
		// TODO Auto-generated method stub
        @BeforeTest
        public void webDriverIntialize() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

        }
        
		@Test
		public void test() {
			Login lo = new Login();
			lo.green();
			String abc = driver.findElement(lo.buttonLogin).getAttribute("value");

			driver.findElement(lo.buttonLogin).click();
			System.out.println(abc);					

		}
		@Test (timeOut = 6000)

		public void test2() {			
			System.out.println("hello test2");		

		}
		
		@AfterTest
		public void closetest() {
			driver.close();

		}
		
	

}
