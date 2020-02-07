package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	@FindBy(name="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement lgnBTN;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement chkBOX;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement ErrMsg;
	
	public LoginPage(WebDriver driver)
	  {
	   PageFactory.initElements(driver, this);
	  }
	
	public void setUserName(String un) 
	   {
	   unTB.sendKeys(un);
	   }
	
	public void setPassWord(String pw) 
	   {
		pwTB.sendKeys(pw);
		}
	public void clickOnCheckBox() 
	   {
	   chkBOX.click();
	   }
	
	public void clickOnLoginBTN()
	    {
		lgnBTN.click();
		}
	
       public void verifyErrMsg()
	   {
		if(ErrMsg.isDisplayed())
		   System.out.println("the error message is displayed:"+ErrMsg.getText());
		}
}
