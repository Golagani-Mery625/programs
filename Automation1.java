package web1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//getting ivalid password and usernames
public class Automation1 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver",
   			"C://Users//admin//Downloads//chromedriver_win32/chromedriver.exe");
	 WebDriver ObjDriver=new ChromeDriver();
	 ObjDriver.get("http://demo.automationtesting.in/SignIn.html");
	 //demo.automationtesting.in/Register.html

	 ObjDriver.findElement(By.xpath("//*[@id='enterbtn']")).click();
	WebElement Obj= ObjDriver.findElement(By.xpath("//*[@id='errormsg']"));
	System.out.println(Obj.getText());
	 
	 try
	 {
		 Thread.sleep(5000);
		 
	 }catch(InterruptedException e){
		 e.printStackTrace();
	 }
        
     ObjDriver.quit();
	 
}

}
