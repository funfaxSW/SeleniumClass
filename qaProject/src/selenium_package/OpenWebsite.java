package selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("http://www.ebay.com/");
	}

}
