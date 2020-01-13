package web1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCount 
{
   public static void main(String[] args)
   {
	  System.setProperty("webdriver.chrome.driver",
    			"C://Users//admin//Downloads//chromedriver_win32/chromedriver.exe");
	  WebDriver ObjDriver=new ChromeDriver();
	  ObjDriver.get("https://demo.opencart.com/index.php?route=product/product&product_id=30");
	  System.out.println("Camera");
	  List<WebElement> links=ObjDriver.findElements(By.tagName("a"));
	  // a link will go with href
	  // img link will go with src
	  System.out.println("Number of links"+links.size());
	  for(WebElement ele:links)
	  {
		  System.out.println(ele.getAttribute("href"));
	  }
	  ObjDriver.close();
}
}
