package seleniumPackage;

public class BaseClass extends GenericClass {

	public static void main(String[] args) {
		BaseClass obj = new BaseClass();
		obj.testMethod();

	}

	public void testMethod() {
		String browserName = "chrome";
		BaseClass o = new BaseClass();
		o.setupBrowser(browserName);
		o.getSpecficURL("https://www.facebook.com");
//		o.sendKeys("//input[@id= 'email']", "bhargavchokkam");
//		o.clearField("//input[@id='email']");
//		o.clickButton("//button[@name='login']");
//		o.submitButton("//form[@data-testid='royal_login_form']");
//		o.isDisplayedCheck("//input[@id= 'email']");//Need to rework on this method
//		o.isEnabledCheck("//div[text()='Log In']");// Need to rework on this method
//		o.explicitTimeout("//div[text()='Log In']", 5);
//		o.scrollByLocation();
//		o.scrollTo();
		o.scrollInToView("//a[text()='Instagram']");
		
		
//		o.closeBrowser();
		
	}

}
