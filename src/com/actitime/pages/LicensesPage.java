  package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LicensesPage 
{
	@FindBy(xpath="//nobr[text()='Product Edition:']/../../td[2]/b")
	private WebElement productEdition;
	
	@FindBy(xpath ="//nobr[text()='Issue Date:']/../../td[2]")
	private WebElement issueDate;
	
	public LicensesPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifyProductEdition()
	{
		String ePEdition="actitime 201.4";
		String aPEdition=productEdition.getText();
		
		if (ePEdition.equals(aPEdition))
		{
			System.out.println("the expected product edition is:"+ePEdition);
		}
		else
		{
			System.out.println("the actual product edition is:"+aPEdition);
		}
		
	}
	
	public void verifyIssueDate()
	{
		String eIDate="July 14, 2017";
		String aIDate=issueDate.getText();
		
		if (eIDate.equals(aIDate))
		{
			System.out.println("the expected issue date present is:"+eIDate);
		}
		else
		{
			System.out.println("the actual issue date is:"+aIDate);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
