package com.actitime.scripts;

import com.actitime.generic.BaseTest;
import com.actitime.generic.FWUtils;
import com.actitime.pages.CreateNewUserPage;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.EnterTimeTrackPageNayaWala;
import com.actitime.pages.LoginPage;
import com.actitime.pages.UserListPage;

public class TestPages extends BaseTest {

	public static void main(String[] args) throws InterruptedException 
	{
		BaseTest.openApplication();
		
		// To perform the actions on BaseTest
        LoginPage lp=new LoginPage(driver);
       lp.setUserName("admin");
       lp.setPassWord("manager");
       lp.clickOnCheckBox();
       lp.clickOnLoginBTN();
       Thread.sleep(30);
       FWUtils fu=new FWUtils();
       fu.verifyPage(driver,driver.getTitle());
      // lp.verifyErrMsg();
       //BaseTest.closeApplication();
       Thread.sleep(30);
       
       //To perform actions on ENTER TIME TRACK PAGE.
       EnterTimeTrackPageNayaWala etpn=new EnterTimeTrackPageNayaWala(driver);
       etpn.clickOnUsersTab();
       fu.verifyPage(driver, driver.getTitle());
       
       //To perform actions on User List page.
       UserListPage ulp=new UserListPage(driver);
      /* ulp.clickOnCreateNewUserBUTTON();
       fu.verifyPage(driver, driver.getTitle());
       Thread.sleep(2000);
       
       
       CreateNewUserPage cnup=new CreateNewUserPage(driver);
       cnup.setUserName("ramba");
       cnup.setPassword();
       cnup.setReTypePassword();
       cnup.selectFromAccssDDLIST();
       cnup.setFirstNameTextBOX();
       cnup.setLastNameTextBOX();
       cnup.setMobileNumTextBOX();
       cnup.setEmailIdTextBOX();
       cnup.clickOnEnterTimeTrackCheckBOX();
       cnup.clickOnmodifyTimeTrackOfOtherUsersCheckBOX();
       cnup.setworkDurationTextBOX();
       cnup.clickOnCreateUserBUTTON();
       fu.verifyPage(driver, driver.getTitle());
       if(driver.getTitle().equals("User List"))
       { ulp.checkSuccessMsg();
           ulp.removeUser();}
       else
    	   cnup.checkErrorMsgAlreadyRegistered();
       cnup.clearUserName();
      */Thread.sleep(2000);
       ulp.removeUser(); 
       
       
       
       
       
       
     
       

	}

}
