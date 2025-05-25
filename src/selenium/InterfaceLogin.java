package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v135.page.Page;
import org.openqa.selenium.support.PageFactory;

public class InterfaceLogin implements RulesLogin{
     WebDriver driver;
	@Override
	public void green() {
		System.out.println("hello interface");
		// TODO Auto-generated method stub
		
	}
	public By buttonLogin = By.xpath("(//input[@value='Google Search'])[2]");
}
