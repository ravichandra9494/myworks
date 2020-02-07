package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPageNayaWala
{
	
	@FindBy(xpath="//div[text()='Time-Track']/../div[2]/img")
	private WebElement timetrackTAB;

	@FindBy(xpath="//div[text()='Users']/../img")
	private WebElement usersTAB;
	
	public EnterTimeTrackPageNayaWala(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnUsersTab()
	{
		usersTAB.click();
	}
	 
}
