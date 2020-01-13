package web1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asses1
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
	   			"C://Users//admin//Downloads//chromedriver_win32/chromedriver.exe");
		  WebDriver ObjDriver=new ChromeDriver();
		  ObjDriver.get("https://demo.opencart.com/index.php?route=product/category&path=57");
		  WebElement Sort_dropdown=ObjDriver.findElement(By.xpath("//*[@id='input-sort']"));
		  Select sort=new Select(Sort_dropdown);
		  List<WebElement> dropdown=sort.getOptions();
		     for(int i=0;i<dropdown.size();i++)
		     {
		    	 if(i==1||i==dropdown.size()-1)
		    	 {
		    	 String drop_down_values=dropdown.get(i).getText();
		    	 System.out.println("sort min and max are"+drop_down_values);
		    	 }
		    	 else
		    		 continue;
		     }
		     WebElement Show_dropdown=ObjDriver.findElement(By.xpath("//*[@id='input-limit']"));
			  Select show=new Select(Show_dropdown);
			  List<WebElement> dropdown1=show.getOptions();
			  for(int i=0;i<dropdown1.size();i++)
			     {
			    	 if(i==1||i==dropdown1.size()-1)
			    	 {
			    	 String drop_down_values1=dropdown1.get(i).getText();
			    	 System.out.println("show min and max are"+drop_down_values1);
			    	 }
			    	 else
			    		 continue;
			     }
			  
			  
			  
		     
		  
		  
		  
	}

}
