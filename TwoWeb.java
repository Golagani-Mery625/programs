package web1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWeb 
{
	public static void main(String[] args)
    {
    	System.setProperty("webdriver.chrome.driver",
    			"C://Users//admin//Downloads//chromedriver_win32/chromedriver.exe");
    	WebDriver ObjDriver=new ChromeDriver();
    	ObjDriver.get("https://www.freejobalerts.com/");
    	System.out.println("free job alerts page loaded");
    	String var1=ObjDriver.getTitle();
    	System.out.println("Title of the page"+var1);
    	WebElement  Obj1=ObjDriver.findElement(By.xpath("/html/body/section[1]"));
    	Obj1.click();
    	String var2=ObjDriver.getTitle();
    	System.out.println("Title of the page "+var2);
    	if(var1==var2)
    		System.out.println("page found");
    	else 
    		System.out.println("Page not found");
}
}
