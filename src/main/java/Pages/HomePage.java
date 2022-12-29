package Pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.Pages;

public class HomePage extends PageObject {
	
	@FindBy(xpath="//div[text()='NEW CARS']")
	private WebElementFacade newCar;
	
	@FindBy(xpath="//div[text()='Find New Cars']")
	private WebElementFacade FindNewCars;
	
	
	
	public void findNewCar()
	{
		open();
		moveTo(By.xpath("//div[text()='NEW CARS']"));
		FindNewCars.click();
		
		
		
		
	}
	
	

}
