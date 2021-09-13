package insta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass
{	
	//Click Not Now on Save Login Info
	public static void clickNotNow() throws Exception
	{
		try
		{
			Waiting.withXPath("//button[contains(.,'Not Now')]", 10);
			driver.findElement(By.xpath("//button[contains(.,'Not Now')]")).click();
			System.out.println("Clicked Not Now button");
			Thread.sleep(500);
		} catch (Exception e)
		{
			System.out.println("Save Login Info popup didn't open");
		}
	}

	//Scroll to the next unclicked like button
	public static void scrollToLikeBtn() throws Exception
	{
		Scrolling.toElementWithXpath("//*[@aria-label='Like']");
		Thread.sleep(500);
	}

	//Prints username of the profile on screen. Currently not using in the program.
	public static void getUsername()
	{
		try
		{
			Scrolling.toElementWithXpath("(//div[@class='o-MQd z8cbW '])");
			String username = driver.findElement(By.xpath("(//div[@class='o-MQd z8cbW '])")).getText();
			System.out.println("Username: " + username);
		} catch (Exception e)
		{
			System.out.println("Username not found");
		}
	}

	//Clicks on all unclicked like buttons, both post and visible comments on feed
	public static void likePost() throws Exception
	{
		Thread.sleep(1000);
		WebElement btn_like = driver.findElement(By.xpath("//*[@aria-label='Like']"));
		btn_like.click();
		Thread.sleep(500);	
	}

	//This will like all the posts and visible comments on the feed
	@SuppressWarnings("unused")
	public static void likeAllPosts() throws Exception
	{
		Waiting.withXPath("(//div[@class='_9AhH0'])[1]", 20); //Waiting for 3 dots More Options
		Thread.sleep(500);
		try
		{
			int loopCount = 1;
			int likeCount = 1;
			while(likeCount <= InstaMain.maxLikes)
			{
				try
				{
					scrollToLikeBtn();
					likePost();
					System.out.println("Like Count: " + likeCount);
					likeCount++;
					Scrolling.byPixel(200);
				} catch (Exception e)
				{
					Scrolling.byPixel(500);
				}
				loopCount++;
			} 
			teardown();
		} catch (Exception e)
		{
			teardown();
		}
	}
}
