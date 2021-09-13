package insta;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	static WebDriver driver;
	
	
	public static void setup() throws Exception 
	{
		String projectLocation = System.getProperty("user.dir");
		System.out.println("Project Location: " + projectLocation);

//		System.setProperty("webdriver.gecko.driver",projectLocation+"/drivers/geckodriver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",projectLocation+"/drivers/chromedriver/chromedriver.exe");

		//To disable notification pop-up
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		System.out.println("Instagram website opened");
	}
	
	public static void teardown()
	{
		driver.quit();
		System.out.println("Quit!");
	}
}
