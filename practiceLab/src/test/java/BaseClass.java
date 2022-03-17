import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		
//		System.setProperty("webdriver.gecko.driver",currentDir+"/Drivers/geckodriver");
//		WebDriver obj = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", currentDir + "/Drivers/geckodriver");
		obj = new FirefoxDriver();
		

	}

}
