package insta;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BaseClass
{	
	public static void login(String email, String pwd) throws Exception
	{
		Waiting.withXPath("//input[@name='username']", 10);
		Thread.sleep(500);
		driver.findElement(By.name("username")).click();
		Thread.sleep(500);
		driver.findElement(By.name("username")).sendKeys(email);
		Thread.sleep(500);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[contains(.,'Log In')])[6]")).click();		
	}
}
