package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserClass {
	WebDriver driver;

	public void setupBrowser() {
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		System.setProperty("webdriver.chrome.driver", currentDir + "/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void getSpecifURL(String Url) {
		driver.get(Url);
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals(Url + "/")) {
			System.out.println("The Current Url Loaded in Browser is: " + driver.getCurrentUrl());
			System.out.println("Check for Actual and Expected Url: " + driver.getCurrentUrl().contains(Url));
		} else {
			System.out.println("Current Url and Expected Url Mismatched");
//			driverobj.quit();
		}

	}

	public void closeBrowser() {
		driver.close();
		System.out.println("***Browser Closed***");
	}

}
