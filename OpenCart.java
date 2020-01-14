package web1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenCart 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver",
   			"C://Users//admin//Downloads//chromedriver_win32/chromedriver.exe");
	 WebDriver ObjDriver=new ChromeDriver();
	 ObjDriver.get("https://demo.opencart.com/index.php?route=account/login");
	//demo.opencart.com/index.php?route=account/login
	 
	 ObjDriver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input")).click();
	WebElement Obj= ObjDriver.findElement(By.xpath("//*[@id='account-login']/div[1]"));
	 System.out.println(Obj.getText());
	 try
	 {
		 Thread.sleep(5000);
		 
	 }catch(InterruptedException e){
		 e.printStackTrace();
	 }
    
}

}
