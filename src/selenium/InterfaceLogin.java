package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InterfaceLogin implements RulesLogin{
     WebDriver driver;
	
	public By buttonLogin = By.xpath("(//input[@value='Google Search'])[2]");
	/*
	public InterfaceLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
				
	}

	@FindBy(xpath ="(//input[@value='Google Search'])[2]")
	public WebElement buttonNew;
	*/

	@Override
	public void green() {
System.out.println("Hello Interface");		
	}
}
