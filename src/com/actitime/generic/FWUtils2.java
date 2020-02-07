package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FWUtils2
{
	public static String read_XL_Data(String sheet,int row,int cell)
	{
	String data="";
	try 
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/raviexcel.xlsx"));
		data=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return data;
	
	
	}
	public static  int write_XL_Data(String sheet,int row,int cell,int v)
	{
	
	try 
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/raviexcel.xlsx"));
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(v);
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return v;
	
	
	}
	public static void takesScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./takesScreenshot/");
		FileUtils.copyFile(src, des);
		
		
		
	}
	

















}
	
	
		