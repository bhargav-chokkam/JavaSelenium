package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericClass {
	WebDriver driver;

	/*
	 * SetUpBrowser() is used to launch the requested browser and maximizes the
	 * screen size
	 */
	public void setupBrowser() {
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		System.setProperty("webdriver.chrome.driver", currentDir + "/Drivers/chromedriver");
		driver = new ChromeDriver();
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
		case "id":
			driver.findElement(By.id(element)).sendKeys(elementData);
			break;
		case "classname":
			driver.findElement(By.className(element)).sendKeys(elementData);
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).sendKeys(elementData);
			break;
		case "name":
			driver.findElement(By.name(element)).sendKeys(elementData);
			break;

		default:
			System.out.println("XPath, Id, ClassName, Name and cssSelector are only Supported");
			break;
		}
	}

	public void clearField(String elementType, String element) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).clear();
			break;
		case "id":
			driver.findElement(By.id(element)).clear();
			break;
		case "classname":
			driver.findElement(By.className(element)).clear();
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).clear();
			break;

		case "name":
			driver.findElement(By.name(element)).clear();
			break;

		default:
			System.out.println("XPath, Id, ClassName, Name and cssSelector are only Supported");
			break;
		}
	}

	public void clickButton(String elementType, String element) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).click();
			break;
		case "id":
			driver.findElement(By.id(element)).click();
			break;
		case "classname":
			driver.findElement(By.className(elementType)).click();
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(elementType)).click();
			break;

		case "name":
			driver.findElement(By.name(element)).click();
			break;

		default:
			System.out.println("XPath, Id, ClassName, Name and cssSelector are only Supported");
			break;
		}
	}
	public void submitButton(String elementType, String element) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).submit();
			break;
		case "id":
			driver.findElement(By.id(element)).submit();
			break;
		case "classname":
			driver.findElement(By.className(element)).submit();
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).submit();
			break;

		case "name":
			driver.findElement(By.name(element)).submit();
			break;

		default:
			System.out.println("XPath, Id, ClassName, Name and cssSelector are only Supported");
			break;
		}
	}
	public void isDisplayedCheck(String elementType, String element) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).isDisplayed();
			break;
		case "id":
			driver.findElement(By.id(element)).isDisplayed();
			break;
		case "classname":
			driver.findElement(By.className(element)).isDisplayed();
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).isDisplayed();
			break;

		case "name":
			driver.findElement(By.name(element)).isDisplayed();
			break;

		default:
			System.out.println("XPath, Id, ClassName, Name and cssSelector are only Supported");
			break;
		}
	}
	public void isEnabledCheck(String elementType, String element) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).isEnabled();
			break;
		case "id":
			driver.findElement(By.id(element)).isEnabled();
			break;
		case "classname":
			driver.findElement(By.className(element)).isEnabled();
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).isEnabled();
			break;

		case "name":
			driver.findElement(By.name(element)).isEnabled();
			break;

		default:
			System.out.println("XPath, Id, ClassName, Name and cssSelector are only Supported");
			break;
		}
	}
	public void isSelectedCheck(String elementType, String element) {
		switch (elementType.toLowerCase()) {
		case "xpath":
			driver.findElement(By.xpath(element)).isSelected();
			break;
		case "id":
			driver.findElement(By.id(element)).isSelected();
			break;
		case "classname":
			driver.findElement(By.className(element)).isSelected();
			break;
		case "cssselector":
			driver.findElement(By.cssSelector(element)).isSelected();
			break;

		case "name":
			driver.findElement(By.name(element)).isSelected();
			break;

		default:
			System.out.println("XPath, Id, ClassName, Name and cssSelector are only Supported");
			break;
		}
	}

}
