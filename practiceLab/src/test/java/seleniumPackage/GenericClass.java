package seleniumPackage;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericClass {
	WebDriver driver;

	/*
	 * SetUpBrowser() is used to launch the requested browser and maximizes the
	 * screen size
	 */
	public void setupBrowser(String browserName) {
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", currentDir + "/Drivers/chromedriver");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", currentDir + "/Drivers/geckodriver");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("****No browser name passed****");
			System.out.println("Pass Chrome or Firefox");
			break;
		}

		driver.manage().window().maximize();
	}

	/*
	 * getSpecficURL() is used to hit the passed url as argument and validates the
	 * current url
	 */
	public void getSpecficURL(String Url) {
		driver.get(Url);
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals(Url + "/")) {
			System.out.println("The Current Url Loaded in Browser is: " + driver.getCurrentUrl());
		} else {
			System.out.println("Current Url and Expected Url Mismatched");
		}

	}

// Closes the browser
	public void closeBrowser() {
		driver.close();
		System.out.println("***Browser Closed***");
	}

	public void sendKeys(String elementType, String element, String elementData) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).sendKeys(elementData);
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).sendKeys(elementData);
			break;
		default:
			System.out.println("XPath and cssSelector are only Supported");
			break;
		}
	}

	public void clearField(String elementType, String element) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).clear();
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).clear();
			break;
		default:
			System.out.println("XPath and cssSelector are only Supported");
			break;
		}
	}

	public void clickButton(String elementType, String element) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).click();
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(elementType)).click();
			break;
		default:
			System.out.println("XPath and cssSelector are only Supported");
			break;
		}
	}

	public void submitButton(String elementType, String element) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).submit();
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).submit();
			break;
		default:
			System.out.println("XPath and cssSelector are only Supported");
			break;
		}
	}

	public void isDisplayedCheck(String elementType, String element) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).isDisplayed();
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).isDisplayed();
			break;
		default:
			System.out.println("XPath and cssSelector are only Supported");
			break;
		}
	}

	public void isEnabledCheck(String elementType, String element) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).isEnabled();
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).isEnabled();
			break;
		default:
			System.out.println("XPath and cssSelector are only Supported");
			break;
		}
	}

	public void isSelectedCheck(String elementType, String element) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).isSelected();
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).isSelected();
			break;
		default:
			System.out.println("XPath and cssSelector are only Supported");
			break;
		}
	}

	public void explicitTimeout(String elementType, String element, int waitTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
		switch (elementType.toLowerCase()) {
		case "xpath":
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(element))));
			break;
		case "cssselector":
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(element))));
			break;
		default:
			System.out.println("XPath and cssSelector are only Supported");
			break;
		}

	}

	public void fluentWait(String elementType, String element, int waitTime) {
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(waitTime)).pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		switch (elementType.toLowerCase()) {
		case "xpath":
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(element))));
			break;
		case "cssselector":
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(element))));
			break;
		default:
			System.out.println("XPath and cssSelector are only Supported");
			break;
		}

	}

	public void getTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Recived expected title");
		} else {
			System.out.println("Title mismatch");
		}

	}

	public void navigateTo(String Url) {
		driver.navigate().to(Url);
		System.out.println("Navigated to " + Url + " succesfully");
	}

	public void navigateBack() {
		driver.navigate().back();
		System.out.println("***Navigated Back***");
	}

	public void navigateForward() {
		driver.navigate().forward();
		System.out.println("***Navigated Forward***");
	}

	public void navigateRefreash() {
		driver.navigate().refresh();
		System.out.println("***Refreash Successful***");
	}
	public void textCompare(String expectedText, String elementType, String element)
	{
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).getText().equalsIgnoreCase(expectedText);
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).getText().equalsIgnoreCase(expectedText);
			break;
		default:
			System.out.println("XPath and cssSelector are only Supported");
			break;
		}
		
	}

}
