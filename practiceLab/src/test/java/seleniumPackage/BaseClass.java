package seleniumPackage;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

public class BaseClass extends GenericClasses {

	public static void main(String[] args) {
		BaseClass obj = new BaseClass();
		obj.setupBrowser();
		String Url = "https://www.facebook.com";
		obj.getSpecifURL(Url);
		obj.closeBrowser();

	}

}
