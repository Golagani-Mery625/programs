package com.TestOne;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FunctionCalling {
	WebDriver objDriver = new ChromeDriver();
	Properties objProperties= new Properties();
	public boolean LaunchOpenCart()throws FileNotFoundException, IOException,ElementNotVisibleException, InterruptedException, BiffException {
		objProperties.load(new FileInputStream("C://Users//admin//Desktop//Xpath.properties"));
		objDriver.get(objProperties.getProperty("url"));
		objDriver.manage().window().maximize();
		WebElement objverify= objDriver.findElement(By.xpath("//title"));
		if(objverify.getAttribute("text").equals("Your Store"))
		{
			return(true);
		}
		else
		{
			return(false);
		}

	}

	public boolean LinkLogin() throws FileNotFoundException, IOException, InterruptedException
	{


		objProperties.load(new FileInputStream("C://Users//admin//Desktop//Xpath.properties"));
		Thread.sleep(10000);	
		WebElement login1= objDriver.findElement(By.xpath(objProperties.getProperty("lnk_login")));
		login1.click();
		WebElement objverify= objDriver.findElement(By.xpath("//title"));
		if(objverify.getAttribute("text").equals("Account Login"))
		{
			return(true);
		}
		else
		{
			return(false);

		}
	}

	public boolean Login() throws FileNotFoundException, IOException, BiffException, InterruptedException{

		objProperties.load(new FileInputStream("C://Users//admin//Desktop//Xpath.properties"));
		Thread.sleep(2000);

		File myfile= new File("C://Users//admin//Desktop//TestcaseOne1.xls");

		Workbook objwork = Workbook.getWorkbook(myfile);
		Sheet objsheet = objwork.getSheet("TC008");

		Cell objcell  = objsheet.getCell(0,1);
		String a= objcell.getContents();
		Cell objcell_next  = objsheet.getCell(1,1);
		String b= objcell_next.getContents();


		WebElement username= objDriver.findElement(By.xpath(objProperties.getProperty("txt_email")));
		username.sendKeys(a);

		WebElement password= objDriver.findElement(By.xpath(objProperties.getProperty("txt_passwrd")));
		password.sendKeys(b);

		WebElement login= objDriver.findElement(By.xpath(objProperties.getProperty("btn_login")));
		login.click();
		WebElement objverify= objDriver.findElement(By.xpath("//title"));
		if(objverify.getAttribute("text").equals("My Account"))
		{
			return(true);
		}
		else
		{
			return(false);

		}
	}

	public boolean LinkLogout() throws FileNotFoundException, IOException, InterruptedException{
		//WebDriver objDriver=new FirefoxDriver();
		//Properties objProperties= new Properties();
		objProperties.load(new FileInputStream("C://Users//admin//Desktop//Xpath.properties"));
		Thread.sleep(3000);

		WebElement logout= objDriver.findElement(By.xpath(objProperties.getProperty("lnk_logout")));
		logout.click();
		objDriver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		WebElement objverify= objDriver.findElement(By.xpath("//title"));
		if(objverify.getAttribute("text").equals("Your Store"))
		{
			return(true);
		}
		else
		{
			return(false);

		}
	}
} 








