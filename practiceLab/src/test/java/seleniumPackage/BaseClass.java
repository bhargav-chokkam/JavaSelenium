package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static void main(String[] args) throws InterruptedException {
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		System.setProperty("webdriver.chrome.driver", currentDir + "/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhargavchokkam@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password");

		driver.close();
	}

}
