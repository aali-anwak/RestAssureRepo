package TestPackage;

import org.bouncycastle.crypto.generators.OpenBSDBCrypt;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Steps.StepsClass;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

@Narrative(text= {"this is to play with excel","never mind"})
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("./src/test/resources/car brand.csv")

public class CarTest {
	
	@Managed
	WebDriver driver;
	
	@Steps
	StepsClass steps;
	
	private String brand;
	
	

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Test
	public void testFindNewCars()
	{
		
		steps.stepsFindNewCars();
		
	}
	
	@Test
	public void testClickOnBrand() throws InterruptedException
	{
		
		steps.stepsClickOnMarutiSuzuki(brand);
		
	}
	
	
	
	
	

}
