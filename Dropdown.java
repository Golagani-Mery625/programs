package web1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{
   public static void main(String[] args)
   {
	   System.setProperty("webdriver.chrome.driver",
	   			"C://Users//admin//Downloads//chromedriver_win32/chromedriver.exe");
		  WebDriver ObjDriver=new ChromeDriver();
		  ObjDriver.get("http://demo.automationtesting.in/Register.html");
	   /*WebElement Skill_dropdown=ObjDriver.findElement(By.xpath("//*[@id='Skills']"));
	   Select skill=new Select(Skill_dropdown);
	   List<WebElement> dropdown=skill.getOptions();
	     for(int i=0;i<dropdown.size();i++)
	     {
	    	 String drop_down_values=dropdown.get(i).getText();
	    	 System.out.println("dropdown values are"+drop_down_values);
	     }*/
		  WebElement Country_dropdown=ObjDriver.findElement(By.xpath("//*[@id='countries']"));
		   Select country=new Select(Country_dropdown);
		   List<WebElement> dropdown=country.getOptions();
		     for(int i=0;i<dropdown.size();i++)
		     {
		    	 String drop_down_values=dropdown.get(i).getText();
		    	 System.out.println("dropdown values are"+drop_down_values);
		     }
		  
	     
   }
}
