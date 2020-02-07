package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FWUtils implements IAutoConstant
{
	public static void verifyPage(WebDriver driver,String expectedTitle)
	{
	WebDriverWait wait =new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.titleIs(expectedTitle));
	
	String actualTitle=driver.getTitle();
	if(expectedTitle.equals(actualTitle))
	{
		System.out.println("the expected title is displayed and it is :"+expectedTitle);
	}
	else
	{
		System.out.println("the expected title page is not displayed:"+actualTitle);
	}
  }
	public static void takesScreenShot(WebDriver driver,String path)
	{
		try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
         File src=ts.getScreenshotAs(OutputType.FILE);
         File des=new File(path);
         
         FileUtils.copyFile(src, des);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
         
	}
	/**
	 * -
	 * @param path
	 * @param sheet
	 * @param rn
	 * @param cn
	 * @return
	 */
	
	public static String readXldata(String path, String sheet, int rn, int cn) 
	{
		String data = "";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			 data = wb.getSheet(sheet).getRow(rn).getCell(cn).toString();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return data;
	}
	





























}