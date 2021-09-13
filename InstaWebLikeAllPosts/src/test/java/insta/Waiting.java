package insta;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiting extends BaseClass
{
	public static void withID (String resourceId, long time) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(resourceId)));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(resourceId)));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(resourceId)));
		Thread.sleep(1000);
	}
	
	public static void withXPath (String xpath, long time) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		Thread.sleep(1000);
	}
	
	public static void forElement(WebElement element, long time) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Thread.sleep(1000);
	}

}
