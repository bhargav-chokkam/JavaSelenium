package seleniumPackage;


public class BaseClass extends GenericClass {
	static BaseClass obj;

	public static void main(String[] args) {
		obj = new BaseClass();
		obj.testMethod();

	}

	public void testMethod() {
		String browserName = "chrome";
		obj.setupBrowser(browserName);
		obj.getSpecficURL("//facebook/url");
//		o.sendKeys("//input[@id= 'email']", "bhargavchokkam");
//		o.clearField("//input[@id='email']");
//		o.clickButton("//button[@name='login']");
//		o.submitButton("//form[@data-testid='royal_login_form']");
//		o.isDisplayedCheck("//input[@id= 'email']");//Need to rework on this method
//		o.isEnabledCheck("//div[text()='Log In']");// Need to rework on this method
//		o.explicitTimeout("//div[text()='Log In']", 5);
//		o.scrollByLocation();
//		o.scrollTo();
//		o.scrollInToView("//a[text()='Instagram']");
//		
//		
//		o.closeBrowser();
		
	}

}
