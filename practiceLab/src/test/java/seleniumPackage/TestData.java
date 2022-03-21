package seleniumPackage;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class TestData {
	
	public String readElement(String FacebookUrl) {
		File inputFile = new File(System.getProperty("user.dir") + "/SupportingFiles/properties.xml");
		SAXReader saxReader = new SAXReader();
		Document document = null;
		try {
			document = saxReader.read(inputFile);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		String mobileTesting = document.selectSingleNode(FacebookUrl).getText();
		return mobileTesting;
	}
}
