package web1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButons 
{
   public static void main(String[] args)
   {
	   System.setProperty("webdriver.chrome.driver",
   			"C://Users//admin//Downloads//chromedriver_win32/chromedriver.exe");
	  WebDriver ObjDriver=new ChromeDriver();
	  ObjDriver.get("http://demo.automationtesting.in/Register.html");
	  WebElement radio_button=ObjDriver.findElement(By.id("radiooptions"));
	  boolean status=radio_button.isDisplayed();
	  System.out.println("radio button is displayed>>"+status);
	  boolean enabled_status=radio_button.isEnabled();
	  System.out.println("radio button is Enabled>>"+enabled_status);
	  boolean selected_status=radio_button.isSelected();
	  System.out.println("radio button is Selected>>"+selected_status);
	  radio_button.click();
	  boolean selected_status_new=radio_button.isSelected();
	  System.out.println("radio button is Selected>>"+selected_status_new);
	  ObjDriver.close();
   }
}
