package web1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deloitte 
{
   public static void main(String[] args) 
	{
		
	    	System.setProperty("webdriver.chrome.driver",
	    			"C://Users//admin//Downloads//chromedriver_win32/chromedriver.exe");
	    	WebDriver ObjDriver=new ChromeDriver();
	    	ObjDriver.get("https://players.brightcove.net/5755101753001/default_default/index.html?videoId=6116960858001");
	    	System.out.println("Deloitte page loaded");
	    	String var1=ObjDriver.getTitle();
	    	System.out.println("Title of the page"+var1);
	    	String var2=ObjDriver.getTitle();
	    	System.out.println("Title of the page "+var2);

	}

}
