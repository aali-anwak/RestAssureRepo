package Pages;

import java.time.Duration;
import java.util.List;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;

import com.ibm.icu.impl.Assert;
import static org.junit.Assert.*;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.FindBy;


public class MarutiSuzuki extends PageObject {

	@FindBy(xpath="//div[text()='Maruti Suzuki']")
	private WebElementFacade marutiSuzuki;
	
	@FindBy(xpath="//a[@class='o-cKuOoN o-frwuxB ']")
	private WebElementFacade hyundai;
	
	
	
	
	@FindBy(xpath="//h1[text()='Maruti Cars']")
	private WebElementFacade name;
	
	@FindBy(xpath="//h3[@class='o-jjpuv o-cVMLxW o-mHabQ o-fzpibK']")
	private ListOfWebElementFacades brands;
	
	@FindBy(xpath="//h3[@class='o-jjpuv o-cVMLxW o-mHabQ o-fzpibK'][text()='Maruti Suzuki Grand Vitara']")
	private WebElementFacade firstMaruti;
	
	@FindBy(xpath="//h3[@class='o-jjpuv o-cVMLxW o-mHabQ o-fzpibK'][text()='Hyundai Venue']")
	private WebElementFacade firstHyundai;
	
	@FindBy(xpath="//span[@class='o-eZTujG o-byFsZJ o-bkmzIL o-bVSleT']")
	private ListOfWebElementFacades prices;
	
	
	String text=null;
	
	public void clickOnMarutiSuzuki(String brand) throws InterruptedException
	{
		System.out.println("The brand is as:- "+brand);
		
		if(brand.equalsIgnoreCase("Maruti Suzuki"))
		{
		waitForCondition().withTimeout(Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Maruti Suzuki']"))).click();
		//waitForCondition().withTimeout(Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Maruti Suzuki']"))).click();


		
			text=waitForCondition().withTimeout(
						Duration.ofSeconds(10)).until(
								ExpectedConditions.presenceOfElementLocated(
										By.xpath("//h1[text()='Maruti Cars']"))).getText();
			
				System.out.println("The name of the brand is as: "+ text);
				//List<WebElementFacade> myListOfElements = findAll(By.xpath("//h3[@class='o-jjpuv o-cVMLxW o-mHabQ o-fzpibK']"));
				 //System.out.println("The size of the list is as:- "+myListOfElements.size());
				//org.junit.Assert.assertFalse("assertion failed as the text did not macth",text.contains(brand));
				
				waitForCondition().withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[@class='o-jjpuv o-cVMLxW o-mHabQ o-fzpibK'][text()='Maruti Suzuki Grand Vitara']")));
				System.out.println("The first car is as:- "+firstMaruti.getText());
				
		
		} else if(brand.equalsIgnoreCase("Hyundai"))
		{
			waitForCondition().withTimeout(Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='o-cKuOoN o-frwuxB ']"))).click();	
			Thread.sleep(5000);
			text=waitForCondition().withTimeout(
					Duration.ofSeconds(10)).until(
							ExpectedConditions.presenceOfElementLocated(
									By.xpath("//a[@class='o-cKuOoN o-frwuxB ']"))).getText();
		//	System.out.println("The name of the brand is as: "+ text);
			//List<WebElementFacade> elements=findAll(By.xpath("//h3[@class='o-jjpuv o-cVMLxW o-mHabQ o-fzpibK']"));
			//List<WebElementFacade> myListOfElements = findAll(By.xpath("//h3[@class='o-jjpuv o-cVMLxW o-mHabQ o-fzpibK']"));
			 //System.out.println("The size of the list is as:- "+elements.size());
			//org.junit.Assert.assertFalse("assertion failed bcoz it was supposed to fail",text.contains(brand));
			
			waitForCondition().withTimeout(Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[@class='o-jjpuv o-cVMLxW o-mHabQ o-fzpibK'][text()='Hyundai Venue']")));
			System.out.println("The first car is as:- "+firstHyundai.getText());
		}
		
	}

	/*public void FindBrandNPrice(String brand) {
		
		System.out.println("The brand is as:- "+brand);
		
		if(brand.equalsIgnoreCase("Maruti Suzuki"))
		{
			int a=10;
		//waitForCondition().withTimeout(Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h3[@class='o-jjpuv o-cVMLxW o-mHabQ o-fzpibK']")));
		//waitForCondition().withTimeout(Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='o-eZTujG o-byFsZJ o-bkmzIL o-bVSleT']")));
		waitForCondition().withTimeout(Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Maruti Suzuki']"))).click();
			
			 List<WebElementFacade> myListOfElements = findAll(By.xpath("//h3[@class='o-jjpuv o-cVMLxW o-mHabQ o-fzpibK']"));
			 System.out.println("The size of the list is as:- "+myListOfElements.size());
			
		
	
		
			
		
		} else if(brand.equalsIgnoreCase("Hyundai"))
		{
			//waitForCondition().withTimeout(Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h3[@class='o-jjpuv o-cVMLxW o-mHabQ o-fzpibK']")));	
			//waitForCondition().withTimeout(Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='o-eZTujG o-byFsZJ o-bkmzIL o-bVSleT']")));

			
			
		}
		
		
		
		
	}
	*/
	
	

}

