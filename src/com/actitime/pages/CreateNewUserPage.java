package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUserPage 
{
	public CreateNewUserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTextBOX;
	
	public void setUserName(String username)
	{
		usernameTextBOX.sendKeys(username);
	}
	public void clearUserName()
	{
		usernameTextBOX.clear();;
	}
	
	
	@FindBy(xpath="//input[@name='passwordText']")
	private WebElement passwordTextBOX;
	public void setPassword()
	{
		passwordTextBOX.sendKeys("9494");
	}
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement accessDropDownList;
	public void selectFromAccssDDLIST()
	{
		Select accssDDLst=new Select(accessDropDownList);
		accssDDLst.selectByIndex(1);
	}
	
	@FindBy(xpath="//input[@name='passwordTextRetype']")
	private WebElement retypePasswordTextBOX;
	public void setReTypePassword()
	{
		retypePasswordTextBOX.sendKeys("9494");
	}
	
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstNameTextBOX;
	public void setFirstNameTextBOX()
	{
		firstNameTextBOX.sendKeys("Lucky");
	}
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastNameTextBOX;
	public void setLastNameTextBOX()
	{
		lastNameTextBOX.sendKeys("Ravi");
	}
	
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileNumTextBOX;
	public void setMobileNumTextBOX()
	{
		mobileNumTextBOX.sendKeys("9494712192");
	}
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailIdTextBOX;
	public void setEmailIdTextBOX()
	{
		emailIdTextBOX.sendKeys("krcapply@gmail.com");
	}
	
	@FindBy(xpath="//input[@name='workdayDurationStr']")
	private WebElement workDurationTextBOX;
	public void setworkDurationTextBOX()
	{   workDurationTextBOX.clear();
		workDurationTextBOX.sendKeys("9:00");
	}
	
	@FindBy(xpath="//input[@id='right9']")
	private WebElement enterTimeTrackCheckBOX;
	public void clickOnEnterTimeTrackCheckBOX()
	{   
		enterTimeTrackCheckBOX.click();
	}
	
	@FindBy(xpath="//input[@id='right12']")
	private WebElement modifyTimeTrackOfOtherUsersCheckBOX;
	public void clickOnmodifyTimeTrackOfOtherUsersCheckBOX()
	{   
		modifyTimeTrackOfOtherUsersCheckBOX.click();
	}
	
	@FindBy(xpath="//input[@id='right1']")
	private WebElement generateReportsCheckBOX;
	
	@FindBy(xpath="//input[@id='right2']")
	private WebElement manageCustomersAndProjectsCheckBOX;
	
	
	@FindBy(xpath="//input[@id='right13']")
	private WebElement 	manageTasksCheckBOX;
	
	@FindBy(xpath="//input[@id='right5']")
	private WebElement manageUsersCheckBOX;
	
	
	
	@FindBy(xpath="//input[@id='right7']")
	private WebElement manageBillingTypesCheckBOX;
	
	@FindBy(xpath="//input[@id='right10']")
	private WebElement manageWorkScheduleCheckBOX;
	

	@FindBy(xpath="//input[@id='right11']")
	private WebElement manageGeneralSettingsCheckBOX;
	
	@FindBy(xpath="//input[@value='   Create User   ']")
	private WebElement createUserBUTTON;
	public void clickOnCreateUserBUTTON()
	{
		createUserBUTTON.click();
	}
	
	@FindBy(xpath="//input[@value='      Cancel      ']")
	private WebElement cancelBUTTON;
	
	@FindBy(xpath="//span[contains(text(),'already registered.')]")
	private WebElement errorMsgAlreadyRegistered;
	public void checkErrorMsgAlreadyRegistered()
	{
		if(errorMsgAlreadyRegistered.isDisplayed())
		{
			System.out.println(errorMsgAlreadyRegistered.getText());
			System.out.println("please try with other name");
		}
	}
	
	 
	
	
	
}
