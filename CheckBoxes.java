package web1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args)
   {
		System.setProperty("webdriver.chrome.driver",
	   			"C://Users//admin//Downloads//chromedriver_win32/chromedriver.exe");
		  WebDriver ObjDriver=new ChromeDriver();
		  ObjDriver.get("http://demo.automationtesting.in/Register.html");
		  //*[@id="basicBootstarpForm"]
		  WebElement check_button=ObjDriver.findElement(By.xpath("//*[@id='checkbox1']"));
		  check_button.click();
		  boolean status=check_button.isDisplayed();
		  System.out.println("check button is Disabled>>"+status);
		  boolean enabled_status=check_button.isEnabled();
		  System.out.println("check button is Enable>>"+enabled_status);
		  WebElement check_button1=ObjDriver.findElement(By.xpath("//*[@id='checkbox2']"));
		  check_button1.click();
		  boolean status1=check_button.isDisplayed();
		  System.out.println("check button is Disabled>>"+status1);
		  boolean enabled_status1=check_button1.isEnabled();
		  System.out.println("check button is Enable>>"+enabled_status1);
		  WebElement check_button2=ObjDriver.findElement(By.xpath("//*[@id='checkbox3']"));
		  check_button2.click();
		  boolean status2=check_button.isDisplayed();
		  System.out.println("check button is Disabled>>"+status2);
		  boolean enabled_status2=check_button2.isEnabled();
		  System.out.println("check button is Enable>>"+enabled_status2);
		  
		 
		  
		  ObjDriver.close();
	}

}
