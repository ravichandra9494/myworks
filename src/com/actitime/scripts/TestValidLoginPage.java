package com.actitime.scripts;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.actitime.generic.BaseTest;
import com.actitime.generic.FWUtils;
import com.actitime.pages.LoginPage;

public class TestValidLoginPage extends BaseTest {
	 

	public static void main(String[] args) throws InterruptedException 
	{
		BaseTest.openApplication();
		//create a LoginPage object
		LoginPage lp=new LoginPage(driver);
          lp.setUserName("admin");
        //call the PageObject method for performing actions on the password textbox
          lp.setPassWord("manager");
        //call the PageObject method for clicking on login button
          lp.clickOnLoginBTN();
          //verify whether the homepage ie Enter Time track page is displayec or not
          Thread.sleep(20);
          String title = driver.getTitle();
          System.out.println(title);
          FWUtils fu=new FWUtils();
          fu.verifyPage(driver,title);
          
         int a=10,b=20,c;
         c=a+b;
         System.out.println(c);
          

          BaseTest.closeApplication();      

	}

}
