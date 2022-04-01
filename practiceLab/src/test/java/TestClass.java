import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	WebDriver driver;

	public static void main(String[] args) {
		TestClass ob = new TestClass();
		ob.setupBrowser();
		ob.getUrl();
		ob.sendKeys("//input[@id='twotabsearchtextbox']", "smartphones");
//		//input[@id='nav-search-submit-button']

	}

	public void setupBrowser() {
		

		String currentDir = System.getProperty("user.dir");
		boolean browserInstance;
		System.out.println(currentDir);
		System.setProperty("webdriver.chrome.driver", currentDir + "/Drivers/chromedriver");
		driver = new ChromeDriver();

	}
	public void getUrl()
	{
		driver.get("https://www.amazon.in/");
	}
	public void sendKeys(String element, String data)
	{
		driver.findElement(By.xpath(element)).sendKeys(data);
	}
	public void clickButton(String element)
	{
		driver.findElement(By.xpath(element)).click();
	}
}