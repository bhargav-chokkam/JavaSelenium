package seleniumPackage;

public class BaseClass extends GenericClass {

	public static void main(String[] args) {
		BaseClass obj = new BaseClass();
		obj.launchFB();

//		obj.closeBrowser();

	}

	public void launchFB() {
		BaseClass ob = new BaseClass();
		ob.setupBrowser("chrome");
		String Url = "https://www.facebook.com";
		ob.getSpecficURL(Url);
		ob.sendKeys("XPath", "//input[@id='email']", "bhargavchokkam");
		ob.clearField("XPath", "//input[@id='email']");
	}

}
