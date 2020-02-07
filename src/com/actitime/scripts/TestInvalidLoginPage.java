package com.actitime.scripts;
import com.actitime.generic.BaseTest;
import com.actitime.generic.FWUtils;
import com.actitime.pages.LoginPage;

public class TestInvalidLoginPage extends BaseTest
{
	public static void main(String[] args)
         {

           BaseTest.openApplication();
           LoginPage lp=new LoginPage(driver);
          lp.setUserName("sunny");
          lp.setPassWord("deol");
          lp.clickOnCheckBox();
          lp.clickOnLoginBTN();
          lp.verifyErrMsg();
          BaseTest.closeApplication();
          
         }
}
		
		
			