package seleniumPackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
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
		boolean browserInstance;
		System.out.println(currentDir);
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", currentDir + "/Drivers/chromedriver");
			driver = new ChromeDriver();
			browserInstance = true;
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", currentDir + "/Drivers/geckodriver");
			driver = new FirefoxDriver();
			browserInstance = true;
			break;
		default:
			System.out.println("Browser not launched");
			browserInstance = false;
		}
		driver.manage().window().maximize();
		System.out.println("Browser Status: " + browserInstance);
	}

	/*
	 * getSpecficURL() is used to hit the passed url as argument and validates the
	 * current url
	 */
	public void getSpecficURL(String Url) {
		driver.get(Url);
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals(Url + "/")) {
			System.out.println("The Url Loaded in Browser: " + driver.getCurrentUrl());
		} else {
			System.out.println("Current Url and Expected Url Mismatched");
			driver.close();
		}

	}

// Closes the browser
	public void closeBrowser() {
		driver.close();
		System.out.println("***Browser Closed***");
	}

	public void sendKeys(String element, String elementData) {
		driver.findElement(By.xpath(element)).sendKeys(elementData);
		System.out.println(elementData + " entered at given element " + element);
	}

	public void clearField(String element) {
		System.out.println("Default value at the field is: " + driver.findElement(By.xpath(element)).getText());
		driver.findElement(By.xpath(element)).clear();
		System.out.println("Value at the field after clearing is: " + driver.findElement(By.xpath(element)).getText());
	}

	public void clickButton(String element) {
		String buttonName = driver.findElement(By.xpath(element)).getText();
		driver.findElement(By.xpath(element)).click();
		System.out.println("Clicked on " + buttonName + " button");
	}

	public void submitButton(String element) {
		driver.findElement(By.xpath(element)).submit();
		System.out.println("Submitted Form of Element: " + element);
	}

	public void isDisplayedCheck(String element) {
		boolean check = driver.findElement(By.xpath(element)).isDisplayed();
		if (check) {
			System.out.println("Element passed: " + element + " as found");
		} else {
			System.out.println("Element passed: " + element + " as not found. Killing execution");
			driver.close();

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
			System.out.println("Given Element " + element + " of type XPath Found");
			break;
		case "cssselector":
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(element))));
			System.out.println("Given Element " + element + " of type cssSelector Found");
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
			System.out.println("Given Element " + element + " of type XPath Found");
			break;
		case "cssselector":
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(element))));
			System.out.println("Given Element " + element + " of type cssSelector Found");
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

	public void textCompare(String expectedText, String elementType, String element) {
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

	public void acceptAlert() {
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

	public void sendKeysAndAccept(String messageData) {
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys(messageData);
		driver.switchTo().alert().accept();
	}

	public void switchToTabByIndex(int indexValue) {
		ArrayList<String> tabsList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabsList.get(indexValue));
	}

	public void switchToTabByTitle(String expectedTabTitle) {
		String currentTabName = driver.getWindowHandle();
		ArrayList<String> tabsList = new ArrayList<String>(driver.getWindowHandles());
		for (String currentTab : tabsList) {
			if (driver.switchTo().window(currentTab).getTitle().equalsIgnoreCase(expectedTabTitle)) {
				System.out
						.println("Switched to: " + driver.getTitle() + " and the expected tab is: " + expectedTabTitle);
				break;
			} else {
				driver.switchTo().window(currentTabName);

			}
		}
	}

}
