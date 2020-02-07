package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage
{
@FindBy(xpath="//input[@value='Create New User']")
private WebElement createNewUserBUTTON;

public UserListPage(WebDriver driver)
{
PageFactory.initElements(driver,this);	
}

public void clickOnCreateNewUserBUTTON()
{
	createNewUserBUTTON.click();
	}
@FindBy(xpath="//span[contains(text(),'created')]")
private WebElement successmessg;
public void checkSuccessMsg()
{
	  if(successmessg.isDisplayed())
		  System.out.println(successmessg.getText());
}

@FindBy(xpath="//a[text()='chandra, ravi (ravi)']")
private WebElement username;
public void removeUser()
{
	username.click();
	
	
}














}
