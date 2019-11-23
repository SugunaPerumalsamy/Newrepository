package testpack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BokkingTickets {
	WebDriver driver;

	public BokkingTickets(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(name="tripType")
	List<WebElement> tripType;
	
	@FindBy(name="fromPort")
	WebElement fromPort;
	
	@FindBy(name="Serviceclass")
	List<WebElement> Serviceclass;
	
	
	
	public Logout BookingTic()
	{
		for(WebElement t:tripType)
		{
			if(t.getAttribute("value").equals("oneway"))
			{
				t.click();
			}
		}
		
		Select s= new Select(fromPort);
		s.selectByVisibleText("London");
		
		return PageFactory.initElements(driver, Logout.class);
	}
	
	public Logout BookingTic2()
	{
		for(WebElement t:Serviceclass)
		{
			if(t.getAttribute("value").equals("Business"))
			{
				t.click();
			}
			}
		return PageFactory.initElements(driver, Logout.class);
	}
}
	








