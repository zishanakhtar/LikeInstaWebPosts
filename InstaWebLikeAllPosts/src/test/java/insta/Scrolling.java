package insta;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scrolling extends BaseClass 
{
	public static void toElementWithID(String ElementID) throws Exception
	{
		WebElement element = driver.findElement(By.id(ElementID));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		System.out.println("Scrolling to: " + element);
		Thread.sleep(1000); 
	}
	
	public static void toElementWithXpath(String xpath) throws Exception
	{
		WebElement element = driver.findElement(By.xpath(xpath));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		System.out.println("Scrolling to: " + element);
		Thread.sleep(1000);    
	}
	
	public static void toElementWithClassName(String classname) throws Exception
	{
		WebElement element = driver.findElement(By.className(classname));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		System.out.println("Scrolling to: " + element);
		Thread.sleep(1000);    
	}
	
	public static void byPixel(int pixels)
	{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,"+pixels+")");
		 System.out.println("Scrolled pixels: " + pixels);
	}

}
