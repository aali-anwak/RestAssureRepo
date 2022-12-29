package Steps;

import Pages.HomePage;
import Pages.MarutiSuzuki;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class StepsClass {
	
	@Steps
	HomePage home;
	
	@Steps
	MarutiSuzuki mSuzuki;
	
	
	@Step
	public void stepsFindNewCars()
	{
		home.findNewCar();
	}
	
	@Step
	public void stepsClickOnMarutiSuzuki(String brand) throws InterruptedException
	{
		mSuzuki.clickOnMarutiSuzuki(brand);
		//mSuzuki.FindBrandNPrice(brand);
	}
	
	

}
